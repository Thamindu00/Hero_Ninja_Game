public class Main {
    public static void main(String[] args) {
        Ninja ninja1 = new Ninja("NINJA1", 10);
        Devil devil1  = new Devil("DEVIL1", 10);
        //attacking
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
    }
}