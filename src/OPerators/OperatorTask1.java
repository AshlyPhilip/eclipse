package OPerators;

import java.util.Scanner;

public class OperatorTask1 {

	public static void main(String[] args) {
		
		int A; int B;int num;int c; int x; int y; int z;
		
		
		Scanner scan = new Scanner (System.in);

		System.out.println("enter first number A:");
		A = scan.nextInt();
		System.out.println("enter second number B:");
		B = scan.nextInt();
		
		System.out.println("A % B =" +(A % B));
		
		System.out.println("enter first number Num as dividend:");
		num = scan.nextInt();
		System.out.println("enter second number c as divisor:");
		c = scan.nextInt();
		
		System.out.println("num % c =" +(num / c));
		System.out.println("4/2+8*4-(5+2)%3 = " +(4/2+8*4-(5+2)%3));

		System.out.println("enter first number X:");
		x = scan.nextInt();
		System.out.println("enter second number y:");
		y = scan.nextInt();
		System.out.println("enter Third number Z:");
		z = scan.nextInt();
		
		System.out.println("x+z/x+(z%y)*(z-x) = " +(x+z/x+(z%y)*(z-x)));
		System.out.println("z/x+y*x-(y+x)%z = " +(z/x+y*x-(y+x)%z));

		

	}
}
