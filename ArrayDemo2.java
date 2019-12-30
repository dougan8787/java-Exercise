package hello;

public class ArrayDemo2 {
	public static void main (String[] args) {
		int[] a = {5,7,20};
		int[] b = new int[4];
		for (int i=0;i<b.length;i++) {
			b[i]=i+1;
		}
		System.out.println("array a is:");
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
			
		}
		System.out.println();
		System.out.println("b array long is:"+b.length);
		System.out.println("array b is:");
		for (int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println();
		b=a;
		System.out.println("b array long is:"+b.length);

	}
}