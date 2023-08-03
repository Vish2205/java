import java.util.Scanner; //import scanner class
class Switch1Eg{
	
	static void calc_passfail(int marks){
		//switch expression
			switch(marks/10){
				//switch case
				//>=90 and  <=99
				case 9: 
				System.out.println("You are Pass with O grade... Congrats ");
				break;
				
				//>=80 and <=89
				case 8:
				System.out.println("You are Pass with A grade... Congrats ");
				break;
				
				//>=70 and <=79
				case 7:
				System.out.println("You are Pass with B grade... Congrats ");
				break;
				
				//>=60 and <=69
				case 6:
				System.out.println("You are Pass with C grade... Congrats ");
				break;
				
				//>=50 and <=59
				case 5:
				System.out.println("You are Pass with D grade... Congrats ");
				break;
				
				//>=40 and <=49
				case 4:
				System.out.println("You are pass with E grade ");
				break;
				
				default:
				System.out.println("You are Fail/Invalid score");
			}
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in); //object of Scanner
		System.out.println("Enter marks");
		int marks = sc.nextInt(); //read user input
		
		calc_passfail(marks);
		}
}