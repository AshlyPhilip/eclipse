package OPerators;

public class OPeratorTask3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//logical OR and AND
		boolean A = true;
		boolean B = true;
		
		System.out.println(" A = true and B = true ");
		System.out.println("!(A||B) = "+!(A||B));
		System.out.println("!(A&&B) = "+!(A&&B));
		System.out.println("!(A||B) && !(A||B) = "+(!(A||B) && !(A||B)));

		System.out.println("!(A&&B) || !(A&&B) = "+(!(A&&B)||!(A&&B)));
		
		A = true;
		B = false;
		System.out.println(" A = true and B = false ");

		System.out.println("!(A||B) = "+!(A||B));
		System.out.println("!(A&&B) = "+!(A&&B));
		System.out.println("!(A||B) && !(A||B) = "+(!(A||B) && !(A||B)));

		System.out.println("!(A&&B) || !(A&&B) = "+(!(A&&B)||!(A&&B)));
		
		A = false;
		B = true;
		System.out.println(" A = false and B = true ");

		System.out.println("!(A||B) = "+!(A||B));
		System.out.println("!(A&&B) = "+!(A&&B));
		System.out.println("!(A||B) && !(A||B) = "+(!(A||B) && !(A||B)));

		System.out.println("!(A&&B) || !(A&&B) = "+(!(A&&B)||!(A&&B)));
		
		A = false;
		B = false;
		System.out.println(" A = false and B = false ");

		System.out.println("!(A||B) = "+!(A||B));
		System.out.println("!(A&&B) = "+!(A&&B));
		System.out.println("!(A||B) && !(A||B) = "+(!(A||B) && !(A||B)));

		System.out.println("!(A&&B) || !(A&&B) = "+(!(A&&B)||!(A&&B)));
	}

}
