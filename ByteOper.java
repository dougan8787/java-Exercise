package hello;

public class ByteOper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0b00101010;
		int b = 0b00001111;
		
		System.out.println(Integer.toBinaryString(a&b));
		System.out.println(Integer.toBinaryString(a|b));
		System.out.println(Integer.toBinaryString(a^b));
		
		int c = 0b111110000000000000000000000000;
		System.out.println(Integer.toBinaryString(c<<3));
		System.out.println(Integer.toBinaryString(c>>2));
		System.out.println(Integer.toBinaryString(c>>>1));

	}

}
