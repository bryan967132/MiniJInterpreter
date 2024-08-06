package Classes.Expressions;
import Classes.Abstracts.Expression;
import Classes.Env.Env;
import Classes.Utils.ReturnType;
import Classes.Utils.Type;
import Classes.Utils.TypeExp;
public class Primitive extends Expression {
    public Object value;
    Type type;
    public Primitive(int line, int column, Object value, Type type) {
        super(line, column, TypeExp.PRIMITIVE);
        this.value = value;
        this.type = type;
    }
    public ReturnType exec(Env env) {
        return switch(type) {
            case INT -> new ReturnType(Integer.parseInt(value.toString()), type);
            case DOUBLE -> new ReturnType(Double.parseDouble(value.toString()), type);
            case BOOLEAN -> new ReturnType(value.toString().equals("true"), type);
            default -> new ReturnType(getValueStr(), type);
        };
    }
    public String getValueStr() {
        return value.toString()
            .replace("\\n", "\n")
            .replace("\\t", "\t")
            .replace("\\\"", "\"")
            .replace("\\'", "\'")
            .replace("\\\\", "\\");
    }
}