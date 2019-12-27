package hello;

public class OneOper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int b = ++a +8; //++a is first plus b=14
		System.out.println("b value :"+b);
		int c = a++;
		System.out.println("c value :"+c);
		System.out.println("a value :"+a);
		int d = 10;
		System.out.println("--d value :"+--d);
		System.out.println("d :"+ d);
		System.out.println("d-- value :"+d--);
		System.out.println("d :"+ d);
		boolean flag = true;
		System.out.println("logic :"+!flag);
		int t = 10 ;
		System.out.println("int 10 to binary:" + Integer.toBinaryString(t));
		System.out.println("Binary:"+Integer.toBinaryString(~t));
		System.out.println("decimal:"+~t);
	}

}
