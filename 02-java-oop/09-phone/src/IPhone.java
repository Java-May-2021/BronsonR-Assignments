public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }

    @Override
    public String ring() {
        System.out.println(this.getRingtone());
        return this.getRingtone();
    }

    @Override
    public String unlock() {
        return "Unlock with facial recognition";
    }

    @Override
    public void displayInfo() {
        System.out.println("Phone info: ");
        System.out.println(this.getVersionNumber());
        System.out.println(this.getBatteryPercentage());
        System.out.println(this.getCarrier());
        System.out.println(this.getRingtone());
    }
}