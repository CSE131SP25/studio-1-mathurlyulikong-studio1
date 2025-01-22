package studio1;

import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("What two integers do you want to be averaged?");
		System.out.print("Your first integer?");
		int n1 = in.nextInt();
		System.out.print("Your second integer?");
		int n2 = in.nextInt();
		double result = (n1+n2)/2.0;
		System.out.println("The average is" + result );
	}

}
