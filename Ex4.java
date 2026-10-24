
interface TV {
    void turnOn();
    void turnOff();
}

class LGTV implements TV {
    public void turnOn() {
        System.out.println("LG TV ON");
    }

    public void turnOff() {
        System.out.println("LG TV OFF");
    }
}

class SonyTV implements TV {
    public void turnOn() {
        System.out.println("Sony TV ON");
    }

    public void turnOff() {
        System.out.println("Sony TV OFF");
    }
}

class Remote {
    protected TV tv;

    public Remote(TV tv) {
        this.tv = tv;
    }

    public void turnOn() {
        tv.turnOn();
    }

    public void turnOff() {
        tv.turnOff();
    }
}

public class Ex4 {
    public static void main(String[] args) {
        Remote lgRemote = new Remote(new LGTV());
        Remote sonyRemote = new Remote(new SonyTV());

        lgRemote.turnOn();
        lgRemote.turnOff();

        sonyRemote.turnOn();
        sonyRemote.turnOff();
    }
}
