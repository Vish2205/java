class NestedLoopEg{

	public static void main(String args[]){
		
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				Sysout(i +" "+j);
			}
		}
		
		//loop outer
		for(int i=1;i<=4;i++){
			//loop inner
			for(int j=1;j<=i;j++){  
				System.out.print(" * "); 
			} //end inner
			System.out.println();
		} //end outer
	}
}