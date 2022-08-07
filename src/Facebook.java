
public class Facebook {

	public void check_password(String email, String password)
	{
		System.out.println("User email is "+ email);
		System.out.println("User password is "+password);
	}
	
	public static void main(String[] args) {
		Facebook soniya = new Facebook();
		
		soniya.check_password("soniya@gmail.com", "Soniya123");
		
		Facebook mark = new Facebook();
		
		mark.check_password("mark@gmail.com", "mark12345");
	}
}
