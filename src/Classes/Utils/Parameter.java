package Classes.Utils;
public class Parameter {
    public int line;
    public int column;
    public String id;
    public DataType type;
    public Parameter(int line, int column, String id, DataType type) {
        this.line = line;
        this.column = column;
        this.id = id;
        this.type = type;
    }
}