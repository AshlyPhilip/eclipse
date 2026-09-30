package Basics;

public class InstanceVariable {
	
	String name= "EVANA";

public void Display() {
	System.out.println(name);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	InstanceVariable obj = new InstanceVariable();
	System.out.println(obj.name);
	obj.Display();

	}

}
