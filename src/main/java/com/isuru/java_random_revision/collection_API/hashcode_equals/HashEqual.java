package com.isuru.java_random_revision.collection_API.hashcode_equals;

import com.isuru.java_random_revision.collection_API.hashcode_equals.util.Student;

public class HashEqual {
    public static void main(String[] args) {

        Student student = new Student(1,"isuru",55.00);
        Student student2 = new Student(1,"isuru",55.00);

        System.out.println(student.hashCode()); //-100382254
        System.out.println(student2.hashCode()); //-100382254
        System.out.println(student.equals(student2)); //true
        System.out.println(student==student2); //false

        String name = "isuru";
        String name2 = "isuru";

        System.out.println(name.equals(name2)); //true
        System.out.println(name2.hashCode()); //100511758
        System.out.println(name.hashCode()); //100511758
        System.out.println(name==name2); // true

        Student student3 = new Student();
        Student student4 = new Student();
        System.out.println(student3.equals(student4));//true
        System.out.println(student3.hashCode());//29791
        System.out.println(student4.hashCode());//29791
        System.out.println(student3==student4);//false
    }
}
