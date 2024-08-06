package Classes.Instructions;
import Classes.Abstracts.Expression;
import Classes.Abstracts.Instruction;
import Classes.Env.Env;
import Classes.Utils.ReturnType;
import Classes.Utils.TypeInst;
public class While extends Instruction {
    private Expression condition;
    private Block block;
    public While(int line, int column, Expression condition, Block block) {
        super(line, column, TypeInst.WHILE);
        this.condition = condition;
        this.block = block;
    }
    public ReturnType exec(Env env) {
        Env envWhile = new Env(env, env.name + " While");
        ReturnType condition = this.condition.exec(envWhile);
        while(Boolean.parseBoolean(condition.value.toString())) {
            ReturnType block = this.block.exec(envWhile);
            if(block != null) {
                if(block.value == TypeInst.CONTINUE) {
                    condition = this.condition.exec(envWhile);
                    continue;
                }
                if(block.value == TypeInst.BREAK) {
                    break;
                }
                return block;
            }
            condition = this.condition.exec(envWhile);
        }
        return null;
    }
}