/*
This code is provided to give you a
starting place. It should be modified.
No further imports are needed.
To earn full credit, you must also
answer the following questions:

Q1: Car and Engine are related
by which, Inheritance or Composition?
They are related by composition. 

Q2: Color and Red are related
by which, Inheritance or Composition?
They are related by inheritance. 

Q3: Shirt and Clothing are related
by which, Inheritance or Composition? 
They are related by inheritance. 

Q4: Furniture and Desk are related
by which, Inheritance or Composition? 
They are related by inheritance. 

Q5: CellPhone and Battery are related
by which, Inheritance or Composition? 
They are related by composition. 
Alonso Reyes Dominguez 
06/20/2026 
Purpose: Read data from the txt file and display it.  
         
Sources: Asked chatgpt how to use the try/catch method as I forgot. 
*/
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		
		//Person test 
		System.out.println(); 
		Person personTest = new Person("Mac", 168, 90); 
		System.out.println(personTest); 

		//PersonOrderedSet array to make it listed alphabetically 
		PersonOrderedSet people = new PersonOrderedSet(); 

		try { 
		//To scan the file 
			File file = new File(args[0]); 
			Scanner fileReader = new Scanner(file);   

			//Skipping Header 
			fileReader.next(); 
			fileReader.next(); 
			fileReader.next(); 
			fileReader.next(); 
			fileReader.next(); 
		
			//While loop to get the information and store in PersonSet. 
			while(fileReader.hasNext()) { 
				String name = fileReader.next();
				double height = fileReader.nextDouble();
				double weight = fileReader.nextDouble();

				Person p = new Person(name, height, weight); 

				people.add(p);  
			} 
			
			//Prints the list with no duplicates from the txt file 
			System.out.println(people); 

			fileReader.close(); 
		}
		catch (IOException e) { 
			System.out.println("Error: Couldn't read file"); 
		}
		
		
		/*try
		{	
			FileWriter fileWriterOrder = new FileWriter("outputfile.txt");
			fileWriterOrder.write("testing");
			fileWriterOrder.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
			System.out.println(e);
			System.exit(1);
		}*/
	}
}
