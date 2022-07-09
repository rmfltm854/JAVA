package program2;

import java.util.*;

public class CoffeServiceImpl implements CoffeService {

	HashMap<Coffe,Integer> map = new HashMap<Coffe,Integer>();
	
	ArrayList<String> coffe = new ArrayList<String>();
	
	Scanner scan = new Scanner(System.in);
	
	Client client = Client.getInstance();
	
	public CoffeServiceImpl() {
		map.put(new Coffe("아메리카노"),2000);
		map.put(new Coffe("카페라떼"),3500);
	}
	
	@Override
	public void viewAll() {//커피메뉴 전체보기(커피메뉴출력)
		Set<Coffe> keyset = map.keySet();
		Iterator<Coffe> keyIter = keyset.iterator();
		
		while(keyIter.hasNext()) {
			
			Coffe viewAll = keyIter.next();
			String CoffeeName = viewAll.getCoffeName();
			int price = map.get(viewAll);
			
			System.out.println(CoffeeName + " : " + price);
		}
	}

	@Override
	public void MenuRegister() {//메뉴 이름과 메뉴가격을 입력받아 메뉴등록
		
		Scanner scan = new Scanner(System.in);
		System.out.println("등록할 메뉴의 이름과 가격을 입력해주세요");
		System.out.print("메뉴: ");
		String name = scan.next();
		System.out.print("가격: ");
		int price = scan.nextInt();
		map.put(new Coffe(name),price);
		System.out.println("등록되었습니다.");
		
	}

	@Override
	public void MenuEdit() {//메뉴 이름을 입력받아 가격수정
		Scanner scan = new Scanner(System.in);
		System.out.println("수정할 메뉴의 이름을 입력해주세욤!");
		String edit = scan.next();
		if(map.containsKey(new Coffe(edit))){
			System.out.println("가격");
			int editprice = scan.nextInt();
			Set<Coffe> keyset = map.keySet();
			Iterator<Coffe> keyIter = keyset.iterator();
				while(keyIter.hasNext()) {
					map.put(new Coffe(edit),editprice);
					System.out.println("수정되었습니다");
					break;
		}
		}else {
			System.out.println("메뉴가존재하지않습니다.");
			System.out.println("시스템을종료합니다");
			System.exit(0);
		}
	}

	@Override
	public void MenuDelete() {//메뉴이름을 입력받아 메뉴삭제
		System.out.println("삭제할 메뉴 이름을 입력해주세요");
		String removemenu = scan.next();
		if(map.containsKey(new Coffe(removemenu))){
		map.remove(new Coffe(removemenu));
		System.out.println("삭제되었습니다!");
		}else {
			System.out.println("존재하지않는 메뉴입니당!");
			System.out.println("시스템을 종료합니다");
			System.exit(0);
		}
	}

	@Override
	public void chargeMoney() {//고객돈 충전해주기
		System.out.println("얼마를 충전하시겠습니까???");
		int money = scan.nextInt();
		client.addMoney(money);
		System.out.println("충전되었습니다.");
		
		
	}

	@Override
	public void order() {//메뉴이름을 입력받아 메뉴주문(고객충전금액 - 메뉴가격)
		System.out.println("어떤 메뉴를 주문하시겠습니까??");
		String menu = scan.next();
		if(map.containsKey(menu)) {
		Set<Coffe> keyset = map.keySet();
		Iterator<Coffe> keyIter = keyset.iterator();
		while(keyIter.hasNext()) {
			
			int a = client.getMoney() - (Integer)map.get(new Coffe(menu));
		if(a > 0) {
				System.out.println(menu + "주문이 완료되었습니다.");
				client.setMoney(a);
				break;
			}else {
				System.out.println("금액이 부족합니다 금액을 충전해주세요");
				System.out.println("현재금액 : " + client.getMoney() );
			
			break;
				}
			}
		}else {
			System.out.println("존재하지않는메뉴입니다.");
			System.out.println("시스템을종료합니다.");
			System.exit(0);
		}
		
	}

	@Override
	public void showMoney() {//고객 충전금액출력
		System.out.println("현재고객님의 돈은" + client.getMoney() + "입니다.");
	}
	
	

}
