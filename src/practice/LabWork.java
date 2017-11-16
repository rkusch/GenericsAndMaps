/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import common.Movie;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author rkusch
 */
public class LabWork {

    public static void main(String[] args) {
        LabWork lab1 = new LabWork();
        
        
        Movie movie1 = new Movie("A", "AA");
        Movie movie2 = new Movie("C", "CC");
        Movie movie3 = new Movie("Z", "ZZ");
        Movie movie4 = new Movie("D", "DD");
        Movie movie5 = new Movie("E", "EE");
        

        Set<Movie> movies = new TreeSet<>();
        movies.add(movie1);
        movies.add(movie3);
        movies.add(movie2);
        movies.add(movie5);
        movies.add(movie5);
        movies.add(movie5);
        movies.add(movie5);
        movies.add(movie4);
        
        System.out.println("LAB 1");
        for (Movie movie: movies) {
            System.out.println(movie);
        }
        
        
        System.out.println("__________________________________");
        
        
        
        
        System.out.println("LAB 2");
        
        
        
        Map<String,Movie> hashMap = new HashMap<>();
        
        hashMap.put(movie5.toString(), movie5);
        hashMap.put(movie1.toString(), movie1);
        hashMap.put(movie2.toString(), movie2);
        
        for (int i = 0; i < hashMap.size(); i++) {
            
        }
        
         System.out.println("__________________________________");
         
         
        
        
    }
    


}
