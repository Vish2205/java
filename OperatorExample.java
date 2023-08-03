class OperatorExample {

	//static method
	static void calc_arithmetic(){
		int num1=80, num2=87;
		System.out.println("Addition is "+ (num1+num2));
		System.out.println("Subtraction is "+ (num1-num2));
		System.out.println("Multiplication is "+ (num1*num2));
		System.out.println("Division is "+ (num1/num2));
	}	
	//static method
	static void calc_relational(){
		double num1=89.45,num2=45.46;
		System.out.println("Greater number is "+ (num1>num2));
		System.out.println("Lesser number is "+ (num1<num2));
	}	
	//static method
	static void calc_assignment(){
		int num1=768;
		num1+=20;  //num1=num1+20 768+20 num1=788
		System.out.println(num1);
		
		int num2=54;
		num2-=40; //num2=num2-40 54-40 num2=14
		System.out.println(num2);
		
	}
	
	static void calc_unary(){
		int num1 = 6;
		System.out.println(num1++); //postincrement 6
		System.out.println(++num1); //preincrement 8
		System.out.println(num1--); //postdecrement 8
		System.out.println(num1++); //7
		System.out.println(--num1); //postdecrement 7
		System.out.println(num1++); // 7
		System.out.println(num1); //8
		
	}
	
	static void calc_ternary(){
		int num1=90,num2=56;
		int res =(num1<num2)?num1:num2;
		System.out.println(res);
	}
	
	static void calc_logical(){
		double num1=46.66, num2=86.45, num3=88.88;
		System.out.println(num1<num2 || num1<num3); //true
		System.out.println(num1<num2 && num1>num3); //false
	}
	public static void main(String args[]){
			//calling static method with classname
		OperatorExample.calc_arithmetic();
		OperatorExample.calc_relational();
		OperatorExample.calc_assignment();
		OperatorExample.calc_unary();
		OperatorExample.calc_ternary();
		OperatorExample.calc_logical();
	}
}