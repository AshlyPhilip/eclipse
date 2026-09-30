package oops;

public class Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * public class Students  extend StudentInfo {
			students ob =new students();
		 */
		StudentInfo obj = new StudentInfo();
		obj.setEmailId("ammu", "ammu123");

		System.out.println(obj.getEmailId());
		System.out.println(obj.getPswd());

		/*
		 * String name = obj.getEmailId();
		 * String pswd = obj.getPswd();
		 * System.out.println(name+ \t +pswd);

		 */
	}

}
