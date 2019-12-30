package hello;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a;
		
		a= new int[10];
		
		double[] b = new double[10];
		
		char[] c =new char[100];
		boolean[] d = new boolean[20];
		
		String[] s= new String[5];
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(s);
		System.out.println("**********************************");
		System.out.println(a[0]);
		System.out.println(b[0]);
		System.out.println(c[0]);
		System.out.println(d[0]);
		System.out.println(s[0]);
		System.out.println("**********************************");
		System.out.println("a+length="+a.length);
		System.out.println("b+length="+b.length);
		System.out.println("c+length="+c.length);
		System.out.println("d+length="+d.length);
		System.out.println("s+length="+s.length);
	}

}
