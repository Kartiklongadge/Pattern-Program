/*
A       A
Ab     bA
AbC   CbA
AbCd dCbA
AbCdEdCbA
*/
class Program72
{
	public static void main(String[] args)
	{
		int n=5;
		for(int i=n;i>=1;i--)
		{
				if(i==1)
				{
					for(int j=1;j<=n;j++)
						if(j%2==0)
						System.out.print((char)(j+96));
						else
						System.out.print((char)(j+64));
					for(int j=n-1;j>=1;j--)
						
						if(j%2==0)
						System.out.print((char)(j+96));
						else
						System.out.print((char)(j+64));
				}
				else
				{	
					for(int j=1;j<=(n-i+1);j++)
						if(j%2==0)
						System.out.print((char)(j+96));
						else
						System.out.print((char)(j+64));
					for(int j=1;j<(((i*2-1)-1));j++)
						System.out.print(" ");
					for(int j=(n-i+1);j>=1;j--)
						if(j%2==0)
						System.out.print((char)(j+96));
						else
						System.out.print((char)(j+64));
			
				}
					System.out.println();
			
			
		}
	}
}
