public abstract class Character {
    int CoordinateY;
    int CoordinateX;

    public Character(int worldHeight, int worldWidth) {
        this.CoordinateY = generateRandomCoordinate(worldHeight);
        this.CoordinateX = generateRandomCoordinate(worldHeight);
    }

    public int generateRandomCoordinate(int worldSize) {
        return (int) (Math.random()*(worldSize-2))+1;
        }
}
