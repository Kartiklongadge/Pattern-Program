/*
1 555555555
2 4444 4444
3 333   333
4 22     22
5 1       1
*/
public class Program60{
	public static void main(String[] args){
		int n=9;
		for(int i=1;i<=n;i++)
			{
				if(i==n)
				{
					for(int j=1;j<=(n*2)-1;j++)
					System.out.print(i);
				
				}
				else
				{
					for(int j=i;j>=1;j--)
					System.out.print(i);
				
					for(int j=1;j<=((n-i)*2)-1;j++)
					System.out.print(" ");
				
					for(int j=i;j>=1;j--)
					System.out.print(i);
				
				}
			          System.out.println();

		}
	}
}



