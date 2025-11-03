abstract class Appliance {
    void plugIn() {
        System.out.println("Appliance plugged in");
    }

    abstract void operate();
}

class WashingMachine extends Appliance {
    void operate() {
        System.out.println("Washing clothes");
    }
}

class Refrigerator extends Appliance {
    void operate() {
        System.out.println("Cooling food");
    }
}

public class PACPI{
    public static void main(String[] args) {
        Appliance wm = new WashingMachine();
        Appliance rf = new Refrigerator();
        wm.plugIn();
        wm.operate();
        rf.plugIn();
        rf.operate();
    }
}
