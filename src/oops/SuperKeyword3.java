package oops;

class vechicle{
 public vechicle (int speed) {
	System.out.println("speed = "+speed);

}
}
class car extends vechicle {
	public car() {
		super(1120);
		System.out.println("spped = 1440");
}


public class SuperKeyword3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car ob = new car();
		}
	}
}