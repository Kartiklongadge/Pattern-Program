/*
5       5
44     44
333   333
2222 2222
111111111
*/
class Program74
{
	public static void main(String[] args)
	{
		int n=9;
		for(int i=n;i>=1;i--)
		{
				if(i==1)
				{
					for(int j=1;j<=n*2-1;j++)
					System.out.print(i);
						
					
						
						
				}
				else
				{	
					for(int j=i;j<=n-1+1;j++)
						System.out.print(i);
					for(int j=1;j<((i*2)-2);j++)
						System.out.print(" ");
					for(int j=i;j<=n-1+1;j++)
						System.out.print(i);
				}
					System.out.println();
			
			
		}
	}
}
