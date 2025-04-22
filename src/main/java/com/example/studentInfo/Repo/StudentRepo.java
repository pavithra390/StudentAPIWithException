package com.example.studentInfo.Repo;
import com.example.studentInfo.StudentEntity.StudentDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface StudentRepo extends CrudRepository<StudentDetails, Integer> {
}
