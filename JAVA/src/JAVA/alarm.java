package JAVA;

import java.util.Scanner;

public class alarm {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int h,m;
		System.out.println("시를 입력해주세요");
		h = scan.nextInt();
		
		System.out.println("분을 입력해주세요");
		m = scan.nextInt();
		
		if(m < 45) {
			h--;
			m = 60-(45 - m);
			if(h <= 0) {
				h = 23;
			}
			System.out.println(h + "시" + m + "분");
		}
		else {
			System.out.println(h + "시" + (m-45) + "분");
			
		}
		
	}
	//후기: 시간개념을 수식으로 컴퓨터한테 알아먹게 알려주는과정에서 많이헤맸는데,, 구글에서 최소한의 힌트로 풀려고많은노력을했다
	//아직은 머리가 제대로안돌아가는느낌인데 조금더해봐야겠다,, 카카오합격해야하는데 하,,

}
