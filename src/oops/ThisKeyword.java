package oops;

public class ThisKeyword {
	
	String name;
	int age;
	
	public ThisKeyword (String name, int age) {
		this.name = name;
		this.age = age;
		
		System.out.println(name);
		System.out.println(age);

	}
	
	public void  Display() {
		System.out.println(name);
		System.out.println(age);
	}
	

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		ThisKeyword ob = new ThisKeyword("manu",20);
		 ob.Display();
	
	}

}
