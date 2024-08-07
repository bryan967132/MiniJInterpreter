package Classes.Expressions;
import Classes.Abstracts.Expression;
import Classes.Env.Env;
import Classes.Utils.ReturnType;
import Classes.Utils.Type;
import Classes.Utils.TypeExp;
public class Ternary extends Expression {
    private Expression condition;
    private Expression yes;
    private Expression no;
    public Ternary(int line, int column, Expression condition, Expression yes, Expression no) {
        super(line, column, TypeExp.TERNARY);
        this.condition = condition;
        this.yes = yes;
        this.no = no;
    }
    public ReturnType exec(Env env) {
        ReturnType condition = this.condition.exec(env);
        if(condition.type1 != Type.BOOLEAN) {
            env.setError("El tipo de dato de la condición no es aceptable", line, column);
            return new ReturnType("null", Type.NULL);
        }
        if(Boolean.parseBoolean(condition.value.toString())) {
            ReturnType yes = this.yes.exec(env);
            return yes;
        }
        ReturnType no = this.no.exec(env);
        return no;
    }
}