package ControlStatement;

public class NestedSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Qualification = 1;
		char course ='b';
		switch (Qualification) {
			case 1: System.out.println("1.PG");
			switch(course) {
			
			case 'a':System.out.println("a.MCA");
			break;
			case 'b':System.out.println("b.MBA");
			break;
			case 'c':System.out.println("c.MTech");
			break;
			default: System.out.println("Invalid input");
			}
			break;
			case 2: System.out.println("2.UG");
			switch(course) {
			
			case 'a':System.out.println("a.BBA");
			break;
			case 'b':System.out.println("b.Bsc");
			break;
			case 'c':System.out.println("c.BTech");
			break;
			default: System.out.println("Invalid input");
			}
			break;
			
			default: System.out.println("Select valid Course");
		}
				

	}

}
