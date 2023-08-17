public class Ninja extends GameCharacter{
    public Ninja(String name, int health) {
        super(name, health);
        this.hasArmor = true; // when creating ninja it has armor by default
    }
    ///////////////////////////////////
    private boolean hasArmor;
    ///////////////////////////////////
    public boolean isHasArmor() {//when set boolean method name we have to put "is" to the beginning, isHasArmor = true/false
        return hasArmor;
    }

    public void setHasArmor(boolean hasArmor) {
        this.hasArmor = hasArmor;
    }
    ///////////////////////////////////
}