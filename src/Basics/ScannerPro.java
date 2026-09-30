package Basics;

import java.util.Scanner;

public class ScannerPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in);
		String name;
		System.out.println("enter your name:");
		name= scan.nextLine();
		System.out.println("Name = "+name);
	}

}
