import java.util.Scanner; //import scanner class

class IfElseIfEg{
	
	// static method
	static void calc_passfail(int marks){
		if(marks >=1 && marks<=100) { //outer condition
			
			if(marks>=35 && marks<=45){ 
				System.out.println("You are Pass with D grade... Congrats "); 
			}
			else if(marks>45 && marks<=55){
				System.out.println("You are Pass with C grade... Congrats "); 
			}		
			else if(marks>55 && marks<=65){
				System.out.println("You are Pass with B grade... Congrats "); 
			}
			else if(marks>65 && marks<=80){
				System.out.println("You are Pass with A grade... Congrats "); 
			}
			else if(marks>80 && marks<=99){
				System.out.println("You are Pass with O grade... Congrats "); 
			}
			else{
				System.out.println("You are Fail.... Better luck next time "); 
			}
		}
		//outer condition else
		else{
			System.out.println("Absent or Incorrect marks....");
		}
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in); //object of Scanner
		System.out.println("Enter marks");
		int marks = sc.nextInt(); //read user input
		
		calc_passfail(marks);
		}
}