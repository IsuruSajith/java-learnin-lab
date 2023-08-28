package com.isuru.java_random_revision.collection_API.hashcode_equals.util;

import java.util.Objects;

public class Student {
    int id;
    String name;
    double weight;

    public Student(int id, String name, double weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    public Student() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Double.compare(student.weight, weight) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, weight);
    }
}
