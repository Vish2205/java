import java.util.Scanner;
class MethodEg{	
	//user defined static method
	static void calcEvenOdd(int number){
		if(number%2==0){
			System.out.println(" number is even ");
		}else{
			System.out.println(" number is odd ");
		}	
	}
	public static void main(String args[]){
		//creating Scanner Object
		Scanner sc = new Scanner(System.in);
		while(true){
		System.out.println(" Enter the number ");
		int number = sc.nextInt(); //reading value from user
		
		calcEvenOdd(number); //method calling
		
		//exit condition
		System.out.println("You want to exit the loop press-1");
        if (number == -1) {
            break;
        }
	}
	}
}
