package JAVA;

import java.util.Scanner;

public class grade {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를입력해주세요");
		int a;
		a = scan.nextInt();
		if(a>90 && a<=100) {
			System.out.println("A");
		}else if(a>79 && a<=90) {
			System.out.println("B");
		}else if(a>69 && a<=80) {
			System.out.println("C");
		}else if(a>59 && a<=70) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
				
	}

}
