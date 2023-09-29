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

abstract class Creator {
    abstract Product factoryMethod();
}

class ConcreteCreatorA extends Creator {
    Product factoryMethod() {
        return new ConcreteProductA();
    }
}

class ConcreteCreatorB extends Creator {
    Product factoryMethod() {
        return new ConcreteProductB();
    }
}
public class FactoryMethodExample {

}
