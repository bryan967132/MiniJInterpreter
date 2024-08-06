package Classes.Utils;
public class DataType {
    public Type type1;
    public Type type2;
    public int dimensions;
    public DataType(Type type1) {
        this.type1 = type1;
    }
    public DataType(Type type1, Type type2) {
        this.type1 = type1;
        this.type2 = type2;
    }
    public DataType(Type type1, Type type2, int dimensions) {
        this.type1 = type1;
        this.type2 = type2;
        this.dimensions = dimensions;
    }
    public String toString() {
        return type1 + " " + type2 + " " + dimensions;
    }
}