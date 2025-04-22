package com.example.studentInfo.Service;
import com.example.studentInfo.Repo.StudentRepo;
import com.example.studentInfo.StudentEntity.StudentDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    StudentRepo sr;
    public void addingStudentRecord(StudentDetails sd){
        sr.save(sd);
    }
    public Optional<StudentDetails> gettingStudentRecord(Integer studentId){
       return sr.findById(studentId);
    }
    public Iterable<StudentDetails> gettingAllRecords(){
        return sr.findAll();
    }
    public void deleteStudentRecord(Integer studentId){
        sr.deleteById(studentId);
    }
}
