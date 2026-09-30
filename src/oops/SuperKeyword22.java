package oops;
class vechicle{

public void speed() {
	System.out.println(120);

}
}
class car extends vechicle {
	public void speed() {
		super.speed();
		System.out.println(140);
	}
	public void display() {
		System.out.println(super.speed);
		System.out.println(speed);

	}

}


public class SuperKeyword22 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car ob = new car();
		ob.display();
}


		

}
