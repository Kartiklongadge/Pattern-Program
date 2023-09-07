/*
5       5
45     54
345   543
2345 5432
123454321

*/
class Program77
{
	public static void main(String[] args)
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
				if(i==n)
				{
					for(int j=1;j<=n;j++)
					System.out.print(j);
					for(int j=n-1;j>=1;j--)
					System.out.print(j);
						
				}
				else
				{	
					for(int j=n-i+1;j<=n;j++)
						System.out.print(j);
					for(int j=1;j<=((((n-i)*2)-1));j++)
						System.out.print(" ");
					for(int j=n;j>=n-i+1;j--)
						System.out.print(j);
				}
					System.out.println();
			
			
		}
	}
}
