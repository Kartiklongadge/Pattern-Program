/*
E       E
DE     DE
CDE   CDE
BCDE BCDE
AbCdEfGhI
BCDE BCDE
CDE   CDE
DE     DE
E       E
*/
class Program89{
	public static void main(String[] args)
	{	
		int n=5;
		for(int i=1;i<=n;i++)
		{
			if(i==n)
			{
				for(int j=1;j<=n*2-1;j++)
					if(j%2==0)
					System.out.print((char)(j+96));
					else
					System.out.print((char)(j+64));
					
				
			}
			else
			{
				for(int j=n-i+1;j<=n;j++)
					System.out.print((char)(j+64));
				for(int j=1;j<=(((n-i)*2)-1);j++)
					System.out.print(" ");
				for(int j=n-i+1;j<=n;j++)
					System.out.print((char)(j+64));
			}
				System.out.println();
		}
			for(int i=n-1;i>=1;i--)
		{
			if(i==n)
			{
				for(int j=1;j<=n*2-1;j++)
					System.out.print((char)(j+64));
				
			}
			else
			{
				for(int j=n-i+1;j<=n;j++)
					System.out.print((char)(j+64));
				for(int j=1;j<=(((n-i)*2)-1);j++)
					System.out.print(" ");
				for(int j=n-i+1;j<=n;j++)
					System.out.print((char)(j+64));
			}
				System.out.println();
		}		
	}

}