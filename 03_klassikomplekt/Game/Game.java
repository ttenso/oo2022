package Game;

import java.util.Arrays;
import java.util.Scanner;

public class Game {
    // main -- pakub
    public static void main(String[] args) {
    // sout -- pakub
        System.out.println("Hello Game.World");

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
        Player mangija1 = new Player(world.height,world.width);
        Player mangija2 = new Player(world.height,world.width);
        // uue instantsi loomine --- uue mälukohaga objekti tekitamine
        // kellel on kõik omadused mis on defineeritudtema klassis
        Enemy vaenlane1 = new Enemy(world.height,world.width);
        item sword = new item(world.height, world.width, ItemType.SWORD);
        item hammer = new item(world.height, world.width, ItemType.HAMMER);
        item dagger = new item(world.height, world.width, ItemType.DAGGER);
        world.items = Arrays.asList(sword, hammer, dagger);
        //       world.characters.add(mangija1);
        //       world.characters.add(vaenlane1);
        //     world.characters.add(sword);
        //        world.worldObjects.add(mangija1);
        //        world.worldObjects.add(vaenlane1);
        //       world.worldObjects.add(sword);


        world.printMap(mangija1.CoordinateY, mangija1.CoordinateX, vaenlane1.CoordinateY, vaenlane1.CoordinateX);

        //klasside tegemine tund nr2
        Scanner scanner = new Scanner(System.in);
        String input =scanner.nextLine();


        while (!input.equals("end")) {
            //kontrollib ühte muutujat mingite väärtuste vastu
            mangija1.movePlayer(input, world.height, world.width);
            for (item item:world.items) {
                if (item.CoordinateX == mangija1.CoordinateX && item.CoordinateY == mangija2.CoordinateY){
                    mangija1.additem(item);

                }
            }
            world.printMap(mangija1.CoordinateY, mangija1.CoordinateX, vaenlane1.CoordinateY, vaenlane1.CoordinateX);
            input =scanner.nextLine();
        }
    }

}
