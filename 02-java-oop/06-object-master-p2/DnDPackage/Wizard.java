public class Wizard {
    int intelligence = 8;

    public void heal(Human victim){
        victim.health += this.intelligence;
        System.out.println("The wizard healed for " + this.intelligence + " HP.");
    }

    public void fireball(Human target){
        target.health = target.health - (this.intelligence * 3);
    }
}
