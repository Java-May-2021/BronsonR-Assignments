public class FizzBuzz{
    public String fizzBuzz(int value){           //this will be the method we will use as a base
        if (value % 3 == 0 && value % 5 == 0){   //created if, else if statements for the remainders parameters
            return "FizzBuzz";                   //this will then return a string based on what parameters become true
        }else if(value % 3 == 0){
            return "Fizz";
        } else if(value % 5 == 0){
            return "Buzz";
        } else {
            return Integer.toString(value);      //returns the value as a string rather than an integer when printed
        }
    }
    public void counter(){
        for (int i = 1; i<=50; i++){             //creating a for loop to increment value of i and pass it through the
            String result = fizzBuzz(i);         //passes the value of i into the above method fizzBuzz
            System.out.println("Number:" + i + "-" + "Result:" + result);
    }
    }
}