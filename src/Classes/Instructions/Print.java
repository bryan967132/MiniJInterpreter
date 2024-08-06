package Classes.Instructions;
import Classes.Abstracts.Expression;
import Classes.Abstracts.Instruction;
import Classes.Env.Env;
import Classes.Utils.TypeInst;
import Classes.Utils.ReturnType;
public class Print extends Instruction {
    private Expression exp;
    private boolean newLine;
    public Print(int line, int column, Expression exp, boolean newLine) {
        super(line, column, TypeInst.PRINT);
        this.exp = exp;
        this.newLine = newLine;
    }
    public ReturnType exec(Env env) {
        String value = "";
        if(exp != null) {
            ReturnType value1 = exp.exec(env);
            value = value1.type1.ordinal() < 5 ? value1.value.toString() : value1.getObject();
        }
        env.setPrint(value + (newLine ? "\n" : ""));
        return null;
    }
}