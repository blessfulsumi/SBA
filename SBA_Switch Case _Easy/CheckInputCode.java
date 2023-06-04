package lti_sba;

import java.util.Scanner;

public class CheckInputCode {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String string;
		int n=scanner.nextInt();
		for(int i=0;i<n;i++) {
			string=scanner.next();
			switch (string.charAt(0)) {
			case 'a':
			case 'b':
			case 'c':
			case 'd':
			case 'e':
				System.out.println("A");
				break;
			case 'f':
			case 'g':
			case 'h':
			case 'i':
			case 'j':
			case 'k':
				System.out.println("B");
				break;
			case 'l':
			case 'm':
			case 'n':
			case 'o':
			case 'p':

				System.out.println("C");
				break;
			case 'q':
			case 'r':
			case 's':
			case 't':
			case 'v':
			case 'w':
			case 'x':
			case 'y':
			case 'z':
				System.out.println("D");
				break;
			default:
				System.out.println("Invalid Choice");
			}
		}
	}
}

