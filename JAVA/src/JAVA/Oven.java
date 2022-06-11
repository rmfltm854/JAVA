package JAVA;

import java.util.Scanner;

public class Oven {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b,c;
		
		System.out.println("시간을 입력해주세요");
		a  = scan.nextInt();
		
		System.out.println("분을 입력해주세요");
		b = scan.nextInt();
		
		System.out.println(a + ":" + b);
		
		System.out.println("필요시간을입력해주세요.");
		c = scan.nextInt();
		
		if(b + c >= 60) {
			a++;
			b = (b+c) - 60;
			if(b>=60) {
				a++;
				b = b-60;
			}
			if(a >= 24) {
				a = 0;
			}
			System.out.println(a + "시" + b + "분");
		}
		
		else{
			System.out.println(a + "시" + (b+c) + "분");      
	}		
}
	//후기
	//이거는 인터넷하나도 안찾아보고 해봤는데 그렇게어렵지는않고 다만 좀 복잡해서 메모장에 적으면서 하니까 도움이되는것같당!
	//소요시간 30분
}

