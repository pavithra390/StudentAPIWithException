package com.example.studentInfo.Exception;

public class StudentException {
    String errorName;
    String occuringDate;
    public StudentException(){

    }
    public String getOccuringDate() {
        return occuringDate;
    }

    public void setOccuringDate(String occuringDate) {
        this.occuringDate = occuringDate;
    }

    public String getErrorName() {
        return errorName;
    }

    public void setErrorName(String errorName) {
        this.errorName = errorName;
    }



}
