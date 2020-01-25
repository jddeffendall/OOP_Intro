package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Student {

    int id;
    String name;
    HashMap<Integer,Double> grades;
    List<Course> enrolledCourses;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
        this.grades = new HashMap<>();
    }

    public void displayCourses() {
        System.out.println(name + " has enrolled in the following courses: ");
        for (int i = 0; i < enrolledCourses.size(); i++) {
            System.out.println("ID: " + enrolledCourses.get(i).getId());
            System.out.println("Code: " + enrolledCourses.get(i).getCode());
            System.out.println("Name: " + enrolledCourses.get(i).getName());
            System.out.println("Description: " + enrolledCourses.get(i).getDescription());
            System.out.println("Credits: " + enrolledCourses.get(i).getCredit() + "\n");
        }
    }

    public double calculateGPA() {
        double gradeSum = 0;
        int creditSum = 0;

        for (int i = 0; i < grades.size(); i++) {
            gradeSum += (enrolledCourses.get(i).getCredit()) * grades.get(enrolledCourses.get(i).getId());
            creditSum += enrolledCourses.get(i).getCredit();
        }

        double GPA = gradeSum / creditSum;

        return GPA;
    }

    public void enrollCourse(Course course) {
        enrolledCourses.add(course);
    }

    public boolean setGrade(Course course, double grade) {
        if (enrolledCourses.contains(course)) {
            grades.put(course.getId(), grade);
            return true;
        } else {
            return false;
        }
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public static void main(String[] args) {
        Student myStudent = new Student(1, "Jacob");
        Course course1 = new Course(1, 222, "CS222", "Advanced Programming", 3);
        Course course2 = new Course(2, 224, "CS224", "Intro to Algorithms", 3);

        myStudent.enrollCourse(course1);
        myStudent.enrollCourse(course2);
        myStudent.displayCourses();
    }

}