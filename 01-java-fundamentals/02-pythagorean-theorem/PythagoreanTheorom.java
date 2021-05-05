public class PythagoreanTheorom {
    public static void main(String[] args) {
        int legA= 8;
        int legB= 8;
        double squaredA= legA*legA;
        double squaredB= legB*legB;
        double legC= Math.sqrt(squaredA + squaredB);
        System.out.println(legC);
    }
}