package com.example.unittest;

public class StringUtil {
    public static String concatTwoStrings(String stringOne, String stringTwo){
        return  stringOne + " " +stringTwo;
    }
    public static boolean stringLengthGreaterThanFive(String stringToCheck){
        if (stringToCheck.length()>5){
            return true;
        }else {
            return false;
        }
    }

    public static String returnString(String string){
        return string;
    }

    public static  String processStudent(Student student){
        return student.getStudentName()+" has a gpa of "+student.getStudentGPA();
    }

    public static String processGpa(Student student){
        student.processGpa();
        return "GPA Processed";
    }

}
