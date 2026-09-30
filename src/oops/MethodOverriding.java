package oops;
class bird{
public void sound() {
	System.out.println("tweet..........tweet.........");
	}
}
class duck extends bird{
	public void sound() {

	System.out.println("quack..........quack.........");
	}
}
public class MethodOverriding {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		duck d = new duck();
		d.sound();
		bird b =new duck();//Dynamic binding
		b.sound();

	}

}
