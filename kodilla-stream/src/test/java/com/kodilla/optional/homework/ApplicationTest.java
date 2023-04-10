package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApplicationTest {

    @Test
    public void StudentsTeacherName(){
        Student student = new Student("Julek", new Teacher("teacher"));
        String resultName = Student.getTeacherName(student);
        String expectedTeacherName = "teacher";
        assertEquals(expectedTeacherName, resultName );
    }

    @Test
    public void NullStudentsTeacherName(){
        Student student = new Student("Jurek", null);
        String resultName = Student.getTeacherName(student);
        String expectedTeacherName = "<undefined>";
        assertEquals(expectedTeacherName, resultName);
    }
}
