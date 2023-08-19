public class NormalNinja extends Ninja{
    public NormalNinja(String name, int health) {//creating constructor
        super(name, health);
    }

    @Override
    public void attack(Devil devil){//attacking to devil by Super ninja, so we should pass devil as parameter
        devil.loseHealth(1);
    }
}
