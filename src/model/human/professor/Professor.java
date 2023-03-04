package model.human.professor;

import model.human.common.CommonFunctions;
import model.human.common.Human;

import java.time.LocalDate;

public class Professor extends Human implements CommonFunctions {
    private double salary;
    private DegreeTeacher degree;

    public Professor(String firstName, String lastName, final LocalDate date, double salary, DegreeTeacher degree) {
        super(firstName, lastName, date);
        this.salary = salary;
        this.degree = degree;
    }

    public DegreeTeacher getDegree() {
        return degree;
    }

    public void setDegree(DegreeTeacher degree) {
        this.degree = degree;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void participate() {
        System.out.println("I am teaching.");
    }

    @Override
    public void toBreak() {
        System.out.println("I drink a cup of coffee.");
    }

    @Override
    public String toString() {
        return super.toString() + "Professor{" +
                "salary=" + salary +
                "}\n";
    }
}