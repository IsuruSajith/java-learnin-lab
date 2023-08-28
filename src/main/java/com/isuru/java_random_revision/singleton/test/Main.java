package com.isuru.java_random_revision.singleton.test;

public class Main {
    public static void main(String[] args) {
       /* Singleton1.getInstance().printThis();
        Singleton1.getInstance().printThis();*/

        System.out.println(DBConnection.getDbConnection().getConnection());
    }
}
