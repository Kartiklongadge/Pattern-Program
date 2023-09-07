/*
A
Ab
AbC
AbCd
AbCdE
AbCd
AbC
Ab
A
*/
//					System.out.print((char)(i+((i%2==0)?96:64)));




class Program13{
 	public static void main(String[] args){
		int n=5;
		for(int i=1;i<=(n*2)-1;i++){
			if(i<=n)
				for(int j=1;j<=i;j++)
					System.out.print((char)(j+((j%2!=0)?64:96)));
			else
				for(int j=1;j<=(n*2)-i;j++)
					System.out.print((char)(j+((j%2!=0)?64:96)));
			System.out.println();
		}
	}
}