package OPerators;


public class OPerators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 =28, num2 = 20;
		int sum, diff, prod,remnd;
		float quot;
		sum = num1+num2;
		diff = num1- num2;
		prod = num1*num2;
		remnd = num1%num2;
		quot = num1/num2;
		
		System.out.println("add = "+sum +"\nSub = "+diff+"\nmul = "+prod+"\nDiv = "+quot+"\nmod = "+remnd);
		
		
		//relational Operator
		int x= 50 , y =100;
		boolean val1 = x<y;
		boolean val2 = x<=y;
		System.out.println(val1);
		System.out.println(val2);
		
		boolean val3 = x>y;
		boolean val4 = x>=y;
		System.out.println(val3);
		System.out.println(val4);
		
		boolean val5 = x==y;
		boolean val6 = x!=y;
		System.out.println(val5);
		System.out.println(val6);
		
		//assignment operator
		System.out.println(num1+=num2); //num1=num1+num2
		System.out.println(num1-=num2); //num1=num1-num2
		System.out.println(num1*=num2); //num1=num1*num2
		System.out.println(num1/=num2); //num1= num1/num2
		System.out.println(num1%=num2); //num1=num1%num2
		
		
		//ternary Operator
		int s= 10 , t=20;
		int exp = (s<t)?s-t:s+y;
		System.out.println(exp);
		
		
		

	}

}
