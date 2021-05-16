public class PhoneTest {
    public static void main(String[] args) {
        IPhone IP13XL = new IPhone("v13.2", 100, "Verison", "chirp-chirp");
    
        IP13XL.ring();
        IP13XL.unlock();
        IP13XL.displayInfo();
        
    }
}
