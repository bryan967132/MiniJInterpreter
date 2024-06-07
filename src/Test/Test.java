package Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import Classes.Abstracts.Instruction;
import Classes.Env.Env;
import Classes.Instructions.MainMethod;
import Classes.Utils.Outs;
import Classes.Utils.TypeInst;
import Language.ParseException;
import Language.Parser;
public class Test {
    public static void main(String[] args) throws ParseException, Exception {
        try {
            File archivo = new File("./Inputs/Ackermann.minij");
            InputStream inputStream = new FileInputStream(archivo);
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
            Parser parser = new Parser(inputStreamReader);
            ArrayList<Instruction> execute = parser.parse();
            Classes.Utils.Outs.printConsole = new ArrayList<>();
            Env global = new Env(null, "Global");
            MainMethod mainMethod = null;
            for (Instruction instruction : execute) {
                try {
                    if (instruction.typeInst == TypeInst.MAIN) {
                        mainMethod = (MainMethod) instruction;
                    } else {
                        instruction.exec(global);
                    }
                } catch (Exception e) {}
            }
            if (mainMethod != null) {
                mainMethod.exec(global);
            }
            System.out.println(Outs.getStringOuts());
        }
        catch(ParseException e) {
            System.out.println(e);
        }
    }
}
