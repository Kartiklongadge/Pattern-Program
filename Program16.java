/*
E
Ed
EdC
EdCb
EdCbA
EdCb
EdC
Ed
E



*/




class Program16{
 	public static void main(String[] args){
		int n=5;
		for(int i=1;i<=(n*2)-1;i++){
			if(i<=n)
				for(int j=n;j>=n-i+1;j--)
					System.out.print((char)(j+(j%2==0?96:64)));
			else
				for(int j=n;j>=i-n+1;j--)
					System.out.print((char)(j+(j%2==0?96:64)));
			System.out.println();
		}
	}
}