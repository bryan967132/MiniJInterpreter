package Classes.Expressions;
import Classes.Abstracts.Expression;
import Classes.Env.Env;
import Classes.Utils.ReturnType;
import Classes.Utils.Type;
import Classes.Utils.TypeExp;
public class Logic extends Expression {
    private Expression exp1;
    private String sign;
    private Expression exp2;
    public Logic(int line, int column, Expression exp1, String sign, Expression exp2) {
        super(line, column, TypeExp.LOGIC_OP);
        this.exp1 = exp1;
        this.sign = sign;
        this.exp2 = exp2;
    }
    public ReturnType exec(Env env) {
        switch(this.sign) {
            case "&&":
                return and(env);
            case "||":
                return or(env);
            case "!":
                return not(env);
            default:
                return new ReturnType("null", Type.NULL);
        }
    }
    public ReturnType and(Env env) {
        ReturnType value1 = exp1.exec(env);
        if(value1.type != Type.BOOLEAN) {
            env.setError("Los tipos no son válidos para operaciones lógicas", exp1.line, exp1.column);
            return new ReturnType("null", Type.NULL);
        }
        ReturnType value2 = exp2.exec(env);
        if(value2.type == Type.BOOLEAN) {
            return new ReturnType(Boolean.parseBoolean(value1.value.toString()) && Boolean.parseBoolean(value2.value.toString()), Type.BOOLEAN);
        }
        env.setError("Los tipos no son válidos para operaciones lógicas", exp2.line, exp2.column);
        return new ReturnType("null", Type.NULL);
    }
    public ReturnType or(Env env) {
        ReturnType value1 = exp1.exec(env);
        if(value1.type != Type.BOOLEAN) {
            env.setError("Los tipos no son válidos para operaciones lógicas", exp1.line, exp1.column);
            return new ReturnType("null", Type.NULL);
        }
        ReturnType value2 = exp2.exec(env);
        if(value2.type == Type.BOOLEAN) {
            return new ReturnType(Boolean.parseBoolean(value1.value.toString()) || Boolean.parseBoolean(value2.value.toString()), Type.BOOLEAN);
        }
        env.setError("Los tipos no son válidos para operaciones lógicas", exp2.line, exp2.column);
        return new ReturnType("null", Type.NULL);
    }
    public ReturnType not(Env env) {
        ReturnType value2 = exp2.exec(env);
        if(value2.type == Type.BOOLEAN) {
            return new ReturnType(!Boolean.parseBoolean(value2.value.toString()), Type.BOOLEAN);
        }
        env.setError("Los tipos no son válidos para operaciones lógicas", exp2.line, exp2.column);
        return new ReturnType("null", Type.NULL);
    }
}