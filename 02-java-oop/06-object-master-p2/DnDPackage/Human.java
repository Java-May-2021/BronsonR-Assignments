public class Human {
    protected int health = 100;
    protected int strength = 3;
    protected int intelligence = 3;
    protected int stealth = 3;

    public void setHealth(int health){
        this.health = health;
    }

    public int getHealth(){
        return this.health;
    }

    public void attack(Human target){
        target.setHealth(target.getHealth() - this.strength);
        System.out.println("HIT! You lost " + this.strength + " HP.");
    }
}
