public class Main {
    public static void main(String[] args) {
        //Ninja ninja1 = new Ninja("NINJA1", 5);
        SuperNinja superNinja1 = new SuperNinja("SUPER_NINJA1", 5);
        Devil devil1  = new Devil("DEVIL1", 5);

        //Attack to super ninja by devil
        devil1.attack(superNinja1);
        devil1.attack(superNinja1);
        devil1.attack(superNinja1);
        devil1.attack(superNinja1);
        devil1.attack(superNinja1);
        devil1.attack(superNinja1);
        //Super Ninja
        superNinja1.increaseHealth();

        /*
        //attacking
        devil1.attack(ninja1);
        devil1.attack(ninja1);
        devil1.attack(ninja1);
        devil1.attack(ninja1);
        devil1.attack(ninja1);
        devil1.attack(ninja1);
        System.out.println();

        //before the steal armor
        System.out.println(ninja1.isHasArmor());
        System.out.println();
        //after the steal armor
        devil1.stealArmor(ninja1);
        System.out.println(ninja1.isHasArmor());

        System.out.println();
        devil1.stealArmor(ninja1);

         */
    }
}