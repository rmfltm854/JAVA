package ITbank;

import java.util.Scanner;

class Ticket{
	public static int seatNumber = 10;
}
class Machine1{
	
	public void ticketpurchase(int a) {
		
		if(a>Ticket.seatNumber) {
			System.out.println("좌석이 모자랍니다.");
		}else {
			System.out.println(a + "개를 구입합니다");
			Ticket.seatNumber = Ticket.seatNumber - a;
			System.out.println(Ticket.seatNumber + "개 남았습니다.");
			if(Ticket.seatNumber <= 0 ) {
				System.out.println("표가 매진되어 프로그램을 종료합니다.");
				System.exit(0);
		   }
	    }
		}
		
	}



class Machine2{
	
	public void ticketpurchase(int a) {
		if(a>Ticket.seatNumber) {
			System.out.println("좌석이 모자랍니다.");
		}else {
			System.out.println(a + "개를 구입합니다");
			Ticket.seatNumber = Ticket.seatNumber - a;
			System.out.println(Ticket.seatNumber + "개 남았습니다.");
			if(Ticket.seatNumber <= 0 ) {
				System.out.println("표가 매진되어 프로그램을 종료합니다.");
				System.exit(0);
		   }
	    }
    }
}

public class TodayReview0621_v2 {

	public static void main(String[] args) {
		//티켓클래스를 만든다.
		//필드는  public static int seatNumber = 10;
		//machine1클래스를 만든다.
		//ticketpurchase메소드를 만든다.
		//메소드는 티켓수만큼의 정수를 매개변수로 받아서 티켓을 구매할수있게하는 메소드,
		//좌석수보다 티켓수가 크면 안되고 , 좌석수가 0이면 프로그램 종료
		
		//Machine1 buy1 = new Machine1();
	      // buy1.ticketpurchase(2);
		
		//이제 입력을 받아서 1번기계, 2번기계,남은표 확인 기능을 넣어서 해보겠다
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0;i<Ticket.seatNumber;i++) {
		
		System.out.println("기능을 선택해주세요");
		System.out.println("1.1번기계에서구매 2.2번기계에서구매 3.남은 좌석수 확인");
		int a = scan.nextInt();
		
		switch(a) {
		
		case 1 : 
			System.out.println("1번기계에서 몇개를 구입하시겠습니까?");
			int many = scan.nextInt();
			
			Machine1 machine1 = new Machine1();
			machine1.ticketpurchase(many);
			break;
			
			
		case 2 :
			System.out.println("2번기계에서 몇개를 구입하시겠습니까?");
			int many2 = scan.nextInt();
			
			Machine2 machine2 = new Machine2();
			machine2.ticketpurchase(many2);
			break;
			
			
			
			
		case 3 :
			System.out.println(Ticket.seatNumber + "개 남았습니다.");
			break;
			
			
		}

	}

}
}
