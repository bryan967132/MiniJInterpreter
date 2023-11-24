package Classes.Instructions;
import java.util.ArrayList;
import Classes.Abstracts.Expression;
import Classes.Abstracts.Instruction;
import Classes.Abstracts.Sentence;
import Classes.Env.Env;
import Classes.Utils.ReturnType;
import Classes.Utils.TypeExp;
import Classes.Utils.TypeInst;
import Classes.Utils.TypeSent;
public class Block extends Instruction {
    ArrayList<Sentence> instructions;
    public Block(int line, int column, ArrayList<Sentence> instructions) {
        super(line, column, TypeInst.BLOCK_INST);
        this.instructions = instructions;
    }
    public ReturnType exec(Env env) {
        Env newEnv = new Env(env, env.name);
        Expression exp;
        Instruction inst;
        ReturnType ret;
        for(Sentence instruction : instructions) {
            if(instruction.typeSent == TypeSent.EXPRESSION) {
                exp = (Expression) instruction;
                ret = exp.exec(newEnv);
                if(ret != null && exp.typeExp != TypeExp.INC && exp.typeExp != TypeExp.DEC) {
                    return ret;
                }
            } else if(instruction.typeSent == TypeSent.INSTRUCTION) {
                inst = (Instruction) instruction;
                ret = inst.exec(newEnv);
                if(ret != null) {
                    return ret;
                }
            }
        }
        return null;
    }
}