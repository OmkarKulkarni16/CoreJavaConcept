package com.school;

public class Student {
    private int studentId;
    private String studentName;
    private double studentFee;

    public Student(int studentId, String studentName, double studentFee) {

        this.studentId = studentId;
        this.studentName = studentName;
        this.studentFee = studentFee;
    }
    public  Student(){
        super();
    }

    public int getStudentId() {
        return studentId;
    }


    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getStudentFee() {
        return studentFee;
    }

    public void setStudentFee(double studentFee) {
        this.studentFee = studentFee;
    }

}
