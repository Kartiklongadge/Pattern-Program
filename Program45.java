/*
543212345
 5432345
  54345
   545
    5
*/
class Program45{
public static void main(String[] args){
		int n=5;
		for(int i=n;i>=1;i--){
			for(int j=i;j<n;j++)
				System.out.print(" ");
			for(int j=n;j>=n-i+1;j--)
				System.out.print(j);
			for(int j=n-i+1+1;j<=n;j++)
				System.out.print(j);
			System.out.println();
		}
	}
}