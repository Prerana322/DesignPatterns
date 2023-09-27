package BuilderDesignPattern;

public class Phone {
    private String os;
    private int ram;
    private String processor;
    private double Screensize;
    private int battery;


    public Phone(String os, int ram, String processor, double Screensize, int battery) {
        this.os = os;
        this.ram = ram;
        this.processor = processor;
        this.Screensize = Screensize;
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", ram=" + ram +
                ", processor='" + processor + '\'' +
                ", Screensize=" + Screensize +
                ", battery=" + battery +
                '}';
    }
}
