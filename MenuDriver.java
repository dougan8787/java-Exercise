package hello;
import java.util.Scanner;
public class MenuDriver {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("*****************");
			System.out.println("*1¡Bdetdata 2¡Bdata*");
			System.out.println("*3¡Bdatasave 4¡Bdataveiw");
			System.out.println("* 5¡Bdatasend 6¡Bexit*");
			System.out.println("*****************");
			System.out.println("plase input 0~5:");
			
			int choice = scanner.nextInt();
			switch(choice) {
			case 1:
				System.out.println("dataget....");
				break;
			case 2:
				System.out.println("data.......");
				break;
			case 3:
				System.out.println("datasave...");
				break;
			case 4:
				System.out.println("dataview...");
				break;
			case 5:
				System.out.println("datasend...");
				break;
			case 0:
				System.exit(0);
			default:
				System.out.println("please input surcess(0~5)!");
			}
		}
	}
	
}
