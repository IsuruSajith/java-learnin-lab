package com.isuru.diamond_problem;

public class Diamond {
    public static void main(String[] args) {
        // Creating an anonymous class implementing Interface D
        D d = new D() {
            // Implementing display() is mandatory due to diamond problem
            @Override
            public void display() {
                System.out.println("Implementation in Interface D");
            }
        };

        d.display();  // Output: Implementation in Interface D
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





