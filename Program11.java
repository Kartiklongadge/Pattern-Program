/*
5
45
345
2345
12345
2345
345
45
5
*/


class Program11{
 	public static void main(String[] args){
		int n=5;
		for(int i=1;i<=(n*2)-1;i++){
			if(i<=n)
				for(int j=n-i+1;j<=5;j++)
					System.out.print(j);
			else
				for(int j=i;j<=(n*2-1);j++)
					System.out.print(j-n+1);
			System.out.println();
		}
	}
}