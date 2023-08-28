package isuru.singleton.test;

public class Singleton1 {
    private static Singleton1 singleton1;
    private String name;

    private Singleton1() {
        this.name = "isuru";
    }

    public static Singleton1 getInstance() {
        return (singleton1 == null) ? singleton1 = new Singleton1() : singleton1;
    }

    public void printThis() {
        System.out.println(this);
    }

    public String getName() {
        return name;
    }
}
