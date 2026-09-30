package Typecasting;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char exp ='x';
		int num  =exp;
		float deci = num;
		System.out.println("Widenning type Csting");
		System.out.println(exp+"\t"+ num+"\t"+deci);
		
		
		float val =100.0f;
		int n= (int)val;
		char ex =(char)n;
		System.out.println("narrowing type Csting");
		System.out.println(val+"\t"+ n+"\t"+ex);


	}

}
