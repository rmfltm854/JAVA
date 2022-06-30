package FinalTest;

import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		// 회원관리 프로그램
		//1.회원목록2.회원조회3.회원등록4.회원수정5.회원삭제.6.종료
		
		Scanner scan = new Scanner(System.in);
		MemberService service = new MemberServiceImpl();
		
		
		while(true) {
			System.out.println("회원관리프로그램");
			System.out.println("1.회원목록2.회원조회3.회원등록4.회원수정5.회원삭제.6.종료");
			int choice = scan.nextInt();
			
			switch(choice){
			
			case 1 : 
				service.list();
				break;
				
			case 2 :
				service.select();
				break;
				
			case 3 : 
				service.insert();
				break;
				
			case 4 :
				service.edit();
				break;
				
			case 5 :
				service.delete();
				break;
				
			case 6 :
				System.out.println("시스템을 종료합니다");
				System.exit(0);
				
				default :
					System.out.println("잘못입력하셨습니다.");
			
			}
		}

	}

}
