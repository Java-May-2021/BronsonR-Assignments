import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.List;


public class Puzzling {
    public static void main(String[] args) {
        Puzzling runme = new Puzzling();


        System.out.println("---");        //spacers for the console for better view of output
        System.out.println("---");
        System.out.println("---");
        System.out.println("");

        runme.sumGreater();

        System.out.println("---");

        runme.name5Char();

        System.out.println("---");
        
        runme.alphabet();
        
        System.out.println("---");
        
        runme.randomNums(100, 55);  
        
        System.out.println("---");

        runme.randomChar();

        System.out.println("---");

        runme.randomStringArr();
    }



    public void sumGreater(){           //given an array, print the sum of the array and a new array with all the values greater than 10
        ArrayList<Integer> intList = new ArrayList<Integer>();
        int[] array = {3,5,1,2,7,9,8,13,25,32};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum+= array[i];
            if (array[i] > 10){
                intList.add(array[i]);
            }
        }
        System.out.println("The sum is: " + sum);
        System.out.println("Values above 10 are: " + intList);
    }

    public void name5Char() {          //given a string array, shuffle and print names, and print new array with any name longer than 5 characters
        ArrayList<String> stringList = new ArrayList<String>();
        ArrayList<String> longName = new ArrayList<String>();

        String[] array = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};  //added regular array for this due to error passing it through for loop

        stringList.add("Nancy");
        stringList.add("Jinichi");
        stringList.add("Fujibayashi");
        stringList.add("Momochi");
        stringList.add("Ishikawa");

        System.out.println(stringList);
        Collections.shuffle(stringList);
        System.out.println(stringList);

        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > 5){
                longName.add(array[i]);
            }
        }
        System.out.println(longName);
    }

    public void alphabet(){                //make an array for alphabet, shuffle, get last letter of new list, get first letter, if its a vowel display message
        System.out.println("Alphabet Shuffle!");    //this was for fun, however, primitive type array would not console log out instead gave memory location
        Character[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j','k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 
                            't', 'u', 'v', 'w', 'x', 'y', 'z'};     //hand typed alphabet rather than ArrayList for loop due to shuffle issues and if statement issues

        List<Character> alphObj = Arrays.asList(alphabet);   //found List super class to do alternative way of shuffling the array since the Collections.shuffle will only work on ArrayLists, and ran into issues with ArrayLists
        Collections.shuffle(alphObj);

        System.out.println("Last letter of  alphabet shuffle is: " + alphabet[25]);
        System.out.println("First letter of alphabet shuffle is: " + alphabet[0]);

        if (vowel(alphabet[0])){
            System.out.println("Got a vowel!");
        }
        
    }
    public static boolean vowel(char letter){
        return (
            letter == 'a' ||
            letter == 'e' ||
            letter == 'i' ||
            letter == 'o' ||
            letter == 'u');
        
    }

    public void randomNums(int upperBound, int lowerBound){     //random array between two bound, pulled from solutions, they had a cleaner way of doing this
        ArrayList<Integer> intList = new ArrayList<Integer>();  //had issue with normal array printing to console, added new random array to the ArrayList
        int[] arr = new int[10];
        int offset = upperBound - lowerBound;
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(offset) + lowerBound;
            intList.add(arr[i]);
        }
        System.out.println(intList);
        Collections.sort(intList);                             //using Collection Super Class to sort the ArrayList of random numbers
        System.out.println("Lets sort these: " + intList);
    }

    public void randomChar(){
        ArrayList<Character> stringList = new ArrayList<Character>();
        Character[] array = new Character [5];
        Random r = new Random();
        Character[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j','k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 
        't', 'u', 'v', 'w', 'x', 'y', 'z'};    //added alphabet from above to give array of characters to run through

        for (int j = 0; j < array.length; j++) {
            array[j] = alphabet[r.nextInt(26)];
            stringList.add(array[j]);
        }
        System.out.println(stringList);
    }

    public void randomStringArr() {
        Puzzling random = new Puzzling();  //created object to call previous function that generated the array of 5 random characters
        for (int i = 0; i < 10; i++){      //runs through it 10 times giving the 10 randoms
            random.randomChar();
        }
	}


}