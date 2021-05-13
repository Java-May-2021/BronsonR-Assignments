package ZookeeperPack;

public class GorillaTest extends Gorilla{ //extended the gorilla class to test the functionality of the gorilla specific methods
    public static void main(String[] args) {
        GorillaTest mojo = new GorillaTest();


        System.out.println("Lets check in on the Mojo");
        mojo.displayEnergy();
        mojo.eatBananas(2);
        mojo.throwSomething(1 , 3);
        mojo.climb(1);
        mojo.displayEnergy();
        
    }
}
