
interface Chair {
    void sitOn();
}

class ModernChair implements Chair {
    public void sitOn() {
        System.out.println("Sitting on a Modern Chair");
    }
}

class VictorianChair implements Chair {
    public void sitOn() {
        System.out.println("Sitting on a Victorian Chair");
    }
}

interface FurnitureFactory {
    Chair createChair();
}

class ModernFurnitureFactory implements FurnitureFactory {
    public Chair createChair() {
        return new ModernChair();
    }
}

class VictorianFurnitureFactory implements FurnitureFactory {
    public Chair createChair() {
        return new VictorianChair();
    }
}

public class Ex5 {
    public static void main(String[] args) {
        FurnitureFactory modernFactory = new ModernFurnitureFactory();

        Chair modernChair = modernFactory.createChair();
        modernChair.sitOn();

        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();

        Chair victorianChair = victorianFactory.createChair();
        victorianChair.sitOn();
    }
}
