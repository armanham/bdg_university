package model.human.professor;

import model.human.common.Functions;
import model.human.common.Human;
import model.subject.Subject;

import java.time.LocalDate;
import java.util.List;

public class Professor extends Human implements Functions {
    private double salary;
    private Degree degree;
    private List<Subject> subjects;

    public Professor(int id, String firstName, String lastName, final LocalDate date, double salary, Degree degree) {
        super(id, firstName, lastName, date);
        this.salary = salary;
        this.degree = degree;
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
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
        return "Professor{" +
                "salary=" + salary +
                ", degree=" + degree +
                ", subjects=" + subjects +
                "}\n";
    }
}