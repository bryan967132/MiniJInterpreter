package Classes.Instructions;
import Classes.Abstracts.Expression;
import Classes.Abstracts.Instruction;
import Classes.Env.Env;
import Classes.Utils.TypeInst;
import Classes.Utils.ReturnType;
public class Print extends Instruction {
    Expression exp;
    public Print(int line, int column, Expression exp) {
        super(line, column, TypeInst.PRINT);
        this.exp = exp;
    }
    public ReturnType exec(Env env) {
        String value = "";
        if(exp != null) {
            ReturnType value1 = exp.exec(env);
            value = value1.value.toString();
        }
        env.setPrint(value);
        return null;
    }
}