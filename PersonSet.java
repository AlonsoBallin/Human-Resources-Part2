import java.util.ArrayList; 

public class PersonSet implements PersonList {
    
    protected ArrayList<Person> people; 

    public PersonSet() { 
        people = new ArrayList<Person>(); 
    } 

    @Override 
    public void add(Person P) { 
        if(!people.contains(P)) { 
            people.add(P); 
        }
    } 

    @Override 
    public Person get(int index) { 
        return people.get(index); 
    }

    @Override 
    public String toString() { 
        String result = ""; 

        for(Person p : people) { 
            result += p + "\n"; 
        } 

        return result; 
    }
}
