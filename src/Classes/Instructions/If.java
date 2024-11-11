package Classes.Instructions;
import Classes.Abstracts.Expression;
import Classes.Abstracts.Instruction;
import Classes.Abstracts.Statement;
import Classes.Env.Env;
import Classes.Utils.ReturnType;
import Classes.Utils.TypeInst;
public class If extends Instruction {
    Expression condition;
    Block block;
    Statement except;
    public If(int line, int column, Expression condition, Block block, Statement except) {
        super(line, column, TypeInst.IF);
        this.condition = condition;        
        this.block = block;        
        this.except = except;        
    }
    public ReturnType exec(Env env) {
        Env envIf = new Env(env, env.name + " If");
        ReturnType condition = this.condition.exec(envIf);
        if(Boolean.parseBoolean(condition.value.toString())) {
            ReturnType block = this.block.exec(envIf);
            if(block != null) {
                return block;
            }
            return null;
        }
        if(except != null) {
            ReturnType except = this.except.exec(envIf);
            if(except != null) {
                return except;
            }
        }
        return null;
    }
}