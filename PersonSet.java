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

    //toString method that makes a persons data into string 
    @Override 
    public String toString() { 
        String result = ""; 

        for(int i = 0; i < people.size(); i++) { 
            result += people.get(i) + "\n"; 
        } 

        return result; 
    } 
}
