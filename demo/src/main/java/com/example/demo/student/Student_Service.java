package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class Student_Service {

    private final Student_Repository studentRepository;

    @Autowired
    public Student_Service(Student_Repository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student_Model> getStudents() {
        return studentRepository.findAll();
    }

    public void addNewStudent(Student_Model student) {
        Optional<Student_Model> studentModelOptional = studentRepository
                .findStudent_ModelByEmail(student.getEmail());

        if (studentModelOptional.isPresent()) {
            throw new IllegalStateException("Email taken");
        }
        studentRepository.save(student);
    }

    public void deleteStudent(Long studentId) {
        boolean exists = studentRepository.existsById(studentId);
        if (!exists) {
            throw new IllegalStateException("Student with id "
                    + studentId + " does not exists");
        }

        studentRepository.deleteById(studentId);
    }

    @Transactional
    public void updateStudent(Long studentId, String name, String email) {
        Student_Model student_model = studentRepository.findById(studentId)
                .orElseThrow(() -> new IllegalStateException("student by id " +
                        studentId + "does not exists"));

        if (name != null && name.length() > 0 && !Objects.equals(student_model.getName(), name)) {
            student_model.setName(name);
        }

        if (email != null && email.length() > 0 && !Objects.equals(student_model.getEmail(), email)) {
            Optional<Student_Model> studentModelOptional = studentRepository
                    .findStudent_ModelByEmail(email);
            if (studentModelOptional.isPresent()) {
                throw new IllegalStateException("email taken");
            }
            student_model.setEmail(email);
        }
    }
}
