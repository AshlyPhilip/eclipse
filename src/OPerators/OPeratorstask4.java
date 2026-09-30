package OPerators;

import java.util.Scanner;

public class OPeratorstask4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner scan = new Scanner (System.in);

		System.out.println("enter your number:");
		number= scan.nextInt();

		String result = (number >0)?"PositiveNumber":"Negative Number";
		
		System.out.println(result);

	}

}
