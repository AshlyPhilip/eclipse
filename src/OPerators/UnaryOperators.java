package OPerators;

public class UnaryOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//unary OPerator
		//1. unary -
		int a= 20;
		a=-a;
		System.out.println(a);
		//2.unary not(!)
		boolean b= true;
		System.out.println(!b);
		//3.increment ++
		//Post Increment I++ -->I = I +1
		int i=5 ;
		i++;
		System.out.println("I++= "+i);
		
		//Preincrement ++I --> I=I+1;
		++i;
		System.out.println("++i="+i);
		//4.decrement
		//Post decrement I--  -->I = I -1
		
		
		//increment - postfix
		
		int k=10;
		int value= k++;//value=k ,k= k++
		System.out.println("value = "+value+"\t K = "+k);
		
		//Prefix
		int value1 =++k;//value1 = ++k , k =k+1
		System.out.println("value = "+value1+"\t K = "+k);
		
		//postDecrement
		int j=10 ;
		j--;
		System.out.println("j--= "+j);
		//Predecremnent --I --> I=I-1;
		--j;
		System.out.println("--j="+j);
		
		
		//decrement - postfix
		
				int value2= k--; //value2 =k ,k= k-1
				System.out.println("value = "+value2+"\t K = "+k);
				
				//Prefix
				int value3 =--k; //value3 = --k, k=k-1
				System.out.println("value = "+value3+"\t K = "+k);
				
		//5.Bitwise complemnt
		int n=9;
		System.out.println(~n);
		
	}

}
