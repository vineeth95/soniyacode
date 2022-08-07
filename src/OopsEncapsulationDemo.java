//Encapsulation in Java is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit


public class OopsEncapsulationDemo {

	int total_marks;
	
	public void adding_marks(int tamil, int english)  //creating a method
	{
		total_marks=tamil+english;
		System.out.println("Student total marks is "+total_marks);
	}
	

public static void main(String[] args) {
OopsEncapsulationDemo soni = new OopsEncapsulationDemo();  //object initialization for soni

soni.adding_marks(99, 100); //calling above method using soni object

OopsEncapsulationDemo vineeth = new OopsEncapsulationDemo();  //object initialization for vineeth
 
	
vineeth.adding_marks(40, 80); //calling above method using vineeth object
}
}
