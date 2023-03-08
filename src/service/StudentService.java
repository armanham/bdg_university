package service;

import model.address.Address;
import model.human.student.Degree;
import model.human.student.Student;
import repository.StudentRepository;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements StudentRepository {

    private List<Student> students = new ArrayList<>();


    @Override
    public void add(Student student) {
        if (student == null) {
            System.out.println("Passed null value");
            return;
        }
        for (Student item : students) {
            if (item.getId() == student.getId()) {
                System.out.print("Id already exists: ");
                return;
            }
        }
        students.add(student);
    }


    @Override
    public Student deleteBy(int id) {
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
    public List<Student> deleteAll() {
        List<Student> deletedStudents = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            deletedStudents.add(students.remove(i));
        }

        return deletedStudents;
    }


    public List<Student> getAll() {
        return students;
    }

    @Override
    public List<Student> getAllBy(String firstName) {
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
    public List<Student> getAllBy(String firstName, String lastName) {
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
    public List<Student> getAllBy(Degree degree) {
        if (degree == null) {
            System.out.println("Passed null value: ");
            return null;
        }

        List<Student> studentsByDegree = new ArrayList<>();
        for (Student item : students) {
            if (item.getDegree().equals(degree)) {
                studentsByDegree.add(item);
            }
        }
        return studentsByDegree;
    }


    @Override
    public Student getBy(int id) {
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


    @Override
    public List<Address> getAddressListBy(int id) {
        if (id <= 0) {
            System.out.println("Passed parameter must be positive number:");
            return null;
        }

        for (Student item : students) {
            if (item.getId() == id) {
                return item.getAddresses();
            }
        }
        return null;
    }
}