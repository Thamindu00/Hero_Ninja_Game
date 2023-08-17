public class GameCharacter {
    private String name;
    private int health;
    //constructor
    public GameCharacter(String name, int health) { // same as class name, and do not put return type
        this.name = name;
        this.health = health;
    }
    ///////////////////////////////////
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    ///////////////////////////////////
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
