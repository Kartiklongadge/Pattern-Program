/*
E       E
dE     Ed
CdE   EdC
bCdE EdCb
AbCdEdCbA
*/
class Program82
{
	public static void main(String[] args)
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			if(i==n)
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
				for(int j=n-i+1;j<=n;j++)
					if(j%2==0)
					System.out.print((char)(j+96));
					else
					System.out.print((char)(j+64));
				for(int j=1;j<=(((n-i)*2)-1);j++)
					System.out.print(" ");
				for(int j=n;j>=n-i+1;j--)
					if(j%2==0)
					System.out.print((char)(j+96));
					else
					System.out.print((char)(j+64));

			}
				System.out.println();

		}
	}


}