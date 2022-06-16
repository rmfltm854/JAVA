package ITbank;

import java.util.Scanner;

public class TodayReview0615ver2 {

	public static void main(String[] args) {
		
		//lotto프로그램
		//내가입력한숫자와 랜덤으로 추출한 로또 번호를 비교해서 몇개가 일치하는지 보여주는 프로그램.
		
		Scanner scan = new Scanner(System.in);		
		
		int[] lotto = new int[6];
		int[] num = new int[6];
		int count = 0;
		
		for(int i = 0; i < 6; i++) {
			
			System.out.print("하고싶은수를 입력 해주세요: ");
			num[i] = scan.nextInt();//수를 입력받아서 num[]배열에 넣어준다,.
			
			for(int j = 0; j < i; j++) {
				
				if(num[i] == num[j]) {
					i--;
					break;
				}
				
			}
			
		}
		
		
		for(int i = 0; i < 6; i++) {
			
			lotto[i] = (int)(Math.random()*45)+1;//1~45까지의 수중에 랜덤으로 수를뽑아서 lotto[i] 배열에 넣어준다.
			
			for(int j = 0; j < i; j++) {
				
				if(lotto[i]==lotto[j]) {//변수처리 : 만약 새로뽑은 번호가 lotto[]배열에있는수와 겹치면 다시 돌아가서 한번더뽑는다.
					i--;
					break;
					
				}
				
			}
			
		}
		
		for(int i = 0;i<6;i++) {
			
			for(int j = 0;j<6;j++) {
				if(lotto[i] == num[j])				
					count++;//lotto[]배열의숫자와 num[j]배열 안의 숫자가 겹치ㅣ면 count를 1 올려준다.
				
			}
			
		}
		
		
		for(int i = 0; i < 6; i++) {
			
			System.out.print(lotto[i] + " ");

			
		}
		
		System.out.println();
		System.out.println(count);
		
		scan.close();
	}
	
}
