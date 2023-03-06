package service;

import model.group.Group;
import model.human.professor.Professor;
import model.human.student.Student;
import repository.GroupRepository;

import java.util.List;

public class GroupService implements GroupRepository {
    @Override
    public void addGroup(Group group) {

    }

    @Override
    public Group deleteBy(String name) {
        return null;
    }

    @Override
    public Group getGroupBy(String name) {
        return null;
    }

    @Override
    public List<Group> getAllGroups() {
        return null;
    }

    @Override
    public int getCountOfAllGroups() {
        return 0;
    }

    @Override
    public List<Student> getStudentsBy(String groupName) {
        return null;
    }

    @Override
    public int getCountOfStudentsBy(String groupName) {
        return 0;
    }

    @Override
    public List<Professor> getProfessorsBy(String groupName) {
        return null;
    }
}