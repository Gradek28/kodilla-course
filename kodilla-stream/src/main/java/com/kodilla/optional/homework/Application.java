package com.kodilla.optional.homework;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
// Po kolekcji hashset mozna iterowac w petli
public class Application {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        Teacher teacher = new Teacher("Teacher");
        students.add(new Student("Julek", new Teacher("JulekTeacher")));
        students.add(new Student("Ada", null));
        students.add(new Student("Jurek", new Teacher("JurekTeacher")));
        students.add(new Student("Dorota", teacher));
        students.add(new Student("Basia", null));



        for(Student student : students){
            System.out.println("Uczeń: " + student.getName()
                    + ", nauczyciel: " + Student.getTeacherName(student));
        }
    }
}
