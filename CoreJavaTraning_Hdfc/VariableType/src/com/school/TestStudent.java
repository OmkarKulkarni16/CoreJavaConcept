package com.school;

public class TestStudent {

    public static void main(String[] args) {
        Student t1 = new Student();
        t1.setStudentId(10);
        System.out.println(t1.getStudentId());
        Student t2 = new Student(3,"Omkar",12333);
    }

}
