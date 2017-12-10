package basicPrograms;

import java.util.Scanner;

public class ArithmeticOperations {

	public static void main(String args[])
	{
	double num1,num2,s,m,p,d;
	Scanner a = new Scanner (System.in);
	System.out.println("enter values of two numbers");
	num1 = a.nextDouble();	
	num2 = a.nextDouble();
	s = num1+num2;
	m = num1 - num2;
	p = num1 * num2 ;
	d = num1/num2;
	System.out.println("sum is: "+s);
	System.out.println("difference is"+m);
	System.out.println("product is"+p);
	System.out.println("division is"+d);
}
}
