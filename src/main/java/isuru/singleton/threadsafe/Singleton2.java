package isuru.singleton.threadsafe;

public class Singleton2 {
    private static Singleton2 instance;
    private Singleton2() {

    }

    public static Singleton2 getInstance() {
        if (instance == null) {
            synchronized (Singleton2.class) {
                if (instance == null) {
                    instance = new Singleton2();
                }
            }
        }
        return instance;
    }

    public void printThis() {
        System.out.println(this);
    }
}
