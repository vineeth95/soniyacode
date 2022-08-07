/*Operators program
 * Arithmetic operators - (+,-,*,/,%)
 * 
 * 
 * 
 * 
 */


public class OperatorDemo {
	
	public static void main(String[] args) {
		int a, b,add_result, sub_result,mul_result, c, sony_result;
		float div_result;
		float modulardivision_result;
		
		int tamil, english, maths, total_marks;
		
		tamil=99;
		english=80;
		maths=100;
		total_marks= tamil+english+maths;
		
		a=10;
		b=10;
		c=50;
		add_result = a+b;
		sub_result=a-b;
		mul_result=a*b;
		div_result=a/b;
		modulardivision_result = a%b;
		sony_result = a+b+c;
		
		
		System.out.println("Soni's total marks is "+total_marks +"/300");
		
		
		System.out.println("My addition result is " +add_result);
		System.out.println("My subraction result is "+sub_result);
		System.out.println("My multiplication result is "+mul_result);
		System.out.println("My division result is "+div_result);
		System.out.println("My modular division result is "+modulardivision_result);
		System.out.println("my sony 1st standard resul in maths "+sony_result);
		



		
		
	}

}
