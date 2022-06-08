package JAVA;

public class WhileBreak {

	public static void main(String[] args) {
		/*while 문 기반 break*/
		int i = 0;
	while(i < 5) {//i가 5보다작을때까지 계속
		if(i==3) {//i가 3이랑 같으면 break//
			break;
		}
		System.out.println(i);
		i++;
	}

	}

}
