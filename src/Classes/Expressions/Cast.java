package Classes.Expressions;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import Classes.Abstracts.Expression;
import Classes.Env.Env;
import Classes.Utils.ReturnType;
import Classes.Utils.Type;
import Classes.Utils.TypeExp;
public class Cast extends Expression {
    private Expression param;
    private Type destiny;
    public Cast(int line, int column, Expression param, Type destiny) {
        super(line, column, TypeExp.CAST);
        this.param = param;
        this.destiny = destiny;
    }
    public ReturnType exec(Env env) {
        ReturnType value = param.exec(env);
        if(value.type1 != Type.NULL) {
            if(destiny == Type.INT) {
                if(value.type1 == Type.DOUBLE) {
                    return new ReturnType((int) Double.parseDouble(value.value.toString()), destiny);
                }
                if(value.type1 == Type.STRING) {
                    if(isValidIntString(value.value.toString())) {
                        return new ReturnType(Integer.parseInt(value.value.toString()), destiny);
                    }
                    env.setError("La cadena \"" + value.value + "\" no tiene formato numérico entero para castear a \"" + destiny.getValue() + "\"", param.line, param.column);
                    return new ReturnType("null", Type.NULL);
                }
                if(value.type1 == Type.CHAR) {
                    return new ReturnType((int) value.value.toString().charAt(0), destiny);
                }
                env.setError("No hay casteo de \"" + value.type1.getValue() + "\" a \"" + destiny.getValue() + "\"", param.line, param.column);
                return new ReturnType("null", Type.NULL);
            }
            if(destiny == Type.DOUBLE) {
                if(value.type1 == Type.INT) {
                    return new ReturnType(Double.parseDouble(value.value.toString()), destiny);
                }
                if(value.type1 == Type.STRING) {
                    if(isValidIntString(value.value.toString()) || isValidDoubleString(value.value.toString())) {
                        return new ReturnType(Double.parseDouble(value.value.toString()), destiny);
                    }
                    env.setError("La cadena \"" + value.value + "\" no tiene formato numérico para castear a \"" + destiny.getValue() + "\"", param.line, param.column);
                    return new ReturnType("null", Type.NULL);
                }
                env.setError("No hay casteo de \"" + value.type1.getValue() + "\" a \"" + destiny.getValue() + "\"", param.line, param.column);
                return new ReturnType("null", Type.NULL);
            }
            if(destiny == Type.STRING) {
                if(value.type1 != Type.BOOLEAN && value.type1 != Type.STRING) {
                    return new ReturnType(value.value.toString(), destiny);
                }
                if(value.type1 == Type.VECTOR) {
                    return new ReturnType(value.toString(), destiny);
                }
                env.setError("No hay casteo de \"" + value.type1.getValue() + "\" a \"" + destiny.getValue() + "\"", param.line, param.column);
                return new ReturnType("null", Type.NULL);
            }
            if(destiny == Type.CHAR) {
                if(value.type1 == Type.INT) {
                    if(Integer.parseInt(value.value.toString()) >= 0 && Integer.parseInt(value.value.toString()) <= 255) {
                        return new ReturnType((char) Integer.parseInt(value.value.toString()), destiny);
                    }
                    env.setError("El entero " + value.value + " no está en el rango [0-255] para castear a \"" + destiny.getValue() + "\"", param.line, param.column);
                    return new ReturnType("null", Type.NULL);
                }
                if(value.type1 == Type.STRING) {
                    if(value.value.toString().length() == 1) {
                        return new ReturnType(value.value.toString().charAt(0), destiny);
                    }
                    env.setError("La cadena \"" + value.value + "\" tiene longitud diferente de 1 para castear a \"" + destiny.getValue() + "\"", param.line, param.column);
                    return new ReturnType("null", Type.NULL);
                }
            }
            env.setError("No hay casteo de \"" + value.type1.getValue() + "\" a \"" + destiny.getValue() + "\"", param.line, param.column);
            return new ReturnType("null", Type.NULL);
        }
        env.setError("Error: No hay casteo de valores null", line, column);
        return new ReturnType("null", Type.NULL);
    }
    private boolean isValidIntString(String num) {
        String expresionRegular = "^\\d+$";
        Pattern patternValidador = Pattern.compile(expresionRegular);
        Matcher matcher = patternValidador.matcher(num);
        return matcher.matches();
    }
    private boolean isValidDoubleString(String num) {
        String expresionRegular = "^\\d+\\.\\d+$";
        Pattern patternValidador = Pattern.compile(expresionRegular);
        Matcher matcher = patternValidador.matcher(num);
        return matcher.matches();
    }
}