package service;

import model.human.student.Student;
import repository.StudentRepository;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements StudentRepository {

    private List<Student> students = new ArrayList<>();

    @Override
    public void addStudent(Student student) {
        if (student == null) {
            System.out.println("Passed null value");
            return;
        }
        students.add(student);
    }


    @Override
    public Student deleteStudentById(int id) {
        if (id <= 0) {
            System.out.println("Passed parameter must be positive number:");
            return null;
        }

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                return students.remove(i);
            }
        }
        return null;
    }


    @Override
    public List<Student> getByFirstName(String firstName) {
        if (firstName == null || firstName.isEmpty()) {
            System.out.println("Passed null or empty value");
            return null;
        }

        List<Student> studentsByFirstName = new ArrayList<>();
        for (Student item : students) {
            if (item.getFirstName().equals(firstName)) {
                studentsByFirstName.add(item);
            }
        }
        return studentsByFirstName;
    }


    @Override
    public List<Student> getByFullName(String firstName, String lastName) {
        if (firstName == null || lastName == null || firstName.isEmpty() || lastName.isEmpty()) {
            System.out.println("Passed null or empty value");
            return null;
        }

        List<Student> studentsByFullName = new ArrayList<>();
        for (Student item : students) {
            if (item.getFirstName().equals(firstName) && item.getLastName().equals(lastName)) {
                studentsByFullName.add(item);
            }
        }
        return studentsByFullName;
    }


    @Override
    public Student getById(int id) {
        if (id <= 0) {
            System.out.println("Passed parameter must be positive number:");
            return null;
        }
        for (Student item : students) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }
}