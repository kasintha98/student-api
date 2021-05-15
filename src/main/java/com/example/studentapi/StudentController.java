package com.example.studentapi;

import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
public class StudentController {

    StudentRespository repository = new InMemeoryStudentRepository();

    //REST ENDPOINTS
    //create a student
    @PostMapping("/student")
    public void createStudent(@RequestBody Student student){
        repository.save(student);
    }

    //retrieve a student
    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable String id){
        return repository.get(id);
    }

    //delete a student
    @DeleteMapping("/student/{id}")
    public void deleteStudent(@PathVariable("id") String id){
          repository.delete(id);
          System.out.println("Student deleted from the database!");
    }

    //update a student
    @PutMapping ("/student")
    public void updateStudent(@RequestBody Student student){
        repository.update(student);
    }
}
