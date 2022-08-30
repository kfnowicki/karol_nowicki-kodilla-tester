package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> studentsList = new ArrayList<>();
        studentsList.add(new Student("Wiktor Rebrow", new Teacher("Michał Luczak")));
        studentsList.add(new Student("Iga Dobosz", null));
        studentsList.add(new Student("Adam Grzywaczewski",new Teacher("Konrad Markowski")));
        studentsList.add(new Student("Sylwester Wiśniak", null));


        System.out.println(studentsList);
        for(Student student : studentsList){
            System.out.println("Student: " + student.getName() + ", Teacher: " + getOptionalTeacherName(student));
        }
    }
    public static String getOptionalTeacherName(Student student){
        Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
        Teacher undefinedTeacher = new Teacher("<undefined>");
        return optionalTeacher.orElse(undefinedTeacher).getName();
    }
}
