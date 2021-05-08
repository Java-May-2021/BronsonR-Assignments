import java.util.ArrayList;
import java.util.Arrays;


public class Basics {
    public static void main(String[] args) {
        Basics runme = new Basics();
        System.out.println("---");
        runme.print1255();
        System.out.println("---");
        runme.odd1255();
        System.out.println("---");
        runme.sum();
        System.out.println("---");
        runme.iterate();
        System.out.println("---");
        runme.findMax();
        System.out.println("---");
        runme.getAverage();
        System.out.println("---");
        runme.oddArray();
        System.out.println("---");
        runme.greaterThan();
        System.out.println("---");
        int[] sqdarray = {5, 10, 15, 20};
        runme.squaredValue(sqdarray);
        System.out.println("---");
        int[] earray = {-7, 5, 11, -3, 0};
        runme.eliminateNegs(earray);
        System.out.println("---");
        runme.maxMinAve();
        System.out.println("---");
        runme.shift();
    }





public void print1255(){
    ArrayList<Integer> intList = new ArrayList<Integer>();
    for (int i = 0; i <= 255; i++) {
        intList.add(i);
    }
    System.out.println(intList);
}

public void odd1255(){
    ArrayList<Integer> intList = new ArrayList<Integer>();
    for (int j = 0; j <= 255; j++) {
        if (j % 2 != 0){
            intList.add(j);
        }
    }
    System.out.println(intList);
}

public void sum(){
    int sum=0;
    int num=0;
    for (int k = 0; k<=255; k++){
        sum+=k;
        num++;
        System.out.println("Num:" + num + "  Sum:" + sum);
    }
}

public void iterate(){
    int[] array = {1,2,3,4,5,6};
    for (int i = 0; i < array.length; i++) {
        System.out.println(array[i]);
    }
}

public void findMax(){
    int[] array = {7, 12, 80, 57, 44, 12, 1};
    int max=0;
    for (int i = 0; i < array.length; i++) {
        if (max < array[i]){
            max = array[i];
        }
    }
    System.out.println("The max value is: " + max);
}

public void getAverage(){
    int[] array = {1, 5, 6, 12};
    int average;
    int sum = 0;
    for (int i = 0; i < array.length; i++) {
        sum+=array[i];
    }
    average = sum / array.length;
    System.out.println("The average is: " + average);
}

public void oddArray(){
    ArrayList<Integer> intList = new ArrayList<Integer>();
    for (int i = 0; i <= 255; i++) {
        if (i % 2 != 0){
            intList.add(i);
        }
    }
    System.out.println(intList);
}

public void greaterThan(){
    int[] array = { 1, 3, 5, 7, 0, 2};
    int base = 3;
    int gtNums = 0;
    for (int i=0; i < array.length; i++){
        if ( base<array[i]){
            gtNums++;
        }
    }
    System.out.println(gtNums);
}

public void squaredValue(int[] array){
    for (int i = 0; i < array.length; i++) {
        if( array[i] < 0){
            array[i]= array[i] * array[i];
        }
    }
    System.out.println(array);
} 

public void eliminateNegs(int[] array){
    for (int i = 0; i < array.length; i++) {
        if ( array[i] < 0){
            array[i]=0;
        }
    System.out.println(array);
    }
}

public void maxMinAve(){
    int[] array = {15, 75, 21, 7, 9, 33, 54};
    int max = 0;
    int min = array[0];
    int average;
    int sum = 0;
    for (int i = 0; i < array.length; i++) {
        if (max < array[i]){
            max = array[i];
        }
    }
    for (int i = 0; i < array.length; i++) {
        if (min >= array[i]){
            min = array[i];
        }
    }
    for (int i = 0; i < array.length; i++) {
        sum+=array[i];
    }
    average = sum / array.length;
    System.out.println("The max value is: " + max);
    System.out.println("The max value is: " + min);
    System.out.println("The average is: " + average);

}

public void shift(){
    int [] array = {5, 15, 32, -8, 0, -2};
    for (int i = 1; i < array.length; i++) {
        array[array.length-1]=0;
        array[i-1] = array[i];
    }
    System.out.println(array);
}
}