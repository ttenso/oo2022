public class Player {
    int CoordinateY;
    int CoordinateX;
    Direction direction;

    // Constructor
    public Player(int worldHeight, int worldWidth){
        this.CoordinateY = generateRandomCoordinate(worldHeight);
        this.CoordinateX = generateRandomCoordinate(worldHeight);
        this.direction = Direction.UP;
    }

    public static int generateRandomCoordinate(int worldSize) {
        return (int) (Math.random()*(worldSize-2))+1;
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
                if (CoordinateY < worldHeight-3) {
                    CoordinateY++;
                }
                break;
            case RIGHT:
                if (CoordinateX < worldWidth-3) {
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