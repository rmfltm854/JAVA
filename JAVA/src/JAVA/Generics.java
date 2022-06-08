package JAVA;
import java.util.ArrayList;//자바라이브러리에서 불러옴

public class Generics {

	public static void main(String[] args) {
		/*Generics*/
	ArrayList<String> list = new ArrayList<String>();
	list.add("Hello");
	list.add("Hello");
	//list.add(123); string형의 값만 넣을수있기때문에 숫자는 불가능!

	}

}
