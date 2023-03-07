package repository;

import model.address.Address;
import model.human.student.Student;

import java.util.List;

public interface StudentRepository {

    void add(Student student);

    Student deleteBy(int id);

    List<Student> getAllBy(String firstName);

    List<Student> getAllBy(String firstName, String lastName);

    Student getBy(int id);

    //TODO getByDegree

    List<Address> getAddressListBy(int id);
}