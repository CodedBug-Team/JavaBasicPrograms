package pattern;

class TreePattern1{
	public static void main(String args[])
	             {
		int i,j;
		for(i=0;i<=5;i++)
		{
		for(j=5;j>=1;j--)
		{
		if(j<=i)
		      System.out.print(j);
		else
		       System.out.print(" ");
		}
	System.out.println();
	}
        }
}
