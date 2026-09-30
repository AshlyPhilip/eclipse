package OPerators;

public class ShiftOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //shift operator
		 int c=2,d=-2;
		 System.out.println(Integer.toBinaryString(c));
		 System.out.println(Integer.toBinaryString(d));
		 System.out.println("leftshift:"+(c<<2));
		 System.out.println(Integer.toBinaryString(c<<2));
		 System.out.println("Righttshift:"+(c>>2));
		 System.out.println(Integer.toBinaryString(c>>2));
		 System.out.println("unsigned right shift:"+(c>>>1));
		 System.out.println(Integer.toBinaryString(c>>>1));

		 System.out.println("leftshift:"+(d<<2));
		 System.out.println(Integer.toBinaryString(d<<2));
		 System.out.println("Righttshift:"+(d>>2));
		 System.out.println(Integer.toBinaryString(d>>2));
		 System.out.println("unsigned right shift:"+(d>>>2));
		 System.out.println(Integer.toBinaryString(d>>>2));
	}

}
