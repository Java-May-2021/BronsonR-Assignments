public class CalculatorTest extends Calculator {
    public static void main(String[] args) {
        Calculator dave = new Calculator();

        dave.setOperandOne(15);
        dave.setOperation("+");
        dave.setOperandTwo(5);
        dave.performOperation();
        System.out.println(dave.getResult());
    }
}
