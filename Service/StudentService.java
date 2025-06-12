package com.example.demoStudentApI.Service;


import com.example.demoStudentApI.Entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface StudentService {
  public Student Save(Student student);
 public   List<Student> GetAllStudents();
 public Optional<Student> findById(int id);
 public String deleteStudentById(int id);
 public Student UpdateStudent(Student student);
}
