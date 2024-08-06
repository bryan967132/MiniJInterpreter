package Classes.Instructions;
import Classes.Abstracts.Expression;
import Classes.Abstracts.Instruction;
import Classes.Env.Env;
import Classes.Utils.ReturnType;
import Classes.Utils.Type;
import Classes.Utils.TypeInst;
public class Case extends Instruction {
    Expression _case;
    Block block;
    ReturnType caseEvaluate;
    public Case(int line, int column, Expression _case, Block block) {
        super(line, column, TypeInst.CASE);
        this._case = _case;
        this.block = block;
    }
    public void setCase(ReturnType caseEvaluate) {
        this.caseEvaluate = caseEvaluate;
    }
    public ReturnType exec(Env env) {
        Env envCase = new Env(env, env.name + " Case");
        ReturnType case_ = _case.exec(envCase); 
        envCase.name += " " + case_.value.toString();
        if(compare(case_, caseEvaluate)) {
            ReturnType block = this.block.exec(envCase);
            if (block != null) {
                return block;
            }
        }
        return null;
    }
    public boolean compare(ReturnType value1, ReturnType value2) {
        if(value1.type1 == value2.type1) {
            if(value1.type1 == Type.INT) {
                return Integer.parseInt(value1.value.toString()) == Integer.parseInt(value2.value.toString());
            }
            if(value1.type1 == Type.DOUBLE) {
                return Double.parseDouble(value1.value.toString()) == Double.parseDouble(value2.value.toString());
            }
            if(value1.type1 == Type.BOOLEAN) {
                return Boolean.parseBoolean(value1.value.toString()) && Boolean.parseBoolean(value2.value.toString());
            }
            if(value1.type1 == Type.CHAR) {
                return ((int) value1.value.toString().charAt(0)) == ((int) value2.value.toString().charAt(0));
            }
            if(value1.type1 == Type.STRING) {
                return value1.value.toString().equals(value2.value.toString());
            }
        }
        return false;
    }
}