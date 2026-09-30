package oops;

public class ThisKeyWordwithDifferentParameterName {

	String name;
	int age;
	
	public ThisKeyWordwithDifferentParameterName (String fullname, int age1) {
		name = fullname;
		age = age1;
		
		System.out.println(name);
		System.out.println(age);

	}
	
	public void  Display() {
		System.out.println(name);
		System.out.println(age);
	}
	

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		ThisKeyWordwithDifferentParameterName ob = new ThisKeyWordwithDifferentParameterName("manu",20);
		 ob.Display();
	
	}
	

}
