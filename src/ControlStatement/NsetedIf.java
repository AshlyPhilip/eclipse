package ControlStatement;

public class NsetedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =101;
		if(num%2==0) {
			
			if(num>0) 
				System.out.println("positive even number");
			else
				System.out.println("negative even number");

		}
		else
		{
			if(num>0) 
				System.out.println("positive odd number");
			else
				System.out.println("negative odd number");
		}
	}

}
