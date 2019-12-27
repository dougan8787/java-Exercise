package hello;

public class ifDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int g = 90;
		if(g < 0) {
			System.out.println("negative number");
		}
		if(g % 2 == 0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
		
		if(g == 90){
			System.out.println("so bad");
		}else if(g == 80) {
			System.out.println("so sad");
			
		}else if(g == 70) {
			System.out.println("so had");
		}else if(g == 60) {
			System.out.println("so need");
			
		}else {
			System.out.println("not bad");
		}
	}
}
