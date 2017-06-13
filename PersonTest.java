package abstractClasses;

public class PersonTest {
public static void main (String[] args)
{
	Person[] people = new Person[2];
	
	 people[0] = new Employee("parth", 50000, 1997, 7, 11);
	 people[1] = new Student("rahul", "computer science");
	 for (Person p : people)
		 
	 System.out.println(p.getName() + ", " + p.getDescription());
}
}
