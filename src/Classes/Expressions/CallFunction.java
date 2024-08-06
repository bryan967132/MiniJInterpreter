package Classes.Expressions;
import java.util.ArrayList;
import Classes.Abstracts.Expression;
import Classes.Env.Env;
import Classes.Instructions.Function;
import Classes.Utils.Parameter;
import Classes.Utils.ReturnType;
import Classes.Utils.Type;
import Classes.Utils.TypeExp;
public class CallFunction extends Expression {
    String id;
    ArrayList<Expression> args;
    public CallFunction(int line, int column, String id, ArrayList<Expression> args) {
        super(line, column, TypeExp.CALLFUNC);
        this.id = id;
        this.args = args;
    }
    public ReturnType exec(Env env) {
        Function func = env.getFunction(id, this.line, this.column);
        if(func != null) {
            Env envFunc = new Env(env.getGlobal(), "Funcion " + id);
            if(func.params.size() == args.size()) {
                for(int i = 0; i < func.params.size(); i ++) {
                    ReturnType value = args.get(i).exec(env);
                    Parameter param = func.params.get(i);
                    if(value.type1 != Type.VECTOR && (value.type1 == param.type.type1 || param.type.type1 == Type.DOUBLE && value.type1 == Type.INT)) {
                        envFunc.saveID(param.id, value, param.type, args.get(i).line, args.get(i).column);
                        continue;
                    }
                    if(value.type1 == Type.VECTOR && value.type1 == param.type.type1 && ((value.type2 == param.type.type2 || param.type.type2 == Type.DOUBLE && value.type2 == Type.INT) && value.dimensions == param.type.dimensions)) {
                        if(param.type.type2 == Type.DOUBLE && value.type2 == Type.INT) {
                            value.intToDouble();
                        }
                        envFunc.saveID(param.id, value, value.getDataType(), args.get(i).line, args.get(i).column);
                        continue;
                    }
                    if(value.type1 != Type.VECTOR) {
                        envFunc.setError("El tipo de dato del parámetro \"" + param.id + "\" no es el esperado", args.get(i).line, args.get(i).column);
                    } else if(!(value.type2 == param.type.type2 || param.type.type2 == Type.DOUBLE && value.type2 == Type.INT)) {
                        envFunc.setError("El tipo de dato del parámetro \"" + param.id + "\" no es el esperado", args.get(i).line, args.get(i).column);
                    } else {
                        envFunc.setError("Las dimensiones del parámetro \"" + param.id + "\" no es el esperado", args.get(i).line, args.get(i).column);
                    }
                    return null;
                }
                ReturnType execute = func.block.exec(envFunc);
                if(execute != null) {
                    if(execute.value == TypeExp.RETURN) {
                        return null;
                    }
                    if(func.type.type1 != Type.VECTOR && (func.type.type1 == execute.type1 || func.type.type1 == Type.DOUBLE && execute.type1 == Type.INT)) {
                        return execute;
                    }
                    if(func.type.type1 == Type.VECTOR && func.type.type1 == execute.type1 && (func.type.type2 == execute.type2 || func.type.type2 == Type.DOUBLE && execute.type2 == Type.INT) && func.type.dimensions == execute.dimensions) {
                        if(func.type.type2 == Type.DOUBLE && execute.type2 == Type.INT) {
                            execute.intToDouble();
                        }
                        return execute;
                    }
                    if(func.type.type1 != Type.VECTOR) {
                        envFunc.setError("El tipo de dato de retorno de la función \"" + id + "\" no es el esperado", func.line, func.column);
                    } else if(!(func.type.type2 == execute.type2 || func.type.type2 == Type.DOUBLE && execute.type2 == Type.INT)) {
                        envFunc.setError("El tipo de dato de retorno de la función \"" + id + "\" no es el esperado", func.line, func.column);
                    } else {
                        envFunc.setError("Las dimension del retorno de la función \"" + id + "\" no es el esperado", func.line, func.column);
                    }
                    return new ReturnType("null", Type.NULL);
                }
                return null;
            }
            envFunc.setError("Cantidad errónea de parámetros enviados", this.line, this.column);
            return null;
        }
        return null;
    }
}