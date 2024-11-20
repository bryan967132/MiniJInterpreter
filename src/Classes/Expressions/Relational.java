package Classes.Expressions;
import Classes.Abstracts.Expression;
import Classes.Env.Env;
import Classes.Utils.ReturnType;
import Classes.Utils.Type;
import Classes.Utils.TypeExp;
public class Relational extends Expression {
    private Expression exp1;
    private String sign;
    private Expression exp2;
    public Relational(int line, int column, Expression exp1, String sign, Expression exp2) {
        super(line, column, TypeExp.RELATIONAL);
        this.exp1 = exp1;
        this.sign = sign;
        this.exp2 = exp2;
    }
    public ReturnType exec(Env env) {
        return switch(this.sign) {
            case "==" -> equal(env);
            case "!=" -> notEqual(env);
            case ">=" -> greaterEqual(env);
            case "<=" -> lessEqual(env);
            case ">" -> greater(env);
            case "<" -> less(env);
            default -> new ReturnType("null", Type.NULL);
        };
    }
    public ReturnType equal(Env env) {
        ReturnType value1 = exp1.exec(env);
        ReturnType value2 = exp2.exec(env);
        if(value1.type1 == Type.INT || value1.type1 == Type.DOUBLE || value1.type1 == Type.CHAR) {
            if(value2.type1 == Type.INT || value2.type1 == Type.DOUBLE || value2.type1 == Type.CHAR) {
                value1 = getValue(value1);
                value2 = getValue(value2);
                return new ReturnType(Double.parseDouble(value1.value.toString()) == Double.parseDouble(value2.value.toString()), Type.BOOLEAN);
            }
            env.setError("Los tipos no son válidos para operaciones relacionales", exp2.line, exp2.column);
            return new ReturnType("null", Type.NULL);
        }
        if(value1.type1 == value2.type1 && value1.type1 == Type.STRING) {
            return new ReturnType(value1.value.toString().equals(value2.value.toString()), Type.BOOLEAN);
        }
        env.setError("Los tipos no son válidos para operaciones relacionales", exp1.line, exp1.column);
        return new ReturnType("null", Type.NULL);
    }
    public ReturnType notEqual(Env env) {
        ReturnType value1 = exp1.exec(env);
        ReturnType value2 = exp2.exec(env);
        if(value1.type1 == Type.INT || value1.type1 == Type.DOUBLE || value1.type1 == Type.CHAR) {
            if(value2.type1 == Type.INT || value2.type1 == Type.DOUBLE || value2.type1 == Type.CHAR) {
                value1 = getValue(value1);
                value2 = getValue(value2);
                return new ReturnType(Double.parseDouble(value1.value.toString()) != Double.parseDouble(value2.value.toString()), Type.BOOLEAN);
            }
            env.setError("Los tipos no son válidos para operaciones relacionales", exp2.line, exp2.column);
            return new ReturnType("null", Type.NULL);
        }
        if(value1.type1 == value2.type1 && value1.type1 == Type.STRING) {
            return new ReturnType(!value1.value.toString().equals(value2.value.toString()), Type.BOOLEAN);
        }
        env.setError("Los tipos no son válidos para operaciones relacionales", exp1.line, exp1.column);
        return new ReturnType("null", Type.NULL);
    }
    public ReturnType greaterEqual(Env env) {
        ReturnType value1 = exp1.exec(env);
        ReturnType value2 = exp2.exec(env);
        if(value1.type1 == Type.INT || value1.type1 == Type.DOUBLE || value1.type1 == Type.CHAR) {
            if(value2.type1 == Type.INT || value2.type1 == Type.DOUBLE || value2.type1 == Type.CHAR) {
                value1 = getValue(value1);
                value2 = getValue(value2);
                return new ReturnType(Double.parseDouble(value1.value.toString()) >= Double.parseDouble(value2.value.toString()), Type.BOOLEAN);
            }
            env.setError("Los tipos no son válidos para operaciones relacionales", exp2.line, exp2.column);
            return new ReturnType("null", Type.NULL);
        }
        if(value1.type1 == value2.type1 && value1.type1 == Type.STRING) {
            return new ReturnType(value1.value.toString().compareTo(value2.value.toString()) >= 0, Type.BOOLEAN);
        }
        env.setError("Los tipos no son válidos para operaciones relacionales", exp1.line, exp1.column);
        return new ReturnType("null", Type.NULL);
    }
    public ReturnType lessEqual(Env env) {
        ReturnType value1 = exp1.exec(env);
        ReturnType value2 = exp2.exec(env);
        if(value1.type1 == Type.INT || value1.type1 == Type.DOUBLE || value1.type1 == Type.CHAR) {
            if(value2.type1 == Type.INT || value2.type1 == Type.DOUBLE || value2.type1 == Type.CHAR) {
                value1 = getValue(value1);
                value2 = getValue(value2);
                return new ReturnType(Double.parseDouble(value1.value.toString()) <= Double.parseDouble(value2.value.toString()), Type.BOOLEAN);
            }
            env.setError("Los tipos no son válidos para operaciones relacionales", exp2.line, exp2.column);
            return new ReturnType("null", Type.NULL);
        }
        if(value1.type1 == value2.type1 && value1.type1 == Type.STRING) {
            return new ReturnType(value1.value.toString().compareTo(value2.value.toString()) <= 0, Type.BOOLEAN);
        }
        env.setError("Los tipos no son válidos para operaciones relacionales", exp1.line, exp1.column);
        return new ReturnType("null", Type.NULL);
    }
    public ReturnType greater(Env env) {
        ReturnType value1 = exp1.exec(env);
        ReturnType value2 = exp2.exec(env);
        if(value1.type1 == Type.INT || value1.type1 == Type.DOUBLE || value1.type1 == Type.CHAR) {
            if(value2.type1 == Type.INT || value2.type1 == Type.DOUBLE || value2.type1 == Type.CHAR) {
                value1 = getValue(value1);
                value2 = getValue(value2);
                return new ReturnType(Double.parseDouble(value1.value.toString()) > Double.parseDouble(value2.value.toString()), Type.BOOLEAN);
            }
            env.setError("Los tipos no son válidos para operaciones relacionales", exp2.line, exp2.column);
            return new ReturnType("null", Type.NULL);
        }
        if(value1.type1 == value2.type1 && value1.type1 == Type.STRING) {
            return new ReturnType(value1.value.toString().compareTo(value2.value.toString()) > 0, Type.BOOLEAN);
        }
        env.setError("Los tipos no son válidos para operaciones relacionales", exp1.line, exp1.column);
        return new ReturnType("null", Type.NULL);
    }
    public ReturnType less(Env env) {
        ReturnType value1 = exp1.exec(env);
        ReturnType value2 = exp2.exec(env);
        if(value1.type1 == Type.INT || value1.type1 == Type.DOUBLE || value1.type1 == Type.CHAR) {
            if(value2.type1 == Type.INT || value2.type1 == Type.DOUBLE || value2.type1 == Type.CHAR) {
                value1 = getValue(value1);
                value2 = getValue(value2);
                return new ReturnType(Double.parseDouble(value1.value.toString()) < Double.parseDouble(value2.value.toString()), Type.BOOLEAN);
            }
            env.setError("Los tipos no son válidos para operaciones relacionales", exp2.line, exp2.column);
            return new ReturnType("null", Type.NULL);
        }
        if(value1.type1 == value2.type1 && value1.type1 == Type.STRING) {
            return new ReturnType(value1.value.toString().compareTo(value2.value.toString()) < 0, Type.BOOLEAN);
        }
        env.setError("Los tipos no son válidos para operaciones relacionales", exp1.line, exp1.column);
        return new ReturnType("null", Type.NULL);
    }
    public ReturnType getValue(ReturnType value) {
        return value.type1 == Type.CHAR ? new ReturnType((int) value.value.toString().charAt(0), Type.INT) : value;
    }
}