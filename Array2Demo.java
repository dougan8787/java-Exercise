package hello;

public class Array2Demo {
	public static void main(String [] args) {
		int [] []a= {{1,2,3},{4,5,6}};
		System.out.println("array a one-dimensional long:"+a.length);
		System.out.println("array a two-dimensional long:"+a[0].length);
		System.out.println("array a is");
		
		for(int i =0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i] [j]+" ");
				}
				System.out.println();
			}
			System.out.println("-------------------");
			int [] [] c = new int[3] [4];
			for (int i=0;i<c.length;i++) {
				for(int j=0;j<c[i].length;j++) {
					 c[i] [j]=i+j;
				}
			}
			System.out.println("array c is:");
			for(int i=0;i<c.length;i++) {
				for(int j=0;j<c[i].length;j++) {
					System.out.print(c[i] [j]+" ");
				}
				System.out.println();
			}
			System.out.println("-------------------");
			int[] []d=new int[2][];
			d[0] = new int[3];
			d[1] = new int[4];
			
			for(int i=0;i<d.length;i++) {
				for(int j=0;j<d[i].length;j++) {
					d[i] [j] = i+j;
				}
			}
			System.out.println("array d is:");
			for(int i=0;i<d.length;i++) {
				for(int j=0;j<d[i].length;j++) {
					System.out.println(d[i] [j]+" ");
				}
				System.out.println();
			}
		}
	}

