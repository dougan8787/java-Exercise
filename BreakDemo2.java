package hello;

public class BreakDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer:for(int i=0;i<=5;i++) {
			for(int j=0;j<=3;j++) {
				System.out.println("i value:"+i+"j value:"+j+"");
				if(j==1) {
					
					break outer;
				}
			}
		}
	}

}
