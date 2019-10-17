package com.company.Lab1;

public class Main {

    public static void main(String[] args) {
	    Student firstStudent = new Student();
        Student secondStudent = new Student();
        Student thirdStudent = new Student();
        Student fourthStudent = new Student();

        University utm = new University();
        University usm = new University();

        firstStudent.age = 20;
        secondStudent.age = 20;
        thirdStudent.age = 20;
        fourthStudent.age = 20;

        firstStudent.mark = 10;
        secondStudent.mark = 9.5f;
        thirdStudent.mark = 8.7f;
        fourthStudent.mark = 3.2f;

        Student[] utmStudents = {firstStudent, secondStudent};
        Student[] usmStudents = {thirdStudent, fourthStudent};

        utm.students = utmStudents;
        utm.name = "Technical University of Moldova";
        utm.foundationYear = 1337;

        usm.students = usmStudents;
        usm.name = "State University of Moldova";
        usm.foundationYear = 1488;

        float commonAverage = (usm.findAverage() + utm.findAverage()) / 2;

        System.out.println(commonAverage);
    }

}

class University {
    String name;
    int foundationYear;
    Student[] students;


    float findAverage() {
        float average = 0;
        float sum = 0;

        for (int i = 0; i < students.length; i++) {
            sum += students[i].mark;
        }

        average = sum / students.length;

        return average;
    }
}

class Student {
    String name;
    int age;
    float mark;
}