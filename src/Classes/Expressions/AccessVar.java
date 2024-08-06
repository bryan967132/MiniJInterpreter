package Classes.Expressions;
import java.util.ArrayList;
import Classes.Abstracts.Expression;
import Classes.Env.Env;
import Classes.Env.Symbol;
import Classes.Utils.IDPos;
import Classes.Utils.ReturnType;
import Classes.Utils.Type;
import Classes.Utils.TypeExp;
public class AccessVar extends Expression {
    private String id;
    private ArrayList<Expression> pos;
    public AccessVar(int line, int column, IDPos idPos) {
        super(line, column, TypeExp.ACCESSVAR);
        this.id = idPos.id;
        this.pos = idPos.pos;
    }
    public ReturnType exec(Env env) {
        Symbol value;
        if(pos == null) {
            value = env.getValueID(id, this.line, this.column);
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
            value = env.getValueID(id, pos, this.line, this.column);
        }
        if(value != null) {
            return value.value;
        }
        return new ReturnType("null", Type.NULL);
    }
}