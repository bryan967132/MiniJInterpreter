package Classes.Expressions;
import java.util.ArrayList;
import Classes.Abstracts.Expression;
import Classes.Env.Env;
import Classes.Utils.ReturnType;
import Classes.Utils.Type;
import Classes.Utils.TypeExp;
public class Native extends Expression {
    String funcName;
    String vectorName;
    Expression param1;
    Expression param2;
    public Native(int line, int column, String funcName, Expression param1) {
        super(line, column, TypeExp.NATIVE);
        this.funcName = funcName;
        this.param1 = param1;
    }
    public Native(int line, int column, String funcName, Expression param1, Expression param2) {
        super(line, column, TypeExp.NATIVE);
        this.funcName = funcName;
        this.param1 = param1;
        this.param2 = param2;
    }
    public ReturnType exec(Env env) {
        return switch(funcName) {
            case "round" -> round(env);
            case "size" -> size(env);
            case "abs" -> abs(env);
            default -> new ReturnType("null", Type.NULL);
        };
    }
    public ReturnType round(Env env) {
        ReturnType value = this.param1.exec(env);
        if(value.type1 == Type.INT || value.type1 == Type.DOUBLE) {
            if(param2 != null) {
                ReturnType vector = this.param2.exec(env);
                return new ReturnType(Math.round(Double.parseDouble(value.value.toString()) * Math.pow(10, Integer.parseInt(vector.value.toString()))) / Math.pow(10, Integer.parseInt(vector.value.toString())), Type.DOUBLE);
            }
            return new ReturnType(Math.round(Double.parseDouble(value.value.toString())), Type.INT);
        }
        env.setError("El tipo de dato del argumento no es válido para \"round\"", this.param1.line, this.param1.column);
        return new ReturnType("null", Type.NULL);
    }
    @SuppressWarnings("unchecked")
    public ReturnType size(Env env) {
        ReturnType value = this.param1.exec(env);
        if(value.type1 == Type.STRING) {
            return new ReturnType(value.value.toString().length(), Type.INT);
        }
        if(value.type1 == Type.VECTOR) {
            return new ReturnType(((ArrayList<ReturnType>) value.value).size(), Type.INT);
        }
        env.setError("El tipo de dato del argumento no es válido para \"size\"", this.param1.line, this.param1.column);
        return new ReturnType("null", Type.NULL);
    }
    public ReturnType abs(Env env) {
        ReturnType value = this.param1.exec(env);
        if(value.type1 == Type.INT) {
            return new ReturnType(Math.abs(Integer.parseInt(value.value.toString())), value.type1);
        }
        if(value.type1 == Type.DOUBLE) {
            return new ReturnType(Math.abs(Double.parseDouble(value.value.toString())), value.type1);
        }
        env.setError("El tipo de dato del argumento no es válido para \"abs\"", this.param1.line, this.param1.column);
        return new ReturnType("null", Type.NULL);
    }
}