package model.course;


import model.human.professor.Professor;
import model.human.student.Student;

import java.util.List;

public class Course {
    private String name;
    private Professor professor;
    private List<Student> students;

    public Course(String name, Professor professor, List<Student> students) {
        this.name = name;
        this.professor = professor;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", teacher=" + professor +
                ", students=" + students +
                "}\n";
    }
}