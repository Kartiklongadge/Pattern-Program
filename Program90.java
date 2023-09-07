/*
AAAAAAAAA
bbbb bbbb
CCC   CCC
dd     dd
E       E
dd     dd
CCC   CCC
bbbb bbbb
AAAAAAAAA
*/
class Program90
{
	public static void main(String[] args)
	{
		int n=9;
		for(int i=1;i<=n;i++)
		{
			if(i==1)
			{
				for(int j=1;j<=n*2-1;j++)
					System.out.print(i);
				
			}
			else
			{
				for(int j=i;j<=n;j++)
					System.out.print(i);
				for(int j=1;j<=(((i-1)*2)-1);j++)
					System.out.print(" ");
				for(int j=i;j<=n;j++)
					System.out.print(i);
				
			}
				System.out.println();
		}
			for(int i=n-1;i>=1;i--)
		{
			if(i==1)
			{
				for(int j=1;j<=n*2-1;j++)
					System.out.print(i);
				
			}
			else
			{
				for(int j=i;j<=n;j++)
					System.out.print(i);
				for(int j=1;j<=(((i-1)*2)-1);j++)
					System.out.print(" ");
				for(int j=i;j<=n;j++)
					System.out.print(i);
				
			}
				System.out.println();
		}
	}
}


