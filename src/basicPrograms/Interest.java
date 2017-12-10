package basicPrograms;

import java.util.Scanner;

public class Interest {

	public static void main(String args[])
	{
	int p,r,t,n=1;
	Scanner a = new Scanner (System.in);
	System.out.println("enter principle:");
	p = a.nextInt();
	System.out.println("enter rate:");
	r = a.nextInt();
	System.out.println("enter time:");
	t = a.nextInt();
	double si = ( p * r * t ) / 100;
	double ci = p * Math.pow( 1 + (r/n), n * t);
	System.out.println("simple interest:"+si);
	System.out.println("compound interest:"+ci);
}
}
