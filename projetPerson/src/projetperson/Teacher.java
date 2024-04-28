/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetperson;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 *
 * @author dosen
 */
public class Teacher extends Person {

    private List<String> courses;

    public Teacher(String name, String address) {
        super(name, address);
        courses = new LinkedList<String>();
    }

    public boolean addCourse(String course) {
        Set s = new HashSet();
        if (s.add(course) == true) {
            courses.add(course);
            return true;
        } else {
            return false;
        }

    }

    /**
     * Removes a course. Returns false if the course cannot be found in the
     * course list
     */
    public boolean removeCourse(String course) {
        return courses.remove(course);
    }

    @Override
    public String toString() {
//        return "Teacher{" + "courses=" + courses + '}';
        String str = super.toString();
        str = str + "Jumlah course = " + courses.size() + "\n";
        for (int i=0; i < courses.size(); i++){
            str = str + courses.get(i) + "\n";
        }
        return str;
    }

}
