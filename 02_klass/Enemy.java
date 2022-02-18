public class Enemy {
    int CoordinateY;
    int CoordinateX ;

    // new enemy(1, 6)
    public Enemy(int worldHeight, int worldWidth) {
        this.CoordinateY = generateRandomCoordinate(worldHeight);
       this.CoordinateX = generateRandomCoordinate(worldWidth);
    }
    public static int generateRandomCoordinate(int WorldSize) {
        return (int) (Math.random()*(WorldSize-2))+1;
    }
}