package model.human.student;

import model.human.common.Functions;
import model.human.common.Human;

import java.time.LocalDate;

public class Student extends Human implements Functions {
    private Degree degree;

    public Student(int id, String firstName, String lastName, final LocalDate date, Degree degree) {
        super(id, firstName, lastName, date);
        this.degree = degree;
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
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
        return "Student{" +
                "degree=" + degree +
                "}\n";
    }
}