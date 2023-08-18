public class Ninja extends GameCharacter{
    public Ninja(String name, int health) {
        super(name, health);
        this.hasArmor = true; // when creating ninja it has armor by default
    }
    ///////////////////////////////////
    private boolean hasArmor;
    ///////////////////////////////////
    //getter
    public boolean isHasArmor() {//when set boolean method name we have to put "is" to the beginning, isHasArmor = true/false
        return hasArmor;
    }
    //setter
    public void setHasArmor(boolean hasArmor) {
        this.hasArmor = hasArmor;
    }
    ///////////////////////////////////

    public void loseHealth(){
        this.setHealth(this.getHealth()-1); // passing arguments to setHealth setter method
        System.out.println(this.getName() + ": health decreased to " + this.getHealth());
    }

}