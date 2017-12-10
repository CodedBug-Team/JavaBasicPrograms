package basicPrograms;

import java.util.Scanner;

public class Temperature {
	
	public static void main(String args[])
	{
	float temp;
	Scanner in = new Scanner(System.in);	
	System.out.println("enter temperature in centigrade:");
	temp = in.nextFloat();
	temp = ((temp * (9/5))+32);
	System.out.println("Temperature is :"+temp);
}

}
