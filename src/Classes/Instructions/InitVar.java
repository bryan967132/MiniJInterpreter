package Classes.Instructions;
import java.util.ArrayList;
import Classes.Abstracts.Instruction;
import Classes.Env.Env;
import Classes.Utils.DataType;
import Classes.Utils.IDValue;
import Classes.Utils.ReturnType;
import Classes.Utils.Type;
import Classes.Utils.TypeInst;
public class InitVar extends Instruction {
    ArrayList<IDValue> inits;
    DataType type;
    public InitVar(int line, int column, ArrayList<IDValue> inits, DataType type) {
        super(line, column, TypeInst.INITVAR);
        this.inits = inits;
        this.type = type;
    }
    public ReturnType exec(Env env) {
        for(IDValue idvalue : inits) {
            if(idvalue.value != null) {
                ReturnType value = idvalue.value.exec(env);
                if(value.type1 != Type.VECTOR && (value.type1 == type.type1 || type.type1 == Type.DOUBLE && value.type1 == Type.INT)) {
                    env.saveID(idvalue.id, value, type, line, column);
                    continue;
                }
                if(value.type1 == Type.VECTOR && value.type1 == type.type1 && (value.type2 == type.type2 || type.type2 == Type.DOUBLE && value.type2 == Type.INT) && value.dimensions == type.dimensions) {
                    if(type.type2 == Type.DOUBLE && value.type2 == Type.INT) {
                        value.intToDouble();
                    }
                    env.saveID(idvalue.id, value, value.getDataType(), line, column);
                    continue;
                }
                env.setError("Los tipos no coinciden en la declaración", line, column);
            }
            else {
                switch(type.type1) {
                    case INT:
                        env.saveID(idvalue.id, new ReturnType(0, type.type1), type, line, column);
                        break;
                    case DOUBLE:
                        env.saveID(idvalue.id, new ReturnType(0.0, type.type1), type, line, column);
                        break;
                    case BOOLEAN:
                        env.saveID(idvalue.id, new ReturnType(true, type.type1), type, line, column);
                        break;
                    case CHAR:
                        env.saveID(idvalue.id, new ReturnType('\0', type.type1), type, line, column);
                        break;
                    case STRING:
                        env.saveID(idvalue.id, new ReturnType("", type.type1), type, line, column);
                        break;
                    default:
                        env.saveID(idvalue.id, new ReturnType("null", Type.NULL, type.dimensions), type, line, column);
                        break;
                }
            }
        }
        return null;
    }
}