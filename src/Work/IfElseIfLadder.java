package Work;

import java.util.Scanner;

public class IfElseIfLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		/*
		 * if else if ladder _______________ work 1
		 * ------------------------------------------------------------- mark Grade
		 * ------------------------------------------------------------- Above 90 A
		 * 
		 * 70 to 89 B
		 * 
		 * 50 to 69 C
		 * 
		 * bellow 50 D
		 */

		System.out.print("Enter your mark: ");
		int mark = scan.nextInt();

		String grade;

		if (mark > 90) {
			grade = "A";
		} else if (mark >= 70 && mark <= 89) {
			grade = "B";
		} else if (mark >= 50 && mark <= 69) {
			grade = "C";
		} else {
			grade = "D";
		}

		System.out.println("------------------------------");
		System.out.println("  Mark  : " + mark);
		System.out.println("  Grade : " + grade);
		System.out.println("------------------------------");

		/*
		 * work 2 int i = 20 i==10 i is 10 i==15 i is 15 i==20 i is 20
		 * 
		 * print i is not present
		 * 
		 * print outside if-elseif
		 */

		int i = 20;

		if (i == 10) {
			System.out.println("i is 10");
		} else if (i == 15) {
			System.out.println("i is 15");
		} else if (i == 20) {
			System.out.println("i is 20");
		} else {
			System.out.println("i is not present");
		}

		System.out.println("if-else if");
		/*
		 * work 4 write a program to input 3 unique integers and print the smallest
		 * among them
		 * 
		 * a,b,c a<b && a<c print smallst a b<a && b<c print smallest b
		 * 
		 * print smallest c
		 */

		System.out.print("Enter first number  (a): ");
		int a = scan.nextInt();

		System.out.print("Enter second number (b): ");
		int b = scan.nextInt();

		System.out.print("Enter third number  (c): ");
		int c = scan.nextInt();

		System.out.println("------------------------------");
		System.out.println("  a = " + a);
		System.out.println("  b = " + b);
		System.out.println("  c = " + c);
		System.out.println("------------------------------");

		if (a < b && a < c) {
			System.out.println("  Smallest number is: " + a);
		} else if (b < a && b < c) {
			System.out.println("  Smallest number is: " + b);
		} else {
			System.out.println("  Smallest number is: " + c);
		}

		System.out.println("------------------------------");
	}

}
