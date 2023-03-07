package repository;

import model.address.Address;
import model.human.professor.Professor;

import java.util.List;

public interface ProfessorRepository {

    void add(Professor professor);

    Professor deleteBy(int id);

    List<Professor> getAllBy(String firstName);

    List<Professor> getAllBy(String firstName, String lastName);

    Professor getBy(int id);

    //TODO getByDegree

    List<Address> getAddressListBy(int id);

    double getSalaryBy(int id);

    double getTotalSalary();
}