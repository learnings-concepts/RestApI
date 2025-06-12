package com.example.demoStudentApI.Controller;

import com.example.demoStudentApI.Entity.Student;
import com.example.demoStudentApI.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @Autowired
    StudentService studentService;


    @PostMapping("/Student")
    public String createStudent(@RequestBody Student student){

        studentService.Save(student);
        return "saved Student successfully";
    }
    @GetMapping("/Student")
    public List<Student> getAllStudents(){

        return  studentService.GetAllStudents();
    }
    @GetMapping("/Student/{id}")
    public Optional<Student> getStudentById(@PathVariable ("id") int id){
        return studentService.findById(id);
    }
    @PutMapping()
    public String UpdateStudent(@RequestBody Student student){
         studentService.UpdateStudent(student);
         return "StudentUpdatedSuccessfully";
    }
    @DeleteMapping("/Student/{id}")
    public String DeleteStudentById(@PathVariable ("id") int id){
        return studentService.deleteStudentById(id);
    }
}
