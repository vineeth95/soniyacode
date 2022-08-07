
public class SoniEncapDemo {
	
	int total_amount;
	public void generate_bill(int product_1, int product_2)
	{
		total_amount=product_1+product_2;
		System.out.println("User total bill amount is "+total_amount);
		
		
		
		
	}
	
	public static void main(String[] args) {
		SoniEncapDemo soni = new SoniEncapDemo(); 
		soni.generate_bill(10, 20);
		
	}

}
