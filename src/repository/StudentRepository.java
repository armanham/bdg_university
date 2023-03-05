package repository;

import model.human.student.Student;

import java.util.List;

public interface StudentRepository {

    void addStudent(Student student);

    Student deleteStudentById(int id);

    List<Student> getByFirstName(String firstName);

    List<Student> getByFullName(String firstName, String lastName);

    Student getById(int id);
}