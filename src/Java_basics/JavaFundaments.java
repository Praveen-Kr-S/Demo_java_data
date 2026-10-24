package Java_basics;

public class JavaFundaments {

	public static void main(String[] args) {
		
		/*
		 * Syntax of variable
		 * 
		 * Datatype variable_name = Data;
		 * 
		 */
		
		int ab=10;
		System.out.println(ab);
		
//		gb->mb->kb->byte->1byte=8bit
		
//		boolean   -> true/false -> 1bit
		
		boolean a = true;
		
//		Character -> 'single_letter' -> 'A'
		char b='C';
		System.out.println(b);
		
		float f = 12.6764f;
		System.out.println(f);
		
		int b1 = 32769;
		System.out.println(b1);
		
		
		
//		windening -> lower to higher
		
		byte c1 = 127;
		System.out.println(c1);
		short c2 = c1;
		System.out.println(c2);
				
		
//		Narrowing
		
		char d1 = 130;
		System.out.println(d1);
		byte d2 = (byte) d1;
		System.out.println(d2);
		
		
		
		
//		Arthimetic Operator -> +,-,*,/,%
		
	int a1 = 5;
	int a2 = 2;
	System.out.println(a1+a2);
	System.out.println(a1-a2);
	System.out.println(a1*a2);
	System.out.println(a1/a2);
	System.out.println(a1%a2);
	
//	find area of triangle -> 1/2*b*h
	
	int br = 40;
	int h = 60;
	double tri = 0.5*br*h;
	System.out.println("area of triangle :"+tri);
		
//	find area of circle -> pi*Math.pow(r,2)
	float pi = 3.14f;
	int r = 40;
	System.out.println("area of Circle :"+(pi*Math.pow(r, 2)));
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	}

}
