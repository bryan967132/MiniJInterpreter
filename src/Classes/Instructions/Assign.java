package Classes.Instructions;
import java.util.ArrayList;
import Classes.Abstracts.Expression;
import Classes.Abstracts.Instruction;
import Classes.Env.Env;
import Classes.Utils.IDPos;
import Classes.Utils.ReturnType;
import Classes.Utils.Type;
import Classes.Utils.TypeInst;
public class Assign extends Instruction {
    private String id;
    private Expression value;
    private ArrayList<Expression> pos;
    public Assign(int line, int column, IDPos idPos, Expression value) {
        super(line, column, TypeInst.ASIGN);
        this.id = idPos.id;
        this.pos = idPos.pos;
        this.value = value;
    }
    public ReturnType exec(Env env) {
        ReturnType value = this.value.exec(env);
        if(pos == null) {
            env.reasignID(id, value, this.line, this.column);
        } else {
            ArrayList<Integer[]> pos = new ArrayList<>();
            ReturnType index;
            for(Expression e : this.pos) {
                index = e.exec(env);
                if(index.type1 != Type.INT) {
                    env.setError("Los índices deben ser de tipo 'int'", e.line, e.column);
                    return new ReturnType("null", Type.NULL);
                }
                pos.add(new Integer[] {Integer.parseInt(index.value.toString()), e.line, e.column});
            }
            env.reasignID(id, pos, value, this.line, this.column);
        }
        return null;
    }
}