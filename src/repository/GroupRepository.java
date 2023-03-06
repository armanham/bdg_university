package repository;

import model.group.Group;
import model.human.professor.Professor;
import model.human.student.Student;

import java.util.List;

public interface GroupRepository {

    void addGroup(Group group);

    Group deleteBy(String name);

    Group getGroupBy(String name);

    List<Group> getAllGroups();

    int getCountOfAllGroups();

    List<Student> getStudentsBy(String groupName);

    int getCountOfStudentsBy(String groupName);

    List<Professor> getProfessorsBy(String groupName);
}