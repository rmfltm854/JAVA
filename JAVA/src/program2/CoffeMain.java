package program2;

import java.util.*;

public class CoffeMain {

	public static void main(String[] args) {
		
		CoffeService service = new CoffeServiceImpl();
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.손님 2.커피숍사장님 3.프로그래종료");
			
			int choice = scan.nextInt();
			
			if(choice == 1) {
				
				Loop1 : while(true) { // while문에 이름붙혀주기
					
					System.out.println("################# 커피메뉴 주문하기###################");
					System.out.println("#1.전체메뉴보기 2. 충전금 충전 3.메뉴주문 4.잔액보기 5.나가기#");
					System.out.println("#################################################");
					
					System.out.print("선택번호입력 : ");
					int choice1 = scan.nextInt();
					
					switch(choice1) {
					
					case 1 : 
						service.viewAll();
						break;
						
					case 2 :
						service.chargeMoney();
						break;
					case 3 :
						service.order();
						break;
						
				    case 4 :
				    	service.showMoney();
				    	break;
				    	
				    case 5 :
				    	System.out.println("다음에 또 오세요");
				    	break Loop1; //Loop1 while문을 빠져나간다.
				    	default :
				    		System.out.println("잘못입력 하셨습니다.");
					}
					
				}
				
				
			}else if(choice == 2) {
				
            Loop2 : while(true) { // while문에 이름붙혀주기
					
					System.out.println("################# 커피메뉴 주문하기###################");
					System.out.println("#1.전체메뉴보기 2. 커피메뉴 등록 3.메뉴수정 4.메뉴삭제 5.나가기#");
					System.out.println("#################################################");
					
					System.out.print("선택번호입력 : ");
					int choice1 = scan.nextInt();
					
					switch(choice1) {
					
					case 1 : 
						service.viewAll();
						break;
						
					case 2 :
						service.MenuRegister();
						break;
					case 3 :
						service.MenuEdit();
						break;
						
				    case 4 :
				    	service.MenuDelete();
				    	break;
				    	
				    case 5 :
				    	System.out.println("가계를 정리하고 나갑니다");
				    	break Loop2; //Loop2 while문을 빠져나간다.
				    	default :
				    		System.out.println("잘못입력 하셨습니다.");
					}
					
				}
				
				
			}else if(choice == 3) {
				System.out.println("프로그램을 종료합니다");
				System.exit(0);
				
				
			}else {
				System.out.println("잘못입력하셨습니다.");
			}
		}

	}

}
