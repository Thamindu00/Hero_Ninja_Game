public class Devil extends GameCharacter{
    public Devil(String name, int health) { //  when create an object constructor will be called
        super(name, health); // passing arguments' value to super constructor
    }

    //attacking to ninja by devil, so we should pass ninja as parameter
    public void attack(Ninja ninja){
        ninja.loseHealth();
    }

    public void stealArmor(Ninja ninja){
        ninja.loseArmor();
    }

    public void loseHealth(int decreaseAmount){ // Devil's loseHealth method
        //when calling this method first should reduce the health by 1, cause main aim of this method is that
        this.setHealth(this.getHealth()-decreaseAmount); // passing arguments to setHealth setter method
        if (this.getHealth()==0){
            System.out.println(this.getName() + " just died!");
        }else if(this.getHealth() < 0){
            System.out.println(this.getName() + " is already died!");
        }else{
            System.out.println(this.getName() + ": health decreased to " + this.getHealth());
        }
    }
}