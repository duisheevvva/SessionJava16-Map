import database.DataBase;
import database.GenerateId;
import models.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Student student1 = new Student(1L,"Fatima","f@gmail.com");
        Student student2 = new Student(GenerateId.studentId(),"Fatima","f@gmail.com");
        Student student3 = new Student(GenerateId.studentId(),"Fatima","f@gmail.com");
        Student student4 = new Student(GenerateId.studentId(),"Fatima","f@gmail.com");

        student.addStudent(student1);
        student.addStudent(student2);
        student.addStudent(student3);
        student.addStudent(student4);
        student.addStudent(student4);

        System.out.println(DataBase.students);



    }
}