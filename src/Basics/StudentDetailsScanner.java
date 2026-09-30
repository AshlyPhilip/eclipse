package Basics;

import java.util.Scanner;

public class StudentDetailsScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		
		System.out.println("enter your name:");
		String name =scan.nextLine();
		
		System.out.println("enter your gender:");
		String gender = scan.next();
		
		
		System.out.println("enter your age:");
		byte age = scan.nextByte();
		
		System.out.println("enter your date of birth:");
		String dob = scan.next();
		
		System.out.println("enter your address:");		
		String address = scan.nextLine();
		
		System.out.println("enter your phonenumber:");		
		long phonenumber = scan.nextLong();
		
		System.out.println("enter your Qualification:");
		String quali = scan.next();
		
		System.out.println("enter your mark:");
		float mark = scan.nextFloat();
		
		System.out.println("enter your grade:");	
		String grade = scan.next();
		
		System.out.println("enter your institute:");
		String institute = scan.nextLine();
		
		System.out.println("enter your course:");
		String course = scan.next();
		
		System.out.println("enter your feDFes:");
		int fees = scan.nextInt();
		
		 
		
				
//		System.out.println("Name:"+ (name = scan.nextLine())+"\n gender"+ (gender = scan.next()));

		System.out.println("Student Details");
		System.out.println("---------------\n");
		System.out.println("Name :"+ name);
		System.out.println("Gender:"+gender);
	
		System.out.println("Age:"+age);
		System.out.println("DOB:"+dob);
		System.out.println("Address:"+address);
		System.out.println("Phone no:"+phonenumber);
		System.out.println("Qualification:"+quali);
		System.out.println("Total Marks:"+mark);
		System.out.println("Grade:"+grade);
		System.out.println("Institute Name:"+institute);
		System.out.println("Course:"+course);
		System.out.println("Fees:"+fees);
	}

}
