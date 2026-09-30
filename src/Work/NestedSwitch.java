package Work;

import java.util.Scanner;

public class NestedSwitch {
	public static void main(String[] args) {
		/*
		 * Using nested switch
work 
Searching for a department in a university and you are asked to select a school from a choice of three schools
1. School of Computer Science
	a. Department of informatics
	b. Department of Machine Learning
2. School of Business
	a. Department of commerce
	b. Department of purchasing
3. School of Engineering
	a. Department of Mechanical Engineering
	b. Department of Mechatronics Enginearing

		 */
	    Scanner sc = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("        UNIVERSITY DEPARTMENT SEARCH      ");
        System.out.println("==========================================");
        System.out.println("  Select a School:");
        System.out.println("  1. School of Computer Science");
        System.out.println("  2. School of Business");
        System.out.println("  3. School of Engineering");
        System.out.println("==========================================");
        System.out.print("  Enter your choice (1-3): ");
        int schoolChoice = sc.nextInt();

        switch (schoolChoice) {

            case 1:
                System.out.println("\n  School of Computer Science");
                System.out.println("------------------------------------------");
                System.out.println("  Select a Department:");
                System.out.println("  a. Department of Informatics");
                System.out.println("  b. Department of Machine Learning");
                System.out.println("------------------------------------------");
                System.out.print("  Enter your choice (a/b): ");
                char csChoice = sc.next().charAt(0);

                switch (csChoice) {
                    case 'a':
                        System.out.println("\n  You selected: Department of Informatics");
                        System.out.println("  School      : School of Computer Science");
                        break;
                    case 'b':
                        System.out.println("\n  You selected: Department of Machine Learning");
                        System.out.println("  School      : School of Computer Science");
                        break;
                    default:
                        System.out.println("\n  Invalid department choice!");
                }
                break;

            case 2:
                System.out.println("\n  School of Business");
                System.out.println("------------------------------------------");
                System.out.println("  Select a Department:");
                System.out.println("  a. Department of Commerce");
                System.out.println("  b. Department of Purchasing");
                System.out.println("------------------------------------------");
                System.out.print("  Enter your choice (a/b): ");
                char busChoice = sc.next().charAt(0);

                switch (busChoice) {
                    case 'a':
                        System.out.println("\n  You selected: Department of Commerce");
                        System.out.println("  School      : School of Business");
                        break;
                    case 'b':
                        System.out.println("\n  You selected: Department of Purchasing");
                        System.out.println("  School      : School of Business");
                        break;
                    default:
                        System.out.println("\n  Invalid department choice!");
                }
                break;

            case 3:
                System.out.println("\n  School of Engineering");
                System.out.println("------------------------------------------");
                System.out.println("  Select a Department:");
                System.out.println("  a. Department of Mechanical Engineering");
                System.out.println("  b. Department of Mechatronics Engineering");
                System.out.println("------------------------------------------");
                System.out.print("  Enter your choice (a/b): ");
                char engChoice = sc.next().charAt(0);

                switch (engChoice) {
                    case 'a':
                        System.out.println("\n  You selected: Department of Mechanical Engineering");
                        System.out.println("  School      : School of Engineering");
                        break;
                    case 'b':
                        System.out.println("\n  You selected: Department of Mechatronics Engineering");
                        System.out.println("  School      : School of Engineering");
                        break;
                    default:
                        System.out.println("\n  Invalid department choice!");
                }
                break;

            default:
                System.out.println("\n  Invalid school choice!");
        }

        System.out.println("==========================================");
	}
}
