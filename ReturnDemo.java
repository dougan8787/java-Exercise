package hello;

public class ReturnDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++) {
			System.out.println("i value is:"+i);
			if(i==5) {
				return;
			}
			System.out.println("return out");
		}
	}

}
