package hello;

public class AutoChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			byte b =7;
			char c = 'A';
			int a = 10;
			long l = 789L;
			float f = 3.14f;
			double d = 5.3d;
			
			int i1 = a+c;  //char value c convert to int 
			System.out.println("i1="+i1);
			long l1 = l-i1;	//int value il convert to long
			System.out.println("l1="+l1);
			float f1 = b*f; //byte value a convert to float
			System.out.println("f1="+f1);
			double d1 = d/a;
			System.out.println("d1="+d1);
			int i2 = (int) f1; // float value convert to int
			System.out.println("i2="+i2);
			char c2 =(char)(l/a); //int value a convert long / long convert to char
			System.out.println("c2="+c2);
	}

}
