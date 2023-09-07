/*
5       5
54     45
543   345
5432 2345
543212345
5432 2345
543   345
54     45
5       5
*/
class Program86
{
	public static void main(String[] args)
	{
		int n=9;
		for(int i=1;i<=n;i++)
		{
			if(i==n)
			{
				for(int j=n;j>=1;j--)
					System.out.print(j);
				for(int j=2;j<=n;j++)
					System.out.print(j);
			}
			else
			{	
				for(int j=n;j>=n-i+1;j--)
					System.out.print(j);
				for(int j=1;j<=((n-i)*2)-1;j++)
					System.out.print(" ");
				for(int j=n-i+1;j<=n;j++)
					System.out.print(j);
			}
				System.out.println();
		}
			for(int i=n-1;i>=1;i--)
		{
			if(i==n)
			{
				for(int j=n;j>=1;j--)
					System.out.print(j);
				for(int j=2;j<=n;j++)
					System.out.print(j);
			}
			else
			{	
				for(int j=n;j>=n-i+1;j--)
					System.out.print(j);
				for(int j=1;j<=((n-i)*2)-1;j++)
					System.out.print(" ");
				for(int j=n-i+1;j<=n;j++)
					System.out.print(j);
			}
				System.out.println();
		}
	}

}