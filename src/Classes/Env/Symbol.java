package Classes.Env;
import Classes.Utils.DataType;
import Classes.Utils.ReturnType;
public class Symbol {
    public ReturnType value;
    public String id;
    public DataType type;
    public Symbol(ReturnType value, String id, DataType type) {
        this.value = value;
        this.id = id;
        this.type = type;
    }
}