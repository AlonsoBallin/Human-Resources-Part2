/* 
Alonso Reyes Dominguez 
06/20/2026 
Purpose: Converts height and weight to inches and pounds.  
         
Sources: Searched google for the conversions.  
*/
import java.util.Collections; 

public class PersonImperialSet extends PersonSet {
    @Override 
    public void add(Person p) { 
        //Converts from cm to in. and stores it 
        double inches = convertHeight(p.getHeight()); 
        p.setHeight(inches); 

        //Converts from kg to pounds and stores it 
        double pounds = convertWeight(p.getWeight()); 
        p.setWeight(pounds);  

        //To sort the list 
        super.add(p); 
        Collections.sort(people); 
    }

    //To convert from cm to inches
    private double convertHeight(double height) { 
        double inches = height / 2.54; 
        return inches; 
    } 
    //To convert from kg to pounds 
    private double convertWeight(double weight) { 
       double pounds = weight * 2.205; 
      return pounds; 
    }
}