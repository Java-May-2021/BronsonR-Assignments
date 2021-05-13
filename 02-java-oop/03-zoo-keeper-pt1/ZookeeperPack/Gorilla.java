package ZookeeperPack;

public class Gorilla extends Mammal {
    public int throwSomething(int YN, int things){
        if ( YN <= 5 ){
            System.out.println("The gorilla threw something, that will tire him");
            energyLevel = energyLevel - (things * 5);
            displayEnergy();
        }
        else if ( YN > 5 && YN <= 20){
            System.out.println("The gorilla almost threw a bunch of stuff");
            energyLevel = energyLevel - (things * 5);
        }
        else {
            System.out.println("Ummmm I said 1 or 2 to tell me if he threw something, and then how many there were...look again");
            return YN;
        }
        return energyLevel;
        }


    public int eatBananas(int bananas){
        energyLevel += (bananas * 10);
        if ( bananas == 0){
            System.out.println("The grorilla is not hungry");
        } else if ( bananas >= 2 && bananas < 10){
            System.out.println("He has had a few bananas, hes pretty satisfied with just " + bananas + " bananas");
        } else if ( bananas >= 10 && bananas <= 15){
            System.out.println("That was " + bananas + " bananas, I think he was hungry and pretty happy now. ");
        } else{
            System.out.println("Are we sure it was " + bananas + " that can't be right, look again, and let me know");
        }
        return energyLevel;
    }

    public int climb(int YN){
        if ( YN == 1){
            energyLevel = energyLevel - 10;
            System.out.println("Oh look, he is climbing the tree, that will tire him out a bit for sure");
        } else if ( YN == 2 ){
            System.out.println("Hes was about to climb the tree but sat down first");
        } else {
            System.out.println("Ummmm 1 or 2 if he climbs the tree, look if hes in the tree");
        }
        return energyLevel;
    }
}
