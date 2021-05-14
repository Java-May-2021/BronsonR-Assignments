public class Samurai {
    int health = 200;
    public static int numOfSamurai = 0;

    public Samurai(){
        numOfSamurai++;
    }

    public void deathBlow(Human target){
        target.health = 0;
        System.out.println("The samurai used his ultimate move, at cost to himself");
        System.out.println("His opponent is dead");
        this.health = this.health / 2 ;
    }

    public void meditate(){
        this.health = (this.health / 2) + this.health;
        System.out.println("The samurai meditates to get back to " + this.health + " HP.");
    }

    public void howMany(){
        System.out.println("There are " + Samurai.numOfSamurai + " samurai on the board.");
    }
}
