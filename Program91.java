/*
aBcDeFgHi
BcDe BcDe
cDe   cDe
De     De
e       e
De     De
cDe   cDe
BcDe BcDe
aBcDeFgHi
*/
class Program91
{
	public static void main(String[] args)
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			if(i==1)
			{
				for(int j=1;j<=n*2-1;j++)
					if(j%2==0)
					System.out.print((char)(j+64));
					else
					System.out.print((char)(j+96));
				
			}
			else
			{
				for(int j=i;j<=n;j++)
					if(j%2==0)
					System.out.print((char)(j+64));
					else
					System.out.print((char)(j+96));
				
				for(int j=1;j<=(((i-1)*2)-1);j++)
					System.out.print(" ");
				for(int j=i;j<=n;j++)
					if(j%2==0)
					System.out.print((char)(j+64));
					else
					System.out.print((char)(j+96));
				
				
			}
				System.out.println();
		}
			for(int i=n-1;i>=1;i--)
		{
			if(i==1)
			{
				for(int j=1;j<=n*2-1;j++)
					if(j%2==0)
					System.out.print((char)(j+64));
					else
					System.out.print((char)(j+96));
				
				
			}
			else
			{
				for(int j=i;j<=n;j++)
					if(j%2==0)
					System.out.print((char)(j+64));
					else
					System.out.print((char)(j+96));
				
				for(int j=1;j<=(((i-1)*2)-1);j++)
					System.out.print(" ");
				for(int j=i;j<=n;j++)
					if(j%2==0)
					System.out.print((char)(j+64));
					else
					System.out.print((char)(j+96));
				
				
			}
				System.out.println();
		}
	}
}


