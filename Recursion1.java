 class Recursion1
{
	public static void m1(int n)
	{
		if(n==6)
		{	
			return ;
		}
		System.out.println(n);
		m1(n+1);
	}
	public static void main(String args[])
	{
		int n=1;
		m1(n);
	}
}	
