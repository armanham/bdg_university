package repository;

import model.address.Address;
import model.human.professor.Degree;
import model.human.professor.Professor;

import java.util.List;

public interface ProfessorRepository {

    void add(Professor professor);

    Professor deleteBy(int id);

    List<Professor> deleteAll();

    List<Professor> getAll();

    List<Professor> getAllBy(String firstName);

    List<Professor> getAllBy(String firstName, String lastName);

    List<Professor> getAllBy(Degree degree);

    Professor getBy(int id);

    List<Address> getAddressListBy(int id);

    double getSalaryBy(int id);

    double getTotalSalary();
}