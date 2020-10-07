package com.company.cdac.cop3;

public class StudentRunner {
    public static void main(String[] args) {
        Student student = new Student("John", 2);

        System.out.println("Student Name: " +student.getName());
        System.out.println("Student Roll No.: " +student.getRollNo());
    }
}
