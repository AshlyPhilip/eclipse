package oops;
class vechicle{
	int speed =120;
}
class car extends vechicle {
	int speed = 140;


public void display() {
	System.out.println(super.speed);
	System.out.println(speed);
}
}
public class SuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car ob = new car();
		ob.display();

	}

}
