package Classes.Expressions;
import java.util.ArrayList;
import Classes.Abstracts.Expression;
import Classes.Env.Env;
import Classes.Instructions.Function;
import Classes.Utils.Parameter;
import Classes.Utils.ReturnType;
import Classes.Utils.Type;
import Classes.Utils.TypeExp;
public class CallFunction extends Expression {
    String id;
    ArrayList<Expression> args;
    public CallFunction(int line, int column, String id, ArrayList<Expression> args) {
        super(line, column, TypeExp.CALL_FUNC);
        this.id = id;
        this.args = args;
    }
    public ReturnType exec(Env env) {
        Function func = env.getFunction(id, this.line, this.column);
        if(func != null) {
            Env envFunc = new Env(env.getGlobal(), "Funcion " + id);
            if(func.params.size() == args.size()) {
                for(int i = 0; i < func.params.size(); i++) {
                    ReturnType value = args.get(i).exec(env);
                    Parameter param = func.params.get(i);
                    if(value.type == param.type || param.type == Type.DOUBLE && value.type == Type.INT) {
                        envFunc.saveID(param.id, value.value, param.type, this.line, this.column);
                        continue;
                    }
                    envFunc.setError("El tipo de dato del parámetro no es el esperado", param.line, param.column);
                    return null;
                }
                ReturnType execute = func.block.exec(envFunc);
                if(execute != null) {
                    if(execute.value == TypeExp.RETURN) {
                        return null;
                    }
                    return execute;
                }
                return null;
            }
            envFunc.setError("Cantidad errónea de parámetros enviados", this.line, this.column);
            return null;
        }
        return null;
    }
}