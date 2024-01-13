package com.isuru.diamond_problem;

public class Diamond {
    public static void main(String[] args) {
        D d = new D() {

            //@Override
            /*public void display() {
                System.out.println("Implementation in Interface D");
            }*/
        };
        d.display();

    }
}


interface A {
    default void display() {
        System.out.println("Interface A");
    }
}

interface B extends A {

}

interface C extends A {

}


interface D extends B, C {

}





