public class Main {
    public static void main(String[] args) {
        SuperNinja superNinja1 = new SuperNinja("SUPER_NINJA1", 5);
        //Ninja superNinja1 = new SuperNinja("SUPER_NINJA1", 5); // we can write the code line as same to above code line, because Ninja is superclass
        //It will go and check Ninja class attack method and see it's abstract, then it checks SuperNinja has overridden attack method,if method is there system will execute that method

        NormalNinja normalNinja1 = new NormalNinja("NORMAL_NINJA1", 5);
        Devil devil1  = new Devil("DEVIL1", 5);

        /*
        superNinja1.attack(devil1);
        superNinja1.attack(devil1);
        superNinja1.attack(devil1);
        */


        devil1.stealArmor(superNinja1); // required parameter type is ninja(more generic), but we can more specific argument, --POLYMORPHISM--
        //Attack to super ninja by devil
        devil1.attack(superNinja1); //3
        superNinja1.gainArmor();
        devil1.attack(superNinja1); //2
        devil1.attack(superNinja1); //1
        devil1.attack(superNinja1); //0
        devil1.attack(superNinja1); //-1
        devil1.attack(superNinja1); //-2
        superNinja1.gainArmor();
        //Super Ninja can increase his health by 1
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