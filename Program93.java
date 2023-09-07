/*
1* * *
2 * * 
3* * *
4 * *
5* * *
 12345
*/
class Program93
{
	public static void main(String[] args)
	{
		int n=7;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i%2!=0&&j%2!=0||i%2==0&&j%2==0)
				System.out.print("*");
				else
				System.out.print(" ");
			}
				System.out.println();
		}
	}
}