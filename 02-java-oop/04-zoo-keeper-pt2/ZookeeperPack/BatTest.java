package ZookeeperPack;

public class BatTest extends Bat {
    public static void main(String[] args) {
        BatTest vlad = new BatTest();

        vlad.batEngergy();
        vlad.displayEnergy();
        vlad.eatHumans(2);
        vlad.attackTown(3);
        vlad.fly(2);
        vlad.displayEnergy();
    }
}
