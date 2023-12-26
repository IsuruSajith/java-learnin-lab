package com.isuru.diamond_problem;

public class Diamond {
    public static void main(String[] args) {
        D d = new D();
        d.display();  // Output: Class B
    }
}


interface A {
    void display();
}

class B implements A {
    public void display() {
        System.out.println("Class B");
    }
}

class C implements A {
    public void display() {
        System.out.println("Class C");
    }
}

class D extends B {
    public void display() {
        // Specify which interface's method you want to call
        //B.super.display(); // Call display method from interface B
    }
}




