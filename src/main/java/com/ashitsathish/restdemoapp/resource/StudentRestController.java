package com.ashitsathish.restdemoapp.resource;

import com.ashitsathish.restdemoapp.exceptionhandler.StudentNotFoundException;
import com.ashitsathish.restdemoapp.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    List<Student> studentList ;

    @PostConstruct
    public void loadData(){
        studentList = new ArrayList<>();
        studentList.add(new Student("Ashit","Sathish"));
        studentList.add(new Student("Shlok","Ankit"));
        studentList.add(new Student("Hema","Sathish"));
        studentList.add(new Student("Anvit","Surendra"));
    }

    // define endpoint for /students - Returns a List of Students.
    @GetMapping("/students")
    public List<Student> getStudents(){
        return studentList;
    }

    // define endpoint for /student/{studentId} - return student by id.
    @GetMapping("/student/{studentId}")
    public Student getIndividualStudent(@PathVariable int studentId) {

        // check the studentId against the list.
        if(studentId>= studentList.size() || studentId<0){
            throw new StudentNotFoundException("Student ID Not Found - " + studentId);
        }
        return studentList.get(studentId);
    }

}
