package model.human.student;

import model.human.common.CommonFunctions;
import model.human.common.Human;

import java.time.LocalDate;

public class Student extends Human implements CommonFunctions {
    private int id;
    private Degree degree;

    public Student(String firstName, String lastName, final LocalDate date, int id, Degree degree) {
        super(firstName, lastName, date);
        this.id = id;
        this.degree = degree;
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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