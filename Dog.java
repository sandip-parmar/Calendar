package inheritance;

public class Dog extends Animal {
	
private String Color;

	public void setColor(String color){
		this.color = color;
	}
	public void getColor()	{
		System.out.println("Color of Dog is " + Color);
	}
	
	public static void main (String[] args)	{
		Dog dog1= new Dog();
		dog1.setEye(2);
		dog1.setColor("brown");
		dog1.getColor();
		dog2.getEyes();
	}
}
