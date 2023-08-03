import java.util.Scanner; //import scanner class

class IfElseEg{
	
	static void calc_passfail(int marks){
		if(marks>=35){
			System.out.println("You are Pass... Congrats "); //print if true
		}else{
			System.out.println("You are Fail.... Better luck next time "); //print if false
		}
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in); //object of Scanner
		System.out.println("Enter marks");
		int marks = sc.nextInt(); //read user input
		
		calc_passfail(marks); //calling static method
	}
	
	
}