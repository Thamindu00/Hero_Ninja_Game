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
        //when calling this method first should reduce the health by 1, cause main aim of this method is that
        this.setHealth(this.getHealth()-1); // passing arguments to setHealth setter method
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
}