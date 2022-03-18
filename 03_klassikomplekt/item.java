public class item implements WorldObject{
    int CoordinateY;
    int CoordinateX;
    double strength;
    ItemType itemType;

    public item(int worldHeight, int worldWidth, ItemType itemType){
        this.CoordinateY = generateRandomCoordinate(worldHeight);
        this.CoordinateX = generateRandomCoordinate(worldHeight);
        this.itemType = itemType;
        determineStrength(itemType);
    }

    private void determineStrength(ItemType itemType) {
        switch (itemType) {
            case SWORD:
                this.strength = 3;
                break;
            case HAMMER:
                this.strength = 2;
                break;
            case DAGGER:
                this.strength = 1;
                break;
        }
    }

    public int generateRandomCoordinate(int worldSize) {
        return (int) (Math.random()*(worldSize-2))+1;
    }

    public  void movePlayer(String input, int worldHeight, int worldWidth) {
    }
}