/* 
Alonso Reyes Dominguez 
06/20/2026 
Purpose: Sorts the list of names in alphabetical order.  
         
Sources: Used the Collections.sort() talked about in the instructions. 
*/

import java.util.Collections;

public class PersonOrderedSet extends PersonSet {
    //Override for when a person is added it also sorts it 
    @Override 
    public void add(Person p) { 
        super.add(p); 

        Collections.sort(people); 
    } 
} 
