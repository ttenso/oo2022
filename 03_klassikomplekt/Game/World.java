package Game;

import Game.Character;
import Game.WorldObject;
import Game.item;

import java.util.List;

public class World implements WorldObject {
    int height = 5;
    int width = 10;
    List<item> items;
    List<WorldObject> worldObjects;
    List<Character> characters;

    public World(int height, int width) {
        this.height = height;
        this.width = width;

    }
    // int -- sama tüüp mis peab olema funkt sees return järgi
    public int generateRandomCoordinate(int worldSize) {
        return (int) (Math.random()*(worldSize-2))+1;
    }

    public void printMap(int playerCoordinateY, int playerCoordinateX, int enemyCoordinateY, int enemyCoordinateX) {

        char symbol;               // deklareerib 1x muutuja
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                if (y == 0 || y == height -1) { // primitiiv|| AB päring
                    symbol = '-';
                } else if (x == 0 || x == width -1) {
                    symbol = '|';
                } else {
                    symbol = ' ';
                }
                for (item item : items) {
                    if (item.CoordinateY == y && item.CoordinateX == x) {
                        symbol = 'I';
                        break;
                    }
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

