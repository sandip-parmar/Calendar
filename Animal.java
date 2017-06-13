package inheritance;

public class Animal {
private int eye;
	
	public int setEyes(int number){
		this.eye = number;
	}
	public void getEyes()
	{
		System.out.println("A dog has" + eye + " eyes");
	}
}
