import java.util.ArrayList;

public class ListOfExceptions {
    public static void main(String[] args) {
        
        ListOfExceptions object = new ListOfExceptions();

        object.tryCatch();
        
    }
    
    public void tryCatch() {
        ArrayList<Object> list = new ArrayList<Object>();
        list.add("Strong");
        list.add(48);
        list.add("Bodybuilding");
        list.add("Classic Physique!");

        try{
            for(int i = 0; i < list.size(); i++) {
                    Integer castedValue = (Integer) list.get(i);
                }
        } catch (ClassCastException X){
            System.out.println("Oops there was an error!");
        }
        
    }
}