import java.util.Scanner;

public class Game {
    // main -- pakub
    public static void main(String[] args) {
    // sout -- pakub
        System.out.println("Hello World");

    // fori -- pakub
        // string -- sõnaline muutuja
        //char -- üks täht
        // double --15 kohaline komakohaga
        // float --7kohaline komakohaga
        // int -- täiskohaline
        // byte -- 128kohta
        // shot -- 32000kohta
        // Long --
        // booleaan

        // math.random() -- 0..0.99999
        World world = new World(5, 10);
        Player mangija1 = new Player(world.worldHeight,world.worldWidth);
        Player mangija2 = new Player(world.worldHeight,world.worldWidth);
        // uue instantsi loomine --- uue mälukohaga objekti tekitamine
        // kellel on kõik omadused mis on defineeritudtema klassis
        Enemy vaenlane1 = new Enemy(world.worldHeight,world.worldWidth);

        world.printMap( mangija1.CoordinateY, mangija1.CoordinateX, vaenlane1.CoordinateY, vaenlane1.CoordinateX);

        //klasside tegemine tund nr2
        Scanner scanner = new Scanner(System.in);
        String input =scanner.nextLine();


        while (!input.equals("end")) {
            //kontrollib ühte muutujat mingite väärtuste vastu
            mangija1.movePlayer(input, world.worldHeight, world.worldWidth);
            world.printMap(mangija1.CoordinateY, mangija1.CoordinateX, vaenlane1.CoordinateY, vaenlane1.CoordinateX);
            input =scanner.nextLine();
        }
    }

}
