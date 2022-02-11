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
        int wolrdHeight = 5;
        int worldWidth = 10;
        char symbol;               // deklareerib 1x muutuja
        for (int y = 0; y < wolrdHeight; y++) {
            for (int x = 0; x < worldWidth; x++) {
                if (y == 0 || y == wolrdHeight-1) { // primitiiv|| AB päring
                    symbol = '-';
                } else if (x == 0 || x == worldWidth-1) {
                    symbol = '|';
                } else {
                    symbol = ' ';
                }
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}
