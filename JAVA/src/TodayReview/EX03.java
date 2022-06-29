package input;

import java.util.Scanner;

public class EX03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름이뭐에요?");
		String a = scan.next();
		
		System.out.print("나이가 몇살이에요?");
		int b = scan.nextInt();
		
		System.out.print("뭄무계가 몇이에요?");
		double c = scan.nextDouble();
		
		System.out.print("키가몇이에요?");
		double d = scan.nextDouble();
		
		System.out.println("이름:" + a);
		System.out.println("나이:" + b);
		System.out.println("몸무계" + c);
		System.out.println("키:" + d);
	}

}
