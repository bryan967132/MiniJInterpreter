package Classes.Instructions;
import java.util.ArrayList;
import Classes.Abstracts.Instruction;
import Classes.Env.Env;
import Classes.Utils.Parameter;
import Classes.Utils.ReturnType;
import Classes.Utils.DataType;
import Classes.Utils.TypeInst;
public class Function extends Instruction {
    public String id;
    public ArrayList<Parameter> params;
    public Block block;
    public DataType type;
    public Function(int line, int column, String id, ArrayList<Parameter> params, Block block, DataType type) {
        super(line, column, TypeInst.INITFUNC);
        this.id = id;
        this.params = params;
        this.block = block;
        this.type = type;
    }
    public ReturnType exec(Env env) {
        env.saveFunction(this);
        return null;
    }
}