
import projetperson.Teacher;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dosen
 */
public class MainTeacher {

    public static void main(String[] args) {
        Teacher t1 = new Teacher("Paul Tan", "8 sunset way");
        System.out.println(t1);
        //Teacher: Paul Tan(8 sunset way)
        String[] courses = {"IM101", "IM102", "IM101"};
        for (String course : courses) {
            if (t1.addCourse(course)) {
                System.out.println(course + " added");
            } else {
                System.out.println(course + " cannot be added");
            }
        }
        //IM101 added
        //IM102 added
        //IM101 cannot be added
        for (String course : courses) {
            if (t1.removeCourse(course)) {
                System.out.println(course + " removed");
            } else {
                System.out.println(course + " cannot be removed");
            }
        }
        //IM101 removed
        //IM102 removed
        //IM101 cannot be removed
    }
}
