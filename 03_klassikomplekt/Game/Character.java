package Game;

// abstract ei saa teha new Charecter()
public abstract class Character {
    int CoordinateY;
    int CoordinateX;
    boolean isVisible;

    public Character(int worldHeight, int worldWidth) {
        this.CoordinateY = generateRandomCoordinate(worldHeight);
        this.CoordinateX = generateRandomCoordinate(worldWidth);
    }

    public int generateRandomCoordinate(int worldSize) {
        return (int) ((Math.random()*(worldSize-2))+1); // cast
    }

}