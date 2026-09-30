package OPerators;

public class BitwiseOPerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// bitwise operator
				 int m1= 0b00001010 , m2= 0b00000101;
				 System.out.println(Integer.toBinaryString(m1));
				 System.out.println(Integer.toBinaryString(m2));

				 System.out.println("BitwiseOR n1|n2 ="+(m1|m2));
				 
				 System.out.println("BitwiseAND n1&n2 ="+(m1&m2));
				 System.out.println("BitwiseXOR n1^n2 ="+(m1^m2));
				 System.out.println("Bitwisecomplement ~n1 ="+ ~m1);
				 
				 int n1 =10 , n2 =5;
				 //biwise OR
				 System.out.println(Integer.toBinaryString(n1));
				 System.out.println(Integer.toBinaryString(n2));

				 System.out.println("BitwiseOR n1|n2 ="+(n1|n2));
				 
				 System.out.println("BitwiseAND n1&n2 ="+(n1&n2));
				 System.out.println("BitwiseXOR n1^n2 ="+(n1^n2));
				 System.out.println("Bitwisecomplement ~n1 ="+ ~n1);
				 
	}

}
