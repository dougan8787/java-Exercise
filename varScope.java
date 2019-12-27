package hello;

public class varScope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		{
			int b = a*a;
		System.out.println("a="+a+",b="+b);
		}
		System.out.println("a="+a);
		//System.out.println("b="+b);  //b is not a {}
	}

}
