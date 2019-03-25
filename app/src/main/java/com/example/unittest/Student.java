package com.example.unittest;

public class Student {
    private String studentName;
    private String studentGPA;
    private String expectedGradYear;

    public Student(String studentName, String studentGPA, String expectedGradYear) {
        this.studentName = studentName;
        this.studentGPA = studentGPA;
        this.expectedGradYear = expectedGradYear;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentGPA() {
        return studentGPA;
    }

    public void setStudentGPA(String studentGPA) {
        this.studentGPA = studentGPA;
    }

    public String getExpectedGradYear() {
        return expectedGradYear;
    }

    public void setExpectedGradYear(String expectedGradYear) {
        this.expectedGradYear = expectedGradYear;
    }
    public void processGpa(){

    }
}
