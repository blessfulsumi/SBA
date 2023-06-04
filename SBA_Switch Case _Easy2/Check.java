package ltisba;

import java.util.Scanner;

public class Check {

	public static void printClassName(Object o)
	{
		System.out.println(o.getClass().getSimpleName());
	}
	
public static void main(String[] args) {
//	System.out.println("Display the suitable datatype for the following Properties:");	
//	System.out.println(" 1.Name \n 2.Eligiblity \n 3.Age \n 4.Salary\n");
	
	Scanner scanner=new Scanner(System.in);
	int n=scanner.nextInt();
	for(int i=0;i<n;i++) {
		int choice=scanner.nextInt();
	switch(choice){
	case 1:
		printClassName(scanner.next());	
		break;
	case 2:
		printClassName(scanner.nextBoolean());
		break;
	case 3: 
		printClassName(scanner.nextInt());
		break;
	case 4:
		printClassName(scanner.nextFloat());
		break;
	default:
		System.out.println("Unknown type");
		
		
	}	
}
}
}
