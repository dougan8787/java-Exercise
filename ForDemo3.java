package hello;

public class ForDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=100;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(+j+"*"+i+"="+i*j+" ");
			}
			System.out.println("");
		}
	}

}
