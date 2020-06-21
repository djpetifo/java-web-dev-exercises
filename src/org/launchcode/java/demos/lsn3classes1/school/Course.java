package org.launchcode.java.demos.lsn3classes1.school;

import java.util.ArrayList;

public class Course {

    private ArrayList<Student> courseRoster = new ArrayList<>();
    private String courseSubject;
    private String courseDepartment;

    public Course() {

    }

    public ArrayList<Student> getCourseRoster() {
        return courseRoster;
    }

    public void setCourseRoster(Student aStudent) {
        courseRoster.add(aStudent);
    }

    public String getCourseSubject() {
        return courseSubject;
    }

    public void setCourseSubject(String aSubjecct) {
        courseSubject = aSubjecct;
    }

    public String getCourseDepartment() {
        return courseDepartment;
    }

    public void setCourseDepartment(String aDepartment) {
        courseDepartment = aDepartment;
    }

}
