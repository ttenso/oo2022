import java.util.ArrayList;
import java.io.*;

public class List {
    ArrayList<Toiduaine> Toidunimekiri = new ArrayList<Toiduaine>();
    Toiduaine toiduaine;

    public boolean lisaListi() {
        Toidunimekiri.add(toiduaine);
        return true;
    }
    public boolean eemaldaListist() {
        Toidunimekiri.remove(toiduaine);
        return true;
    }

    public static void main(String args[]) throws IOException {
        File file = new File("Toidunimekiri.txt");
        file.createNewFile();
        FileWriter writer = new FileWriter(file);
    }

}
