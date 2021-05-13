package ZookeeperPack;

public class Bat extends Mammal {
    public void batEngergy(){
        energyLevel = 300;   //bat default energy level is 300 versus default value of 100
    }

    public void fly(int flight){
        System.out.println("*Flap* *Flap* *Flap*, the bat flew around " + flight + " times.");
        energyLevel = energyLevel - (flight * 50);
    }

    public void eatHumans(int humans){
        System.out.println("BY GOD IT IS EATING " + humans + " HUMANS!!!");
        energyLevel = energyLevel + (humans * 25);
    }

    public void attackTown(int attacks){
        System.out.println("Run!! Its attacking the town!! HIDE!!");
        energyLevel = energyLevel - (attacks * 100);
        System.out.println("By god....it attacked " + attacks + " towns before stopping...");
    }

}
