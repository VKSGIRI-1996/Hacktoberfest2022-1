 class Recursion5
{
	public static int calcPower(int a,int n)
	{
		if(n==0)
		{
		return 1;
		}
		if (a==0)
		{	
			return 0;
		}
		int aPownm1=calcPower(a,n-1);
		int aPown=a*aPownm1;
		return aPown;
	}
	public static void main(String args[])
	{
		int n=8,a=2;
		int ans=calcPower(a,n);
		System.out.println(ans);
	
		
	}
}	
