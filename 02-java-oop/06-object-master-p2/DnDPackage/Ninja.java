public class Ninja extends Human {
    int stealth = 10; 

    public void steal(Human target){
        this.health += stealth;
        target.health -= stealth;
        System.out.println("The ninja stole " + stealth + " health");
    }

    public void runAway(){
        this.health -= 10;
        System.out.println("Opportunity attack of 10 damage!");
    }
}
