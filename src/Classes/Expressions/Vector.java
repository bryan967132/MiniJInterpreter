package Classes.Expressions;
import java.util.ArrayList;
import Classes.Abstracts.Expression;
import Classes.Env.Env;
import Classes.Utils.ReturnType;
import Classes.Utils.Type;
import Classes.Utils.TypeExp;
public class Vector extends Expression {
    private ArrayList<Expression> values;
    private Type type2;
    public Vector(int line, int column, ArrayList<Expression> values) {
        super(line, column, TypeExp.VECTOR);
        this.values = values;
    }
    public ReturnType exec(Env env) {
        ArrayList<ReturnType> vector = getVector(env, values);
        if(vector != null) {
            return new ReturnType(vector, Type.VECTOR, type2, vector.size() > 0 ? vector.get(0).dimensions + 1 : 1);
        }
        return new ReturnType("null", Type.NULL);
    }
    @SuppressWarnings("unchecked")
    public ArrayList<ReturnType> getVector(Env env, ArrayList<Expression> values) {
        ArrayList<ReturnType> vector = new ArrayList<>();
        ReturnType value;
        for(Expression v : values) {
            value = v.exec(env);
            if(type2 == null || type2 == Type.INT && value.type1 == Type.DOUBLE || type2 == Type.INT && value.type2 == Type.DOUBLE) {
                if(value.type1 != Type.VECTOR) {
                    type2 = value.type1;
                } else {
                    type2 = value.type2;
                }
            }
            if(type2 == value.type1 || type2 == Type.DOUBLE && value.type1 == Type.INT) {
                value.type1 = type2;
                vector.add(value);
            } else if(value.type1 == Type.VECTOR && (type2 == value.type2 || type2 == Type.DOUBLE && value.type2 == Type.INT)) {
                if(type2 == Type.DOUBLE && value.type2 == Type.INT) {
                    vector = (ArrayList<ReturnType>) new ReturnType(vector, Type.VECTOR, type2).intToDouble().value;
                    value.intToDouble();
                }
                vector.add(value);
            } else {
                env.setError("Los tipos no coinciden en el vector", v.line, v.column);
                return null;
            }
        }
        return vector;
    }
}