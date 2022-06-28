package ITbank;

class Person{
	String name;
	int age;
	String num;
	public Person(String name, int age, String num) {
		this.name = name;
		this.age = age;
		this.num = num;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {//equals 들어오는 obj값과 Person 값이 같다면
			Person person = (Person)obj;//person 형으로 캐스팅
			
			boolean bool = this.name.equals(person.name)
					       &&this.age == person.age
					       &&this.num.equals(person.num);
			return bool;//true 반환
		}else {
			return false;//아니면 false반환
		}
	}
	
	@Override
	public int hashCode(){
		return(name + age + num).hashCode();
	}
	
	@Override
	public String toString() {
		return ("이름 : " + name + "\n나이 : " + age + "\n전화번호 : " + num);
	}
}
public class TodayReview0628 {

	public static void main(String[] args) {
		//0628리뷰
		//오늘은 기본 api 클래스 와 random math calendar 뭐 이런것들을 배웠다.
		//우선 다른객체의 값을 비교해보겠다
		
		Person person1 = new Person("조민수", 23, "01080106631");
		Person person2 = new Person("조민수", 23, "01080106631");
		
		System.out.println(person1.equals(person2));//이게 false가 나오는데 그이유가뭐냐 이거는 값이 같아도 객체를비교하는 연산자라서 다른객체에저장되있기때문에 다른값으로본다
		//이거를 같게하려면 equals메소드를 재정의 해줘야하는데 해보겠다
		//저렇게 위에서 equals메소드를 재정의 해주면 true가 나온다.
		
		System.out.println(person1.hashCode()); //이건그냥 hash코드 값을 보는건데
		System.out.println(person2.hashCode());//두개가 틀리겠죠?? 근데 같아지게할려면 hashcode 도 재정의해주면 됩니다
		
		System.out.println(person1.toString());//이게 쓸모없는 값인데
		System.out.println(person2.toString());//이거를 좀 쓸모있게 안에있는값을 불러오게 해보겠다
		//이렇게하면 저기 값이 쭈욱 나옵니다
		
		//근데 여기서 짜증나는건뭐냐 이걸 손으로 다칠 필요가 없다는거 이클립스에서 만들어준다 열받게
		

	}

}
