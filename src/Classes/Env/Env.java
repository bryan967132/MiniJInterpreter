package Classes.Env;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import Classes.Instructions.Function;
import Classes.Utils.ReturnType;
import Classes.Utils.Type;
import Classes.Utils.TypeError;
import Classes.Utils.DataType;
import Classes.Utils.Error;
import Classes.Utils.Outs;
public class Env {
    private Map<String, Symbol> ids = new TreeMap<>();
    private Map<String, Function> functions = new TreeMap<>();
    private Env previous;
    public String name;
    public Env(Env previous, String name) {
        this.previous = previous;
        this.name = name;
    }
    public boolean saveID(String id, ReturnType value, DataType type, int line, int column) {
        if(!this.ids.containsKey(id)) {
            this.ids.put(id, new Symbol(value, id, type));
            return true;
        }
        setError("Redeclaración de variable existente", line, column);
        return false;
    }
    public Symbol getValueID(String id, int line, int column) {
        Env current = this;
        while(current != null) {
            if(current.ids.containsKey(id)) {
                return current.ids.get(id);
            }
            current = current.previous;
        }
        setError("Acceso a variable inexistente. '" + id +"'", line, column);
        return null;
    }
    public Symbol getValueID(String id, ArrayList<Integer[]> pos, int line, int column) {
        Env current = this;
        while(current != null) {
            if(current.ids.containsKey(id)) {
                Symbol mySymbol = current.ids.get(id);
                if(mySymbol.value.type1 == Type.VECTOR) {
                    if(mySymbol.value.dimensions >= pos.size()) {
                        ReturnType r = mySymbol.value.getPos(current, id, pos);
                        if(r != null) {
                            return new Symbol(r, id, mySymbol.value.getDataType());
                        }
                        return null;
                    }
                    setError("Acceso por índices incorrecto, más de los necesarios. '" + id +"'", line, column);
                    return null;
                }
                setError("Acceso por índices a una variable de tipo diferente a Vector. '" + id +"'", line, column);
                return null;
            }
            current = current.previous;
        }
        setError("Acceso a variable inexistente. '" + id +"'", line, column);
        return null;
    }
    public boolean reassignID(String id, ReturnType value, int line, int column) {
        Env current = this;
        while(current != null) {
            if(current.ids.containsKey(id)) {
                Symbol mySymbol = current.ids.get(id);
                if(mySymbol.type.type1 != Type.VECTOR && (mySymbol.type.type1 == value.type1 || mySymbol.type.type1 == Type.DOUBLE && value.type1 == Type.INT)) {
                    mySymbol.value = value.getClone();
                    return true;
                }
                if(mySymbol.type.type1 == Type.VECTOR && mySymbol.type.type1 == value.type1 && (mySymbol.type.type2 == value.type2 || mySymbol.type.type2 == Type.DOUBLE && value.type2 == Type.INT) && mySymbol.value.dimensions == value.dimensions) {
                    mySymbol.value = value.getClone();
                    if(mySymbol.type.type2 == Type.DOUBLE && value.type2 == Type.INT) {
                        value.intToDouble();
                    }
                    return true;
                }
                if(value.type1 != Type.VECTOR) {
                    setError("Los tipos no coinciden en la asignación. Intenta asignar un '" + value.type1.getValue() + "' a un '" + mySymbol.type.type1.getValue() + "'", line, column);
                } else if(!(value.type2 == mySymbol.type.type2 || mySymbol.type.type2 == Type.DOUBLE && value.type2 == Type.INT)) {
                    setError("Los tipos no coinciden en la asignación. Intenta asignar un '" + value.type2.getValue() + "' a un '" + mySymbol.type.type2.getValue() + "'", line, column);
                } else {
                    setError("Las dimensiones del vector no es la esperada", line, column);
                }
                return false;
            }
            current = current.previous;
        }
        setError("Resignación de valor a variable inexistente", line, column);
        return false;
    }
    public boolean reassignID(String id, ArrayList<Integer[]> pos, ReturnType value, int line, int column) {
        Env current = this;
        while(current != null) {
            if(current.ids.containsKey(id)) {
                Symbol mySymbol = current.ids.get(id);
                if(mySymbol.value.type1 == Type.VECTOR) {
                    if(mySymbol.value.dimensions >= pos.size()) {
                        ReturnType r = mySymbol.value.getPos(current, id, pos);
                        if(r != null) {
                            if(r.type1 != Type.VECTOR && (r.type1 == value.type1 || r.type1 == Type.DOUBLE && value.type1 == Type.INT)) {
                                r.value = value.value;
                                return true;
                            }
                            if(r.type1 == Type.VECTOR && r.type1 == value.type1 && (r.type2 == value.type2 || r.type2 == Type.DOUBLE && value.type2 == Type.INT) && r.dimensions == value.dimensions) {
                                if(r.type2 == Type.DOUBLE && value.type2 == Type.INT) {
                                    value.intToDouble();
                                }
                                r.value = value.value;
                                return true;
                            }
                            if(value.type1 != Type.VECTOR) {
                                setError("Los tipos no coinciden en la asignación. Intenta asignar un '" + value.type1.getValue() + "' a un '" + r.type1.getValue() + "'", line, column);
                            } else if(!(value.type2 == r.type2 || r.type2 == Type.DOUBLE && value.type2 == Type.INT)) {
                                setError("Los tipos no coinciden en la asignación. Intenta asignar un '" + value.type2.getValue() + "' a un '" + r.type2.getValue() + "'", line, column);
                            } else {
                                setError("Las dimensiones del vector no es la esperada", line, column);
                            }
                        }
                        return false;
                    }
                    setError("Reasignación por índices incorrecto, más de los necesarios. '" + id +"'", line, column);
                    return false;
                }
                setError("Reasignación por índices a una variable de tipo diferente a Vector. '" + id +"'", line, column);
                return false;
            }
            current = current.previous;
        }
        setError("Resignación de valor a variable inexistente", line, column);
        return false;
    }
    public boolean saveFunction(Function func) {
        if(!this.functions.containsKey(func.id)) {
            this.functions.put(func.id, func);
            return true;
        }
        setError("Redefinición de función existente", func.line, func.column);
        return false;
    }
    public Function getFunction(String id, int line, int column) {
        Env current = this;
        while(current != null) {
            if(current.functions.containsKey(id)) {
                return current.functions.get(id);
            }
            current = current.previous;
        }
        setError("Acceso a función inexistente '" + id + "'", line, column);
        return null;
    }
    public Env getGlobal() {
        Env env = this;
        while(env.previous != null) {
            env = env.previous;
        }
        return env;
    }
    public void setPrint(String print) {
        Outs.printConsole.add(print);
    }
    public void setError(String errorD, int line, int column) {
        if(!match(errorD, line, column)) {
            Outs.errors.add(new Error(line, column, TypeError.SEMANTIC, errorD));
        }
    }
    public boolean match(String err, int line, int column) {
        for(Error s : Outs.errors) {
            if(s.toString().equals(new Error(line, column, TypeError.SEMANTIC, err).toString())) {
                return true;
            }
        }
        return false;
    }
}