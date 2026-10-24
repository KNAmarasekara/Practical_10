
class Singleton {
    private static Singleton instance;

    private Singleton() {
        System.out.println("Singleton instance created");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

public class Ex1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            Singleton obj = Singleton.getInstance();
            System.out.println("Object " + i + ": " + obj);
        }
    }
}
