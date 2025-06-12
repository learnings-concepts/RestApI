package com.example.demoStudentApI.Service;

import com.example.demoStudentApI.Entity.Student;
import com.example.demoStudentApI.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student Save(Student student) {

        return studentRepository.save(student);
    }

    @Override
    public List<Student> GetAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> findById(int id) {
        return studentRepository.findById(id);
    }

    @Override
    public String deleteStudentById(int id) {
        studentRepository.deleteById(id);
        return  "DeleteStudentBy Id Is Successfully";
    }

    @Override
    public Student UpdateStudent(Student student) {
        return studentRepository.save(student);
    }


}
