package com.company;

import java.util.ArrayList;
import java.util.List;

class University {
    private String name;
    private int foundationYear;
    private List<Student> students;

    public University(String name, int foundationYear){
        this.name = name;
        this.foundationYear=foundationYear;
        this.students = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public void setFoundationYear(int foundationYear) {
        this.foundationYear = foundationYear;
    }
    public int getFoundationYear() {
        return this.foundationYear;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
    public List<Student> getStudents() {
        return this.students;
    }

    public void addStudent(Student studentToAdd) {
        this.students.add(studentToAdd);
    }

    public float getAverageMedia() {
        float result = 0;
        for (Student student : this.students) {
            result = result + student.getMark();
        }

        return result / (students.size());
    }
}
