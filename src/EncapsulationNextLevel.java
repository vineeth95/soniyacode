
public class EncapsulationNextLevel {

	public void walking(String command)
	{
		System.out.println("Given command is "+command);
	}
	
	public void sleeping(String command)
	{
		System.out.println("You need to sleep at "+command);
	}
	
	public static void main(String[] args) {
		
		EncapsulationNextLevel sassy = new EncapsulationNextLevel();
		
		sassy.walking("walk fast sassy");
		
		sassy.sleeping("10 PM");
		
EncapsulationNextLevel bruno = new EncapsulationNextLevel();
		
		bruno.walking("walk slowly bruno");
		
		bruno.sleeping(" PM");
		
		
		
		
	}
}
