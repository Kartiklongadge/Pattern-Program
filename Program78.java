/*
A       A
BB     BB
CCC   CCC
DDDD DDDD
EEEEEEEEE

*/
class Program78
{
	public static void main(String[] args)
	{
		int n=26;
		for(int i=1;i<=n;i++)
		{
				if(i==n)
				{
					for(int j=1;j<=n*2-1;j++)
					System.out.print((char)(i+64));
						
					
						
						
				}
				else
				{	
					for(int j=n-i+1;j<=n;j++)
						System.out.print((char)(i+64));
					for(int j=1;j<((n-i)*2);j++)
						System.out.print(" ");
					for(int j=n-i+1;j<=n;j++)
						System.out.print((char)(i+64));
				}
					System.out.println();
			
			
		}
	}
}
