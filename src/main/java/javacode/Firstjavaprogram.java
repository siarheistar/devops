package javacode;

public class Firstjavaprogram {
		
	public static void main(String[] args) {
		int y;
		int z;
		y = multiply(3,100);
		z = subtract(100,40);

		System.out.println(y);
		System.out.println(z);
	}
	
	public static int multiply(int num1,int num2) { 
		int x = 0;
		
		switch(num1) {
			case 1:
				break;
		case 2:
			x =num1*num1;
			break;
		default:
			return num1*num2;
		}
		
		return x;
			
		
	}
	public static int subtract(int num1,int num2) {
		int m = 0;
		try {
			m = num1-num2;
			
		}
		catch(Exception e) {
		}
	
		return m;

	}

}
