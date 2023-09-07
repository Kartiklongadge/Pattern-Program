/*
E       E
Ed     dE
EdC   CdE
EdCb bCdE
EdCbAbCdE

*/
class Program81
{
	public static void main(String[] args)
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			if(i==n)
			{
				for(int j=n;j>=1;j--)
					if(j%2==0)
					System.out.print((char)(j+96));
					else
					System.out.print((char)(j+64));
				for(int j=2;j<=n;j++)
					if(j%2==0)
					System.out.print((char)(j+96));
					else
					System.out.print((char)(j+64));
			}
			else
			{
				for(int j=n;j>=n-i+1;j--)
					if(j%2==0)
					System.out.print((char)(j+96));
					else
					System.out.print((char)(j+64));
				for(int j=1;j<=(((n-i)*2)-1);j++)
					System.out.print(" ");
				for(int j=n-i+1;j<=n;j++)
					if(j%2==0)
					System.out.print((char)(j+96));
					else
					System.out.print((char)(j+64));

			}
				System.out.println();

		}
	}


}