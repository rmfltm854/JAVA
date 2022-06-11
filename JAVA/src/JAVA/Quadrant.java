package JAVA;

import java.util.Scanner;

public class Quadrant {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x;
		int y;
		System.out.println("X값을 입력해주세요.");
		x = scan.nextInt();
		
		System.out.println("Y값을 입력해주세요");
		y = scan.nextInt();
		
		if(x>0 && y>0) {
			System.out.println("1사분면입니다");
			
		}else if(x<0&&y>0) {
			System.out.println("2사분면입니다");
		}else if(x<0 && y<0) {
			System.out.println("3사분면입니다.");
		}else if(x>0 && y<0) {
			System.out.println("4사분면입니다.");
		}

	}
	//후기
	//그렇게 어렵지않았다 소요시간 한10분?
}
