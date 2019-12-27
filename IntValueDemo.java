package hello;

public class IntValueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 0b1001;
		System.out.println("binary is:"+a);
		int b = 071;
		System.out.println("Octal is:"+ b);
		System.out.println("Octal to Binary:"+Integer.toBinaryString(b));
		int c = 19;
		System.out.println("Decimal is:"+c);
		System.out.println("Decimal to Binary:"+Integer.toBinaryString(c));
		int d = 0xFE;
		System.out.println("Hexadecimal is:"+d);
		System.out.println("Hexadecimal to Binary:"+Integer.toBinaryString(d));
		int e= -19;
		System.out.println("-19 to Binary:"+Integer.toBinaryString(e));
	}

}
