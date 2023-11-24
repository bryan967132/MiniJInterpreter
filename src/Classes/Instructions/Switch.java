package Classes.Instructions;
import java.util.ArrayList;
import Classes.Abstracts.Expression;
import Classes.Abstracts.Instruction;
import Classes.Env.Env;
import Classes.Utils.ReturnType;
import Classes.Utils.TypeExp;
import Classes.Utils.TypeInst;
public class Switch extends Instruction {
    Expression arg;
    ArrayList<Case> cases;
    Block _default;
    public Switch(int line, int column, Expression arg, ArrayList<Case> cases, Block _default) {
        super(line, column, TypeInst.SWITCH);
        this.arg = arg;
        this.cases = cases;
        this._default = _default;
    }
    public ReturnType exec(Env env) {
        Env envSwitch = new Env(env, "Switch");
        if(cases != null) {
            ReturnType arg = this.arg.exec(env);
            for(Case case_ : cases) {
                case_.setCase(arg);
                ReturnType case_exec = case_.exec(envSwitch);
                if(case_exec != null) {
                    if(case_exec.value == TypeExp.RETURN) {
                        return null;
                    }
                    if(case_exec.value == TypeInst.BREAK) {
                        return null;
                    }
                    return case_exec;
                }
            }
        }
        if(_default != null) {
            ReturnType default_ = this._default.exec(env);
            if(default_ != null) {
                if(default_.value == TypeExp.RETURN) {
                    return null;
                }
                if(default_.value == TypeInst.BREAK) {
                    return null;
                }
                return default_;
            }
        }
        return null;
    }
}
