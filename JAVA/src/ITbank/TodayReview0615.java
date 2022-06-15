package ITbank;

import java.util.Scanner;

public class TodayReview0615 {

	public static void main(String[] args) {
		//오늘은 배열을 가지고 놀았는데 예제로는
		//학생3명의 이름,국어,영어 성적을 입력받고
		//총점과 순위 나타내기
		
		Scanner scan = new Scanner(System.in);//입력받아야하니까 scanner 해주고
		String name[] = new String[3];//이름은 문자니까 String으로 배열생성 (3칸)
		int korean[] = new int[3];//국어 정수형으로 배열생성
		int english[] = new int[3];//영어 정수형으로배열생성
		int total[] = new int[3];//총합배열생성
		
		for(int i = 0;i<3;i++) {
			System.out.println("이름을 입력하세요");
			name[i] = scan.next();//입력받은 문자를 name배열에 넣어준다
		}System.out.printf("이름은 %s,%s,%s 저장되었습니다.", name[0],name[1],name[2]);//굳이안해도되는데printf활용도해볼겸 깔짝여보았다.
		System.out.println();
		for(int c = 0;c<3;c++) {
			System.out.println(name[c] + "의 국어점수를 입력해주세요");
			korean[c] = scan.nextInt();
			
			if(c>=0) {
				System.out.println(name[c] + "의영어점수를 입력해주세요.");
				english[c] = scan.nextInt();
				}
		}//이거 영어랑 국어 점수 한번에 받아오는 반복문 혼자힘으로만드는데 시간이 좀걸렸다,, 현타온다,,
		for(int i = 0;i<3;i++) {
			System.out.println(name[i] + "의 총점은" + (korean[i] + english[i]));
			total[i] = (korean[i]+english[i]);
		
		}
		if(total[0]>total[1] && total[0]>total[2]) {
			System.out.println(name[0] + "님이 1등입니다.");
		}else if(total[1]>total[0] && total[1]>total[2]) {
			System.out.println(name[1] + "님이 1등입니다");
		}else if(total[2]>total[0] && total[2]>total[1]) {
			System.out.println(name[2] + "님이 1등입니다");
		}
		
		//일단여기까지 남들 힘안빌리고 혼자서 짜본코드인데,, 아직 부족한점이 있다라는것도 인지하고있고
		//분명히 더 간단하게 반복문으로 처리할수있을것같은데,,
		//내일 로또만들면서 한번더 보도록 하겠다.(동점처리 포함)
		
		
		

	}

}
