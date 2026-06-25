import java.util.Collections;

public class PersonOrderedSet extends PersonSet {
    //Override for when a person is added it also sorts it 
    @Override 
    public void add(Person p) { 
        super.add(p); 

        Collections.sort(people); 
    } 
} 
