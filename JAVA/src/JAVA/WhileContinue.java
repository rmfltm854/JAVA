package JAVA;

public class WhileContinue {

	public static void main(String[] args) {
		int  i = 0;
	while(i < 5) {
		if( i == 3) {//1~4까지 숫자에서 i=3이면 stop
			continue;
		}
		System.out.println(i);
		i++;
	}

	}

}
