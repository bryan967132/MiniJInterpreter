package Classes.Utils;
import java.util.ArrayList;
import java.util.stream.Collectors;
import Classes.Env.Env;
public class ReturnType {
    public Object value;
    public Type type1;
    public Type type2;
    public int dimensions;
    public ReturnType(Object value, Type type1) {
        this.value = value;
        this.type1 = type1;
    }
    public ReturnType(Object value, Type type1, int dimensions) {
        this.value = value;
        this.type1 = type1;
        this.dimensions = dimensions;
    }
    public ReturnType(Object value, Type type1, Type type2) {
        this.value = value;
        this.type1 = type1;
        this.type2 = type2;
    }
    public ReturnType(Object value, Type type1, Type type2, int dimensions) {
        this.value = value;
        this.type1 = type1;
        this.type2 = type2;
        this.dimensions = dimensions;
    }
    public ReturnType getClone() {
        return new ReturnType(value, type1, type2, dimensions);
    }
    @SuppressWarnings("unchecked")
    public ReturnType intToDouble() {
        if(type1.ordinal() < 5) {
            type1 = Type.DOUBLE;
            value = Double.parseDouble(value.toString());
            return this;
        }
        for(ReturnType r : (ArrayList<ReturnType>) value) {
            r.intToDouble();
            r.type2 = Type.DOUBLE;
        }
        type2 = Type.DOUBLE;
        return this;
    }
    public DataType getDataType() {
        return new DataType(type1, type2, dimensions);
    }
    public String toString() {
        return value.toString();
    }
    @SuppressWarnings("unchecked")
    public String getObject() {
        if(type1 != Type.NULL) {
            if(type1.ordinal() < 5) {
                return type1.getValue() + "=" + value;
            }
            return type1.getValue() + (dimensions != 0 ? ":" + dimensions : "") + (type2 != null ? "(" + type2.getValue() + ")" : "") + "=[" + ((ArrayList<ReturnType>) value).stream().map(ReturnType::getObject).collect(Collectors.joining(", ")) + "]";
        }
        return value.toString();
    }
    @SuppressWarnings("unchecked")
    public ReturnType getPos(Env env, String id, ArrayList<Integer[]> pos) {
        if(pos.size() > 0) {
            if(type1 == Type.VECTOR) {
                ArrayList<ReturnType> v = (ArrayList<ReturnType>) value;
                Integer[] p = pos.remove(0);
                if(v.size() > p[0]) {
                    return v.get(p[0]).getPos(env, id, pos);
                }
                env.setError("Índice fuera de rango en vector '" + id + "'", pos.get(0)[1], pos.get(0)[2]);
                return new ReturnType("null", Type.NULL);
            }
        }
        return this;
    }
}