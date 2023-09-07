/*
EEEEE
dddd
CCC
bb
A
bb
CCC
dddd
EEEEE

*/
class Program23{
	public static void main(String[] args){
		int n=5;
		for(int i=1;i<=n*2-1;i++){
			if(i<=n)
				for(int j=n;j>=i;j--)
					//System.out.print(n-i+1);
					System.out.print((char)((n-i+1+((i%2==0)?96:64))));
			else
				for(int j=i;j>=n;j--)
					//System.out.print(i-n+1);
				        System.out.print((char)((i-n+1+((i%2==0)?96:64))));

			System.out.println();
                 }
	}
}