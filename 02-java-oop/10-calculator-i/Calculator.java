public class Calculator implements java.io.Serializable {
    private int operandOne;
    private int operandTwo;
    private String operation;
    public int result;
    
    public Calculator(){}
    
    public void performOperation(){
        this.getOperandOne();
        this.getOperation();
        this.getOperandTwo();
        if (operation == "+"){
            result = operandOne + operandTwo;
        } else if (operation == "-"){
            result = operandOne - operandTwo;
        } else {
            System.out.println("What you put in cannot be understood.");
            System.out.println("Make sure you put in a + or - , no other operation recgonized.");
        }
    }

    public int getResult(){
        return result;
    }

    public int setOperandOne(int operand){
        this.operandOne = operand;
        return operandOne;
    }

    public int getOperandOne(){
        return operandOne;
    }

    public int setOperandTwo(int operand){
        this.operandTwo = operand;
        return operandTwo;
    }

    public int getOperandTwo(){
        return operandTwo;
    }

    public String setOperation(String operation){
        if (operation == "+"){
            this.operation = "+";
        } else if (operation == "-"){
            this.operation = "-";
        } else {
            return null;
        }
        return this.operation;
    }

    public String getOperation(){
        return operation;
    }

}



