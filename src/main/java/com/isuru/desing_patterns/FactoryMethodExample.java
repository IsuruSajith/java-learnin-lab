package com.isuru.desing_patterns;


interface Product {
    void create();
}

class ConcreteProductA implements Product {
    public void create() {
        System.out.println("Product A created.");
    }
}

class ConcreteProductB implements Product {
    public void create() {
        System.out.println("Product B created.");
    }
}
public class FactoryMethodExample {

}
