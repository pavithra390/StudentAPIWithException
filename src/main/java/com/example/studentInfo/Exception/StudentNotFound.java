package com.example.studentInfo.Exception;

public class StudentNotFound extends Exception {
    String msg;
    public StudentNotFound(String msg){
        this.msg=msg;
    }
}
