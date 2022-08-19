package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class School {
    private String name;
    List<Integer> studentsPerClass;

    public School(String name, List<Integer> studentsPerClass) {
        this.name = name;
        this.studentsPerClass = studentsPerClass;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getStudentsPerClass() {
        return studentsPerClass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return Objects.equals(name, school.name) && Objects.equals(studentsPerClass, school.studentsPerClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, studentsPerClass);
    }

    public int getTotalNumberOfStudents(){
        int totalNumberOfStudents = 0;
        for (int classQuantity : studentsPerClass)
            totalNumberOfStudents += classQuantity;
        return totalNumberOfStudents;
    }
}
