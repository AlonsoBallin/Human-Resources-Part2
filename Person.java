/* 
Alonso Reyes Dominguez 
06/14/2026 
Purpose: Stores the name, height, and weight of the person as well converts it 
         to readable string format. 
Sources: Used our old homeworks of HurricaneRowData.java to help fill this out. 
         Also used the link Overriding equal method by GeeksForGeeks to fill out
         the equals method. 
		
*/ 
public class Person implements Comparable<Person> {
    
    //Private variables for information 
    private String name; 
    private double height; 
    private double weight; 

    public Person(String name,double height,double weight) { 
        
        this.name = name; 
        this.height = height; 
        this.weight = weight; 
    } 

    //Getters 
    public double getHeight() { 
        return height; 
    }

    public double getWeight() { 
        return weight; 
    }  

    public String getName(){ 
        return name; 
    }

    public void setHeight(double height) { 
        this.height = height; 
    } 

    public void setWeight(double weight) { 
        this.weight = weight; 
    }

    //toString method that converts the information in readable string format 
    @Override 
    public String toString() { 
        return name + ", " + height + ", " + weight; 
    }

    //boolean to return true or false depending on the situation 
    @Override 
    public boolean equals(Object o) {
        //if o is null  
        if(o == null) { 
            return false; 
        } 
        //if o is this 
        if(o == this) { 
            return true; 
        } 

        if (!(o instanceof Person)) { 
            return false; 
        }

        Person p = (Person) o; 

        return name.equals(p.name) && height == p.height && weight == p.weight; 
    }  

    @Override 
    public int compareTo(Person p) { 
        return name.compareTo(p.getName());  
    }
}
