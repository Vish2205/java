class VariableExample {
	
	 static String name ="Mamta B"; //static variable
	
	//non static method
	void display(){
		//local variables
		char my = 'm';
		int num = 89;
	System.out.println(my + " "+ num);	
	}
	 long phone= 987654321; //instance variable
	 
		
	//entry point	
	public static void main(String args[]){	
		//creating an object/instance
		VariableExample obj = new VariableExample();
		
		obj.display();  //calling method
		System.out.println(obj.phone); //accessing instance variable
		System.out.println(VariableExample.name); //accessing static variable
	}
}