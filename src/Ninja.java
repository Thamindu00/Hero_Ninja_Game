//Abstract class can hold normal methods and abstract methods
public abstract class Ninja extends GameCharacter{
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

        if (this.isHasArmor()){// to execute idf statement the condition should be true, that means ninjas should have an armor
            this.setHealth(this.getHealth()-1); // passing arguments to setHealth setter method
        }else{
            this.setHealth(this.getHealth()-2);
        }

        if (this.getHealth()==0){
            System.out.println(this.getName() + " just died!");
        }else if(this.getHealth() < 0){
            System.out.println(this.getName() + " is already died!");
        }else{
            System.out.println(this.getName() + ": health decreased to " + this.getHealth());
        }
    }

    public void loseArmor() {
        if(this.isHasArmor()){
            this.setHasArmor(false); // dealing with same class objects, so we can put this keyword
            System.out.println(this.getName() + "'s armor stolen successfully");
        }else{
            System.out.println(this.getName() + " doesn't have an armor");
        }
    }

    public abstract void attack(Devil devil);//attacking to devil by ninja, so we should pass devil as parameter
    //-----------------------------------------------------------------------------------------------------------
    public void gainArmor(){

        if (this.getHealth()<=0){
            System.out.println(this.getName() + " cannot gain armor as you are dead!");
        } else {
            if (this.isHasArmor()==false){
                this.setHasArmor(true);
                System.out.println(this.getName() + "'s armor gained back successfully");
            } else {
                System.out.println(this.getName() + " already has an armor");
            }
        }

    }


}