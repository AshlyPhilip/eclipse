package Basics;

public class Students {

	String name;//instance variable
	
	static String  course = "Testing";//Static variable
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age;//local variable
		
		Students stud1 = new Students();
		System.out.println("Name ="+(stud1.name = "Ashly"));
		System.out.println("Age ="+(age = 37));
		System.out.println("Course ="+ course);
		
		Students stud2 = new Students();
		System.out.println("Name ="+(stud2.name = "Soney"));
		System.out.println("Age ="+(age = 43));
		System.out.println("Course ="+ course);
		
		Students stud3 = new Students();
		System.out.println("Name ="+(stud3.name = "Evana"));
		System.out.println("Age ="+(age = 21));
		System.out.println("Course ="+ (course = "Programming"));
		
		Students stud4 = new Students();
		System.out.println("Name ="+(stud4.name = "Evaan"));
		System.out.println("Age ="+age);
		System.out.println("Course ="+ course );
		
		
		
		
	
	}

}
