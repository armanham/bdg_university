package service;

import model.address.Address;
import model.human.professor.Degree;
import model.human.professor.Professor;
import repository.ProfessorRepository;

import java.util.ArrayList;
import java.util.List;

public class ProfessorService implements ProfessorRepository {

    private List<Professor> professors = new ArrayList<>();


    @Override
    public void add(Professor professor) {
        if (professor == null) {
            System.out.println("Passed null value: ");
            return;
        }
        for (Professor item : professors) {
            if (item.getId() == professor.getId()) {
                System.out.print("Id already exists: ");
                return;
            }
        }
        professors.add(professor);
    }


    @Override
    public Professor deleteBy(int id) {
        if (id <= 0) {
            System.out.println("Passed parameter must be positive number:");
            return null;
        }

        for (int i = 0; i < professors.size(); i++) {
            if (id == professors.get(i).getId()) {
                return professors.remove(i);
            }
        }
        return null;
    }


    @Override
    public List<Professor> deleteAll() {
        List<Professor> deletedProfessors = new ArrayList<>();
        for (int i = 0; i < professors.size(); i++) {
            deletedProfessors.add(professors.remove(i));
        }

        return deletedProfessors;
    }


    @Override
    public List<Professor> getAll() {
        return professors;
    }


    @Override
    public List<Professor> getAllBy(String firstName) {
        if (firstName == null || firstName.isEmpty()) {
            System.out.println("Passed null or empty value");
            return null;
        }

        List<Professor> professorsByFirstName = new ArrayList<>();
        for (Professor item : professors) {
            if (item.getFirstName().equals(firstName)) {
                professorsByFirstName.add(item);
            }
        }
        return professorsByFirstName;
    }


    @Override
    public List<Professor> getAllBy(String firstName, String lastName) {
        if (firstName == null || lastName == null || firstName.isEmpty() || lastName.isEmpty()) {
            System.out.println("Passed null or empty value");
            return null;
        }

        List<Professor> professorsByFullName = new ArrayList<>();
        for (Professor item : professors) {
            if (item.getFirstName().equals(firstName) && item.getLastName().equals(lastName)) {
                professorsByFullName.add(item);
            }
        }
        return professorsByFullName;
    }


    @Override
    public List<Professor> getAllBy(Degree degree) {
        if (degree == null) {
            System.out.println("Passed null value: ");
            return null;
        }

        List<Professor> professorsByDegree = new ArrayList<>();
        for (Professor item : professors) {
            if (item.getDegree().equals(degree)) {
                professorsByDegree.add(item);
            }
        }
        return professorsByDegree;
    }


    @Override
    public Professor getBy(int id) {
        if (id <= 0) {
            System.out.println("Passed parameter must be positive number:");
            return null;
        }

        for (Professor item : professors) {
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

        for (Professor item : professors) {
            if (item.getId() == id) {
                return item.getAddresses();
            }
        }
        return null;
    }


    @Override
    public double getSalaryBy(int id) {
        if (id <= 0) {
            System.out.println("Passed parameter must be positive number:");
            return -1;
        }

        for (Professor item : professors) {
            if (item.getId() == id) {
                return item.getSalary();
            }
        }
        return -1;
    }


    @Override
    public double getTotalSalary() {
        double total = 0;
        for (Professor item : professors) {
            total += item.getSalary();
        }
        return total;
    }
}