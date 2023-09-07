/*
EdCbA
EdCb
EdC
Ed
E
Ed
EdC
EdCb
EdCbA

*/
class Program26{
 	public static void main(String[] args){
		int n=5;
		for(int i=1;i<=(n*2)-1;i++){
			if(i<=n)
				for(int j=n;j>=i;j--)
					System.out.print((char)((j+((j%2==0)?96:64))));
			else
				for(int j=n;j<=i;j++)
					//System.out.print(n*2-j);
				        System.out.print((char)((n*2-j+((j%2==0)?96:64))));

			System.out.println();
		}
	}
}