package Classes.Instructions;
import java.util.ArrayList;
import Classes.Abstracts.Expression;
import Classes.Abstracts.Instruction;
import Classes.Env.Env;
import Classes.Expressions.AccessVar;
import Classes.Expressions.Arithmetic;
import Classes.Utils.IDPos;
import Classes.Utils.ReturnType;
import Classes.Utils.Type;
import Classes.Utils.TypeInst;
public class AssignComp extends Instruction {
    private IDPos idPos;
    private String sign;
    private Expression exp;
    public AssignComp(int line, int column, IDPos idPos, String sign, Expression exp) {
        super(line, column, switch(sign) {
            case "+=" -> TypeInst.PLUSC;
            case "-=" -> TypeInst.MINUSC;
            case "*=" -> TypeInst.MULTC;
            case "/=" -> TypeInst.DIVC;
            default -> TypeInst.MODC;
        });
        this.idPos = idPos;
        this.sign = sign;
        this.exp = exp;
    }
    public ReturnType exec(Env env) {
        if(this.idPos.pos == null) {
            env.reassignID(
                idPos.id,
                new Arithmetic(line, column,
                    new AccessVar(line, column, idPos),
                    switch(sign) {
                        case "+=" -> "+";
                        case "-=" -> "-";
                        case "*=" -> "*";
                        case "/=" -> "/";
                        default -> "%";
                    },
                    exp
                ).exec(env),
                this.line, this.column
            );
            return null;
        }
        ArrayList<Integer[]> pos = new ArrayList<>();
        ReturnType index;
        for(Expression e : this.idPos.pos) {
            index = e.exec(env);
            if(index.type1 != Type.INT) {
                env.setError("Los índices deben ser de tipo 'int'", e.line, e.column);
                return new ReturnType("null", Type.NULL);
            }
            pos.add(new Integer[] {Integer.parseInt(index.value.toString()), e.line, e.column});
        }
        env.reassignID(
            idPos.id,
            pos,
            new Arithmetic(line, column,
                new AccessVar(line, column, idPos),
                switch(sign) {
                    case "+=" -> "+";
                    case "-=" -> "-";
                    case "*=" -> "*";
                    case "/=" -> "/";
                    default -> "%";
                },
                exp
            ).exec(env),
            this.line, this.column
        );
        return null;
    }
}