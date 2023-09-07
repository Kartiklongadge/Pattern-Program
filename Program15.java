/*
A
bA
CbA
dCbA
EdCbA
dCbA
CbA                                  //System.out.print((char)(i-n+1+((i%2==0)?96:64)));
bA					//System.out.print((char)(i+((i%2==0)?96:64)));
A

*/


class Program15{
 	public static void main(String[] args){
		int n=5;
		for(int i=1;i<=(n*2)-1;i++){
			if(i<=n)
				for(int j=i;j>=1;j--)
					System.out.print((char)(j+((j%2==0)?96:64)));
						//System.out.print((char)(j+64));
			else
				for(int j=i;j<=(n*2-1);j++)
					System.out.print((char)(n*2-j+((j%2==0)?96:64)));
			System.out.println();
		}
	}
}
//(n*2-j)