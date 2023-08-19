// we can't make SuperNinja to abstract class or interface, because we have to make objects through the SuperNinja class
// However there is another option, we can do method overriding
public class SuperNinja extends Ninja{
    public SuperNinja(String name, int health) {
        super(name, health); //here super means GameCharacter class method
    }

    public void increaseHealth(){
        if (this.getHealth() == 5){
            System.out.println(this.getName() + " can't increase health beyond 5");
        } else if(this.getHealth() < 1){
            System.out.println("Already died, can't increase health!");
        } else {
            this.setHealth(this.getHealth()+1);
            System.out.println(this.getName() + " increased health to " + this.getHealth());
        }
    }

    @Override
    public void attack(Devil devil){//attacking to devil by Super ninja, so we should pass devil as parameter
        devil.loseHealth(2);
    }
}
