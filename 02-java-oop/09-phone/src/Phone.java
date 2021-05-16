public abstract class Phone {
    private String versionNumber;
    private int batteryPercentage;
    private String carrier;
    private String ringTone;
    
    
    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone){
        this.versionNumber = versionNumber;
        this.batteryPercentage = batteryPercentage;
        this.carrier = carrier;
        this.ringTone = ringTone;
    }
    
    public abstract void displayInfo(); // abstract method. This method will be implemented by the subclasses


    public String getVersionNumber(){
        return this.versionNumber;
    }

    public String setVersionNumber(String versionNumber){
        this.versionNumber = versionNumber;
        return versionNumber;
    }

    public int getBatteryPercentage(){
        return this.batteryPercentage;
    }

    public int setBatteryPercentage(int battery){
        this.batteryPercentage = battery;
        return batteryPercentage;
    }

    public String getCarrier(){
        return this.carrier;
    }

    public String setCarrier(String carrier){
        this.carrier = carrier;
        return carrier;
    }

    public String getRingtone(){
        return this.ringTone;
    }

    public void setRingtone(String ringtone){
        this.ringTone = ringtone;
    }
}