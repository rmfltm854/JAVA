package ITbank;

class Book{
	
	String title;
	String author;
	
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
}

public class TodayReview0620_v2 {
	public static void main(String[] args) {
	//클래스(객체) 배열
	//클래스 배열은 자료값을 담는 기본 자료형 배열과는 다르게 객체를 담는 배열
	//클래스 배열 은 기본자료형 처럼 값을 메모리에 넣는것이 아니라
	// 주소값을 넣는다
	
	
	
		Book[] book = new Book[2];
	book[0] = new Book("홍길동전", "조민수");
	book[1] = new Book("열혈JAVA", "윤성우");
	
	for(int i = 0;i<book.length;i++) {// for문으로 배열전체를 불러와봤다
		System.out.println("책제목 : " + book[i].title);
		System.out.println("저자 : " + book[i].author);
		System.out.println();
	}
	

}
}
