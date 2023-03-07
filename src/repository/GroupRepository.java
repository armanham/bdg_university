package repository;

import model.group.Group;
import model.human.professor.Professor;
import model.human.student.Student;

import java.util.List;

public interface GroupRepository {

    void add(Group group);

    Group deleteBy(String name);

    Group getBy(String name);

    List<Group> getAll();

    int getCountOfAll();

    List<Student> getStudentsBy(String groupName);

    int getCountOfStudentsBy(String groupName);

    List<Professor> getProfessorsBy(String groupName);
}