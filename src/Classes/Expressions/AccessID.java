package Classes.Expressions;
import Classes.Abstracts.Expression;
import Classes.Env.Env;
import Classes.Env.Symbol;
import Classes.Utils.ReturnType;
import Classes.Utils.Type;
import Classes.Utils.TypeExp;
public class AccessID extends Expression {
    private String id;
    public AccessID(int line, int column, String id) {
        super(line, column, TypeExp.ACCESS_ID);
        this.id = id;
    }
    public ReturnType exec(Env env) {
        Symbol value = env.getValueID(id, this.line, this.column);
        if(value != null) {
            return new ReturnType(value.value, value.type);
        }
        return new ReturnType("null", Type.NULL);
    }
}