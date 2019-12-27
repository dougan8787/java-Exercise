package hello;

public class DoWhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int i =1;
		do {
			sum +=i;
			i++;
		}while(i<=100);
		System.out.println("1~100 sum is:"+sum);
	}
}
