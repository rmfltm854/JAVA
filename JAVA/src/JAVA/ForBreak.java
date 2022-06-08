package JAVA;

public class ForBreak {

	public static void main(String[] args) {
		/*반복문과 break*/
	int i;
	for(i = 0; i < 5; i++) {//i는 0이고 1씩더해가면서5보다작을때까지
		if(i==3) {//i가 3이랑 같으면 stop
			break;
		}
		System.out.println(i);
	}

	}

}
