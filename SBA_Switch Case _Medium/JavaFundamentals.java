package lti_sba;

import java.util.Scanner;

public class JavaFundamentals {
	Scanner scanner=new Scanner(System.in);
public  void checkPrime(int n) {
	boolean flag = false;
    for (int i = 2; i <= n / 2; ++i) {
     
      if (n % i == 0) {
        flag = true;
        break;
      }
    }

    if (!flag)
      System.out.println(n + " is prime number");
    else
      System.out.println(n + " is not prime number");
 
}
public void checkArmstrong(int n){
	int originalNumber, remainder, result = 0;
    originalNumber = n;
    while (originalNumber != 0)
    {
        remainder = originalNumber % 10;
        result += Math.pow(remainder, 3);
        originalNumber /= 10;
    }

    if(result == n)
        System.out.println(n + " is an Armstrong number");
    else
        System.out.println(n + " is not an Armstrong number");
}

public void generate_Fib_Series(int a,int b,int n) {
	System.out.println(a);
	System.out.println(b);
	for(int i=0;i<=n-2;i++) {
		int temp=a+b;
		System.out.print(temp);    
		a=b;    
		b=temp; 
	}

}
public int fact(int n){
	if (n == 0)
		return 1;

	return n*fact(n-1);
}
	
public void generatePassword(String mailid){

	String[] tokens = mailid.split("@", 2);
	System.out.println("Password is "+tokens[0]+123);
}
	public static void main(String[] args) {
		JavaFundamentals javaFundamentals=new JavaFundamentals();
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		for(int i=0;i<n;i++) {
			int choice=scanner.nextInt();
			switch(choice) {
			case 1:
				javaFundamentals.checkPrime(scanner.nextInt());
				break;
			case 2:
				javaFundamentals.checkArmstrong(scanner.nextInt());
				break;
			case 3:
				javaFundamentals.generate_Fib_Series(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
				break;
			case 4:
				int num=scanner.nextInt(); 
				System.out.println(num+" factorial is "+javaFundamentals.fact(num));  
				break;
			case 5:
				javaFundamentals.generatePassword(scanner.next());
				break;
				default:
					System.out.println("Invalid choice");
				
			}
		}
	}
}


