package Classes.Instructions;
import Classes.Abstracts.Expression;
import Classes.Abstracts.Instruction;
import Classes.Env.Env;
import Classes.Expressions.AccessID;
import Classes.Expressions.Arithmetic;
import Classes.Utils.ReturnType;
import Classes.Utils.TypeInst;
public class AddSub extends Instruction {
    private String id;
    private String sign;
    private Expression exp;
    public AddSub(int line, int column, String id, String sign, Expression exp) {
        super(line, column, sign.equals("+=") ? TypeInst.ADD : TypeInst.SUB);
        this.id = id;
        this.sign = sign;
        this.exp = exp;
    }
    public ReturnType exec(Env env) {
        switch(this.sign) {
            case "+=":
                env.reasignID(
                    id,
                    new Arithmetic(line, column,
                        new AccessID(line, column, id),
                        "+",
                        exp
                    ).exec(env),
                    this.line, this.column
                );
                break;
            case "-=":
                env.reasignID(
                    id,
                    new Arithmetic(line, column,
                        new AccessID(line, column, id),
                        "-",
                        exp
                    ).exec(env),
                    this.line, this.column
                );
                break;
        }
        return null;
    }
}