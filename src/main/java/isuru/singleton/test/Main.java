package isuru.singleton.test;

public class Main {
    public static void main(String[] args) {
        Singleton1.getInstance().printThis();
        Singleton1.getInstance().printThis();
        Singleton1.getInstance().printThis();
        System.out.println(Singleton1.getInstance().getName());
    }
}
