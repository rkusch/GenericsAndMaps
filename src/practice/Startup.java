/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author rkusch
 */
public class Startup {
    
    
    public static void main(String[] args) {
        Course c1 = new Course(22, "Advanced Java", 4);
        Course c2 = new Course(11, "Intro to Java", 4);
        Course c3 = new Course(44, "Distributed Java", 4);
        
        
        
        
        List<Course>  myCourses = new ArrayList<>();
        myCourses.add(c1);
        myCourses.add(c2);
        myCourses.add(c3);
        
        Collections.sort(myCourses, new CourseByName());
        
        for(Course c: myCourses) {
            System.out.println(c);   
        }
        
//        Collection<Course> col = myCourses.values();
//        List<Course> list = new ArrayList<>(col);
//        Collections.sort(list);
//        
//        for (Course c : list) {
//            System.out.println(c);
//        }
        
//        List<Course> myList = new ArrayList<>();
//        
//        
//        
//        myList.add(c1);
//        myList.add(c2);
//        myList.add(c3);
//        
//         System.out.println("Unsorted List......");
//        for (Course c : myList) {
//            System.out.println(c);
//        }
//        
//        Set<Course> mySet = new TreeSet<>(myList);
//        
//        System.out.println("Sorted List......");
//        for (Course c : mySet) {
//            System.out.println(c);
//        }
        
    }
}
