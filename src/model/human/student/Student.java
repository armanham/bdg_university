package model.human.student;

import model.human.common.CommonFunctions;
import model.human.common.Human;

import java.time.LocalDate;

public class Student extends Human implements CommonFunctions {
    private String id;
    private DegreeStudent degree;

    public Student(String firstName, String lastName, LocalDate date, String id, DegreeStudent degree) {
        super(firstName, lastName, date);
        this.id = id;
        this.degree = degree;
    }

    public DegreeStudent getDegree() {
        return degree;
    }

    public void setDegree(DegreeStudent degree) {
        this.degree = degree;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void participate() {
        System.out.println("I study.");
    }

    @Override
    public void toBreak() {
        System.out.println("I am hungry.");
    }

    @Override
    public String toString() {
        return super.toString() + "Student{" +
                "id='" + id + '\'' +
                "}\n";
    }
}