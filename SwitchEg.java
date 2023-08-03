import java.util.Scanner; //import scanner class
class SwitchEg{

	static void calc_passfail(int marks){		
		//switch expression
		switch(marks){
			//case statements
			case(marks>=35 && marks<=45) :
			System.out.println("You are Pass with D grade... Congrats ");
			break;
			case(marks>45 && marks<=55):
			System.out.println("You are Pass with C grade... Congrats ");
			break;
			case(marks>55 && marks<=65):
			System.out.println("You are Pass with B grade... Congrats ");
			break;
			case(marks>65 && marks<=80):
			System.out.println("You are Pass with A grade... Congrats ");
			break;
			case(marks>80 && marks<=99):
			System.out.println("You are Pass with O grade... Congrats ");
			break;
			default:
			System.out.println("You are Fail/Absent.... Better luck next time "); 
		}
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in); //object of Scanner
		System.out.println("Enter marks");
		int marks = sc.nextInt(); //read user input
		
		calc_passfail(marks);
		}
}