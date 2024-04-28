/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetperson;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author dosen
 */
public class Student extends Person {

//    private int numCourses;
    private List<String> courses;
    private List<Integer> grades;

    public Student(String name, String address) {
        super(name, address);
        courses = new LinkedList<String>();
        grades = new LinkedList<Integer>();
    }

    public void addCourseGrade(String course, int grade) {
//        courses[numCourses] = course;
//        grades[numCourses] = grade;
//        ++numCourses;
        courses.add(course);
        grades.add(grade);
    }

    /**
     * Prints all courses taken and their grade
     */
    public String printGrades() {
//        System.out.print(this);
        String str = "";
        for (int i = 0; i < grades.size(); ++i) {
//            System.out.print(" " + courses.get(i) + ":" + grades.get(i));
            str = str + courses.get(i) + ":" + grades.get(i) + "\n";
        }
        System.out.println("");
        return str;
    }

    /**
     * Computes the average grade
     */
    public double getAverageGrade() {
        int sum = 0;
        for (int i = 0; i < grades.size(); i++) {
            sum += grades.get(i);
        }
        return (double) sum / grades.size();
    }

    @Override
    public String toString() {
        String str = super.toString();
        str = str + this.printGrades();
        str = str + "Average is " + getAverageGrade() + "\n";
        return str;
//        return "Student{" + "courses=" + courses + ", grades=" + grades + '}';
    }

}
