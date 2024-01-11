package com.isuru.java_interview_q.hashmap_treemap;
public class LambdaExample {
        public static void main(String[] args) {
            MyFunctionalInterface myLambda = ()->{
                System.out.println("ajith hermanos");
            };
            myLambda.myMethod();
        }
}
@FunctionalInterface
interface MyFunctionalInterface {
    void myMethod();
}
