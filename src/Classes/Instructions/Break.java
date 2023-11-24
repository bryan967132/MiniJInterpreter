package Classes.Instructions;
import Classes.Abstracts.Instruction;
import Classes.Env.Env;
import Classes.Utils.ReturnType;
import Classes.Utils.Type;
import Classes.Utils.TypeInst;
public class Break extends Instruction {
    public Break(int line, int column) {
        super(line, column, TypeInst.BREAK);
    }
    public ReturnType exec(Env env) {
        return new ReturnType(this.typeInst, Type.NULL);
    }
}