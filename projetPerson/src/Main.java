
import projetperson.Student;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dosen
 */
public class Main {

    public static void main(String[] args) {
        Student s1 = new Student("Tan Ah Teck", "1 Happy Ave");
        s1.addCourseGrade("IM101", 97);
        s1.addCourseGrade("IM102", 68);
//        System.out.println(s1.printGrades());
//        //Student: Tan Ah Teck(1 Happy Ave) IM101:97 IM102:68
//        System.out.println("Average is " + s1.getAverageGrade());
//        //Average is 82.5
        System.out.println("s1 = " + s1);
    }
}
