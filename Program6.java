/*      6 to 4  (n*2)-i/j
        6 to 2   (i/j-n+1)
       to creare a  odd number (n*2-i);
1
21
321
4321
54321
4321
321
21
1


*/

class Program6{
	public static void main(String[] args){
		int n=5;
		for(int i=1;i<=(n*2)-1;i++){
			if(i<=n)
				for(int j=i;j>=1;j--)
					System.out.print(j);
				 
			else
				for(int j=i;j<=(n*2-1);j++)
					System.out.print(n*2-j);

			System.out.println();
		}
	}

}