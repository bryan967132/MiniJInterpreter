package Classes.Expressions;
import java.util.ArrayList;
import Classes.Abstracts.Expression;
import Classes.Env.Env;
import Classes.Env.Symbol;
import Classes.Utils.IDPos;
import Classes.Utils.ReturnType;
import Classes.Utils.Type;
import Classes.Utils.TypeExp;
public class IncDec extends Expression {
    private IDPos idPos;
    private String sign;
    public IncDec(int line, int column, IDPos idPos, String sign) {
        super(line, column, sign.equals("++") ? TypeExp.INC : TypeExp.DEC);
        this.idPos = idPos;
        this.sign = sign;
    }
    public ReturnType exec(Env env) {
        if(this.idPos.pos == null) {
            env.reasignID(
                idPos.id,
                new Arithmetic(line, column,
                    new AccessVar(line, column, idPos),
                    switch(sign) {
                        case "++" -> "+";
                        default -> "-";
                    },
                    new Primitive(line, column, "1", Type.INT)
                ).exec(env),
                this.line, this.column
            );
            Symbol s = env.getValueID(idPos.id, line, column);
            if(s != null) {
                return s.value;
            }
            return new ReturnType("null", Type.NULL);
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
        env.reasignID(
            idPos.id,
            pos,
            new Arithmetic(line, column,
                new AccessVar(line, column, idPos),
                switch(sign) {
                    case "++" -> "+";
                    default -> "-";
                },
                new Primitive(line, column, "1", Type.INT)
            ).exec(env),
            this.line, this.column
        );
        Symbol s = env.getValueID(idPos.id, line, column);
        if(s != null) {
            return s.value;
        }
        return new ReturnType("null", Type.NULL);
    }
}