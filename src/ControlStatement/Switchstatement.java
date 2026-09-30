package ControlStatement;

public class Switchstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browser = "Chrome";
		switch(browser) {
		case "Chrome":	System.out.println("Chrome is open");
		break;
		case "Safari":	System.out.println("Safari is open");
		break;
		case "firefox":	System.out.println("Firefox is open");
		break;
		case "edge":	System.out.println("Edge is open");
		break;
		default:System.out.println("Invalid browser");
	
		}
	}

}
