package basicPrograms;

public class Fibinacci {

	public static void main(String args[])
	{
	int prev=0,next=1,sum,n;
	
		for(n=1;n<=20;n++)
		{
		System.out.println(prev);
		sum=prev+next;
		prev=next;
		next=sum;

	}
}
}
