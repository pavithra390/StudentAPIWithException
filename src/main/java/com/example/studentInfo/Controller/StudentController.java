package com.example.studentInfo.Controller;
import com.example.studentInfo.Exception.StudentNotFound;
import com.example.studentInfo.Service.StudentService;
import com.example.studentInfo.StudentEntity.StudentDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    StudentService ss;
    @PostMapping(value="/addingStudentRecord")
    //http://localhost:1991/addingStudentRecord
    public String addingStudentRecord(@RequestBody StudentDetails sd){
        ss.addingStudentRecord(sd);
        return "record added successfully-->"+sd.getStudentId();
    }
    @GetMapping(value="/gettingParticularRecord/{studentId}")
    //http://localhost:1991/gettingParticularRecord/27
    public Optional<StudentDetails> gettingStudentRecord(@PathVariable("studentId") Integer studentId) throws StudentNotFound {
        Optional<StudentDetails> op= ss.gettingStudentRecord(studentId);
        if(!op.isPresent()){
            throw new StudentNotFound("Student not found******");
        }
        return op;
    }
     @GetMapping(value="/gettingAllRecords")
     //http://localhost:1991/gettingAllRecords
    public Iterable<StudentDetails> gettingAllRecords(){
        return ss.gettingAllRecords();
     }
     @DeleteMapping(value="/deletingparticularRecord")
     //http://localhost:1991/deletingparticularRecord?studentId=37
    public String deletingParticularRecord(@RequestParam("studentId")Integer id){
        ss.deleteStudentRecord(id);
        return "record deleted successfully-->"+id;
     }

}
