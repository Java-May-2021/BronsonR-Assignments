public class StringManipulatorTester {
    public static void main (String[] args){    //main method call, all methods found in connected java file
        StringManipulator manipulator = new StringManipulator();
        
        manipulator.trimAndConcat("    Hello    ","   World    ");
        
        char letter = 'o';             //setting value to the letter that we will look for in the index of each string
        Integer a = manipulator.getIndexOrNull("Bronson", letter);
        Integer b = manipulator.getIndexOrNull("Hunter", letter);
        Integer c = manipulator.getIndexOrNull("Richardson", letter);
		System.out.println(a); 
		System.out.println(b);        //could print out from here or have this print from the method as with trimAndConcat
		System.out.println(c); 


        String word = "Hello";         //setting mulitple variables to test through method, each method will pass the variables and then be printed
        String subString = "llo";
        String notSubString = "Doom Guy";
        Integer d = manipulator.getIndexOrNull(word, subString);
        Integer e = manipulator.getIndexOrNull(word, notSubString);
        System.out.println(d);
        System.out.println(e);



        String word2 = manipulator.concatSubString("Wassup", 1, 2, "Doom Guy");
        System.out.println(word2);
    }
}
