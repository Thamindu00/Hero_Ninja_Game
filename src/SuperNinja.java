public class SuperNinja extends Ninja{
    public SuperNinja(String name, int health) {
        super(name, health);
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
}
