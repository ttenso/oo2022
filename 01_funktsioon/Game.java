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
        int worldHeight = 5;
        int worldWidth = 10;
        // math.random() -- 0..0.99999
        int playerCoordinateY = generateRandomCoordinate(worldHeight);
        int playerCoordinateX = generateRandomCoordinate(worldHeight);
        int enemyCoordinateY = generateRandomCoordinate(worldHeight);
        int enemyCoordinateX = generateRandomCoordinate(worldHeight);

        printMap(worldHeight, worldWidth, playerCoordinateY, playerCoordinateX, enemyCoordinateY, enemyCoordinateX);

        //klasside tegemine tund nr2
        Scanner scanner = new Scanner(System.in);
        String input =scanner.nextLine();


        while (!input.equals("end")) {
            //kontrollib ühte muutujat mingite väärtuste vastu
            switch (input) {
                case "a":
                    playerCoordinateX--;
                    break;
                case "s":
                    playerCoordinateX++;
                    break;
                case "d":
                    playerCoordinateX++;
                    break;
                case "aw":
                    playerCoordinateX--;
                    break;
            }
            printMap(worldHeight, worldWidth, playerCoordinateY, playerCoordinateX, enemyCoordinateY, enemyCoordinateX);
            input =scanner.nextLine();
        }
    }
    // int -- sama tüüp mis peab olema funkt sees return järgi
    public static int generateRandomCoordinate(int worldSize) {
        return (int) (Math.random()*(worldSize-2))+1;
    }

    public static void printMap(int worldHeight, int worldWidth, int playerCoordinateY, int playerCoordinateX, int enemyCoordinateY, int enemyCoordinateX) {

        char symbol;               // deklareerib 1x muutuja
        for (int y = 0; y < worldHeight; y++) {
            for (int x = 0; x < worldWidth; x++) {
                if (y == 0 || y == worldHeight-1) { // primitiiv|| AB päring
                    symbol = '-';
                } else if (x == 0 || x == worldWidth-1) {
                    symbol = '|';
                } else {
                    symbol = ' ';
                }
                if (playerCoordinateY == y && playerCoordinateX == x) {
                    symbol = 'x';
                }
                if (enemyCoordinateY == y && enemyCoordinateX == x){
                    symbol = 'z';
                }
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}
