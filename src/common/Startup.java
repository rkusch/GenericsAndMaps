/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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

//   1.Setup the Dog class in the
//   GenericsAndMaps sample project
//   to have a primary sort by 
//   rabiesId. Then create 4 dog
//   objects in a Startup class and
//   put those in a TreeSet. Make sure
//   you have one duplicate dog object.
//   Then loop over the set and output
//   the toString method to the console,
//   showing all dog properties. Verify
//   that the dogs are sorted by rabiesId
//   and that there are no duplicates.
//
//2. Using the same Dog class from #1 above
//   create an alternate sort to sort by
//   dog name. Create the same 4 dog objects
//   but this time store them in a List or
//   take your set and pass that to a list 
//   constructor. Now use the Collections
//   class to sort your dog objects by name.
//
//3. Put your Dog objects in a TreeMap as values.
//   Then retrieve the values as a Collection from
//   the map. Then convert the collection into
//   a list and use the Collections.sort method to
//   sort the list.
//
//4. Put your Dog objects in an array. Then sort
//   the array using the Arrays.sort method.
    public static void main(String[] args) {
        Dog dog1 = new Dog("Bob", 1, "a1021");
        Dog dog2 = new Dog("George", 8, "a101");
        Dog dog3 = new Dog("Kayla", 1, "a1301");
        Dog dog4 = new Dog("George", 8, "a101");
        //////////////////////////////////////////////// 
        Set<Dog> mySet = new TreeSet<>();
        mySet.add(dog1);
        mySet.add(dog2);
        mySet.add(dog3);
        mySet.add(dog4);

        for (Dog dog : mySet) {
            System.out.println(dog.toString());
        }
        System.out.println("//////////////////////////////////////////////");
        //////////////////////////////////////////////
        List<Dog> myList = new ArrayList<>();
        myList.add(dog1);
        myList.add(dog2);
        myList.add(dog3);
        myList.add(dog4);

        Collections.sort(myList, new DogByName());
        for (Dog dog : myList) {
            System.out.println(dog.getName());
        }
        System.out.println("//////////////////////////////////////////////");
        //////////////////////////////////////////////
        Map<String, Dog> myMap = new TreeMap<>();
        myMap.put(dog1.getRabiesId(), dog1);
        myMap.put(dog2.getRabiesId(), dog2);
        myMap.put(dog3.getRabiesId(), dog3);
        myMap.put(dog4.getRabiesId(), dog4);

        List<Dog> sortedList = new ArrayList<>();
        for (String dog : myMap.keySet()) {
            Dog value = myMap.get(dog);

            sortedList.add(value);
        }
        Collections.sort(sortedList);
        for (Dog dog : sortedList) {
            System.out.println(dog.toString());
        }

        System.out.println("//////////////////////////////////////////////");
        //////////////////////////////////////////////

        Dog[] myArray = new Dog[]{
            dog1, dog2, dog3, dog4
        };
        
        Arrays.sort(myArray);
        for (Dog dog: myArray) {
            System.out.println(dog);
        }
    }
}
