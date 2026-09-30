package oops;

public class WithoutThiskeyword {

	String name;
	int age;
	
	public WithoutThiskeyword (String name, int age) {
		name = name;
		age = age;
		
		System.out.println(name);
		System.out.println(age);

	}
	
	public void  Display() {
		System.out.println(name);
		System.out.println(age);
	}
	

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		WithoutThiskeyword ob = new WithoutThiskeyword("manu",20);
		 ob.Display();
	
	}
	

}
