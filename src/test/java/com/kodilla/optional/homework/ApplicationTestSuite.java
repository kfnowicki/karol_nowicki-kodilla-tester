package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;

import java.awt.*;
import java.awt.color.ICC_ColorSpace;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTestSuite {

    @Test
    void testPresentTeacher(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Marta Siwa", new Teacher("Ewa Wityńska")));
        students.add(new Student("Natalia Tatarkiewicz", new Teacher("Krzysztof Starowicz")));
        for (Student student : students)
            assert (Application.getOptionalTeacherName(student) != "<undefined>");
    }

    @Test
    void testAbsentTeacher(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Marta Siwa", null));
        students.add(new Student("Natalia Tatarkiewicz", null));
        for (Student student : students)
            assert (Application.getOptionalTeacherName(student) == "<undefined>");
    }

}