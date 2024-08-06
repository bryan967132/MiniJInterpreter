package Classes.Utils;
import java.util.ArrayList;
import Classes.Abstracts.Expression;
public class IDPos {
    public int line;
    public int column;
    public String id;
    public ArrayList<Expression> pos;
    public IDPos(int line, int column, String id, ArrayList<Expression> pos) {
        this.line = line;
        this.column = column;
        this.id = id;
        this.pos = pos;
    }
}