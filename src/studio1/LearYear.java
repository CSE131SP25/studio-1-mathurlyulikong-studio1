package studio1;

import java.util.Scanner;


public class LearYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a year to check if it is (true) a leap year");
		int year = in.nextInt();
		boolean isLeap = (year%4 == 0 && year%100 != 0) || (year%400 == 0);
		System.out.print("It is " + isLeap + " that the year you entered is a leap year");
	}

}
