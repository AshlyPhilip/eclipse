package Work;

import java.util.Scanner;

public class usingNestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * work 1
		 * 
		 * Check the number is less than or greater than num<=100 print less than 100
		 * num>=50 print greater than 50
		 * 
		 * print less than 50
		 * 
		 * print greater than 100
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Give the number as integer");

		int num = scan.nextInt();

		if (num <= 100) {
			System.out.println(num + "is less than 100");
			if (num >= 50)
				System.out.println(num + "is greater than 50");
			else
				System.out.println(num + "is less than 50");

		} else
			System.out.println(num + "is greater than 100");

		/*
		 * work 2
		 * 
		 * age , weight age>=18 weight >= 50 print eligible to donate blood
		 * 
		 * print not eligible
		 */
		int age;
		int weight;

		System.out.println("Enter your age");

		age = scan.nextInt();
		System.out.println("Enter your weight");
		weight = scan.nextInt();

		if (age >= 18) {
			if (weight >= 50)
				System.out.println("Eligible to Donate Blood");
			else
				System.out.println("Not Eligible to Donate Blood");
		} else
			System.out.println("Not Eligible to Donate Blood");
		/*
		 * work 3
		 * 
		 * int x = 30 , y = 10 x == 30 y == 10 print x = 30 and y = 10
		 */

		int x = 30, y = 10;
		/*
		 * System.out.println("x= "); x = scan.nextInt(); System.out.println("y= "); y=
		 * scan.nextInt();
		 */
		if (x == 30)
			if (y == 10)
				System.out.println("x=30 and y=10");	
				

	}

}
