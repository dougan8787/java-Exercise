package hello;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int g = 55;
		switch(g/10) {
		case 10:
		case 9 :
			System.out.println("so bad");
			break;
		case 8:
			System.out.println("so sad");
			break;
		case 7:
			System.out.println("so need");
			break;
		case 6:
			System.out.println("so seed");
			break;
		default:
			System.out.println("not bad");
		}
	}

}
