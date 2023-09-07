/*
A
bb
CCC
dddd
EEEEE
dddd
CCC
bb
A	
*/
public class Program9{
	public static void main(String[] args){
		int n=5;
		for(int i=1;i<=(n*2)-1;i++){
			if(i<=n)
				for(int j=i;j<=n;j++)
					System.out.print((char)(i+64));
			else
				for(int j=i;j<=(n*2-1);j++)
					System.out.print((char)(j+96));
		
				System.out.println();
		}
	}
}