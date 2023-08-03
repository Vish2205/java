class PatternEg{
	
	//pyramid example with dec
	public static void main(String args[]){
		for(int i=1;i<=5;i++){ //outer loop
			for(int j=5;j>=i;j--){ //inner loop
				System.out.print(" $ "); //print stmt
			}
			System.out.println(); //new line
		}
		
		System.out.println("---------------------");
		
		for(int i=1;i<=6;i++){
			for(int j=1;j<=i;j++){
				System.out.print(i*j + " ");
			}
			System.out.println(); //new line
		}
		
	}
}