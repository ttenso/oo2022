public class Player extends Character implements WorldObject {
    Direction direction;
    item item;

    // Constructor
    public Player(int worldHeight, int worldWidth){
       super(worldHeight, worldWidth);
        this.direction = Direction.UP;
    }

    public void additem(item item) {
        this.item = item;
        System.out.println("mängija sai eseme +" + item.itemType);
    }

    public  void movePlayer(String input, int worldHeight, int worldWidth) {
        switch (input) {
            case "a":
                direction = Direction.LEFT;
                break;
            case "s":
                direction = Direction.DOWN;
                break;
            case "d":
                direction = Direction.RIGHT;
                break;
            case "w":
                direction = Direction.UP;
                break;
        }
        switch (direction) {
            case LEFT:
                if (CoordinateX > 1) {
                    CoordinateX--;
                }
                break;
            case DOWN:
                if (CoordinateY < worldHeight - 3) {
                    CoordinateY++;
                }
                break;
            case RIGHT:
                if (CoordinateX < worldWidth - 3) {
                    CoordinateX++;
                }
                break;
            case UP:
                if (CoordinateY > 1) {
                    CoordinateY--;
                }
                break;
        }



//            if (direction == Direction.LEFT) {
//                playerCoordinateX--;
//            } else if (direction == Direction.DOWN) {
//                playerCoordinateY++;
//            } else if (direction == Direction.RIGHT) {
//                playerCoordinateX++;
//            } else if (direction == Direction.UP) {
//                playerCoordinateY--;
//            }
    }


}


// Tellimuse - id, tooted, kasutaja, aja
// kasutaja - frontendis regaminse järgselt
// kategooria
// ühe toote