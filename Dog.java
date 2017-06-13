package inheritance;

public class Dog extends Animal {
String Color;
void color()
{
 System.out.println("Color of Dog  " + Color);
}
public static void main (String[] args)
{
	Dog d1= new Dog();
	d1.eye= 2 ;
	d1.Color= "brown";
	d1.color();
	d1.eyes();
}
}
