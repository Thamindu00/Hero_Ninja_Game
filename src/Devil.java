public class Devil extends GameCharacter{
    public Devil(String name, int health) { //  when create an object constructor will be called
        super(name, health); // passing arguments' value to super constructor
    }

    public void attack(Ninja ninja){//attacking to ninja by devil, so we should pass ninja as parameter
        ninja.loseHealth();
    }

    public void stealArmor(Ninja ninja){
        if(ninja.isHasArmor()){
            ninja.setHasArmor(false);
            System.out.println(ninja.getName() + "'s armor stolen successfully");
        }else{
            System.out.println(ninja.getName() + " doesn't have an armor");
        }
        //ninja.setHasArmor(false);
        //System.out.println(ninja.getName() + ": lose the armor");
    }
}