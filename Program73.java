/*
1       1
22     22
333   333
4444 4444
555555555
*/
class Program73
{
	public static void main(String[] args)
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
				if(i==n)
				{
					for(int j=1;j<=n*2-1;j++)
					System.out.print(i);
						
					
						
						
				}
				else
				{	
					for(int j=n-i+1;j<=n;j++)
						System.out.print(i);
					for(int j=1;j<((n-i)*2);j++)
						System.out.print(" ");
					for(int j=n-i+1;j<=n;j++)
						System.out.print(i);
				}
					System.out.println();
			
			
		}
	}
}
