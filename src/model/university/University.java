package model.university;

import model.address.Address;
import model.course.Course;

import java.util.List;

public class University {
    private List<Course> courses;
    private String name;
    private Address address;

    public University(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "University{" +
                "courses=" + courses +
                ", name='" + name + '\'' +
                ", model.address=" + address +
                "}\n";
    }
}