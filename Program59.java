/*
555555555
4444 4444 
333   333
22     22
1       1  

*/

class Program59{
	public  static void main(String[] args){
		int n=5;
		for(int i=n;i>=1;i--){
			if(i==n){
				for(int j=1;j<n*2-1;j++)
				System.out.print(i);
					System.out.println();
			}else{
				for(int j=i;j>=1;j--){
					System.out.print(i);
					}
					for(int j=1;j<=(((i-1)*2)-1);j++){
						System.out.print(" ");
					}
					for(int j=i;j>=1;j--){
						System.out.print(i);
					
				}
											                              System.out.println();

			}
		}
	}

}