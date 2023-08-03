import java.util.Scanner; //import scanner class

class LoopsEg{
	//using for loop
	static void calc_table(int number){
		//for(initialization;condition;inc/dec)
		for(int i=1;i<=10;i++){
			System.out.println("Value is : " +(number*i));
		}
	}	
	//using while loop
	static void calc_table1(int number){
		int i=1;
		while(i<=10){
			System.out.println("Value is : " +(number*i));
			i++;
		}
	}	
	//using dowhile loop
	static void calc_table2(int number){
		int i=1;
		do{
			System.out.println("Value is : " +(number*i));
			i++;
		}
		while(i<=1);
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in); //object of Scanner
		System.out.println("Enter number for table ");
		int number = sc.nextInt(); //read user input
		
		calc_table(number);
		calc_table1(number);
		calc_table2(number);
		}
}