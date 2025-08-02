package com.example.studentInfo.Exception;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;

@ControllerAdvice
public class StudentExceptionHnadler {
    @ExceptionHandler(StudentNotFound.class)
    @ResponseBody









    public StudentException handlingException (StudentNotFound ex) {
       StudentException se=new StudentException();
       se.setErrorName(ex.msg);
       se.setOccuringDate(String.valueOf(LocalDate.now()));
       return se;
    }
}
