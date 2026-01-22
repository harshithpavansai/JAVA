class lightBulb {
    boolean isOn;

    void trunOn() {
        isOn = true;
    }

    void turnOff() {
        isOn = false;
    }

    void status() {
        if (isOn == true)
            System.out.println("bulb is on");
        else
            System.out.println("bulb is off");
    }
}

public class lightbulbex {
    public static void main(String[] args) {

        lightBulb l1 = new lightBulb();
        l1.isOn = true;
        l1.turnOff();
        l1.status();
        l1.trunOn();
        l1.status();

    }
}
