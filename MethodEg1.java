import java.util.Scanner;
class MethodEg1{	
	//user defined  static method
	static int add(int num1, int num2){ //num1 & num2 are formal parameter
		int sum = num1 + num2;
		return sum; //returning sum 
	}

	public static void main(String args[]){
		//creating Scanner Object
		Scanner sc = new Scanner(System.in);	
		System.out.println(" Enter the number one");
		int number1 = sc.nextInt(); //reading value from user
		
		System.out.println(" Enter the number second");
		int number2 = sc.nextInt(); //reading value from user
		
		int result = add(number1,number2); //number1 & number2 are actual parameter
		System.out.println("Sum of numbers : " +result);
		
		add(number1,number2);
	}
}