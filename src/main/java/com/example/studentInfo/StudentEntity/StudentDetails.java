package com.example.studentInfo.StudentEntity;
import jakarta.persistence.*;

@Entity
@Table
public class StudentDetails {
    //Here we are declaring Columns  for our table
    @Column //Specifying create column in database by using this variable
    @Id    //Indicating this is(studentId) primary key for our StudentDetails table
    private Integer studentId;
    @Column
    private String studentName;
    @Column
    private String studentSurname;
    @Column
    private Integer studentAge;
    @Column
    private String studentGender;
    @OneToOne(cascade = CascadeType.ALL)//Establishing one to one connection between 2 tables
    //Joining the Student address table using reference column
    //Here Id is primary key in StudentAddress table which is foreign key in StudentDetails table
    @JoinColumn(name="Address_Student",referencedColumnName ="Id")
     private StudentAddress studentAddress;

    //Declaring default constructor
    public StudentDetails(){
    }
    //Declaring Parameterised Constructor
    public StudentDetails(Integer studentId, String studentName, String studentSurname, Integer studentAge, String studentGender,StudentAddress studentAddress) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.studentAge = studentAge;
        this.studentGender = studentGender;
        this.studentAddress=studentAddress;
    }

    //Declaring getters and setters for our variables

    public Integer getStudentId() {

        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }
    public String getStudentName() {

        return studentName;
    }

    public void setStudentName(String studentName) {

        this.studentName = studentName;
    }

    public String getStudentSurname() {

        return studentSurname;
    }

    public void setStudentSurname(String studentSurname) {

        this.studentSurname = studentSurname;
    }

    public Integer getStudentAge() {

        return studentAge;
    }

    public void setStudentAge(Integer studentAge) {

        this.studentAge = studentAge;
    }

    public String getStudentGender() {

        return studentGender;
    }

    public void setStudentGender(String studentGender) {

        this.studentGender = studentGender;
    }
    public StudentAddress getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(StudentAddress studentAddress) {
        this.studentAddress = studentAddress;
    }

}
