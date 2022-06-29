package ITbank;

class UserInfo {
	
	private String name;//이름
	private int year;//나이
	private String Id;//학번
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		System.out.println(name);
		this.name = name;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		if(year > 26) {
			System.out.println("휴학을 하셧나요??");		
		}
		this.year = year;
	}
	
	public String getId() {
		return Id;
	}
	
	public void setId(String Id) {
		System.out.println(Id);
		this.Id = Id;
	}
	
	
}

public class TodayReview0617_ver3 {

	public static void main(String[] args) {
		//일반적으로 객체지향 프로그래밍에서는 객체의 필드를 외부에서 직접 컨트롤 하는것을막는다.
		//외부에서 마음대로 변경할 경우 객체의 무결성이 깨질 수 있기 때문
		//메소드를 통해서 필드를 변경하는방법을 선호한다.
		//필드는 외부에서 접근할 수 없도록 막고 메소드는 공개해서 외부에서 메소드를 통해
		//필드에 접근하도록 유도한다. 이러한역할을 하는메소드가 Getter / Setter 메소드
		//이말이 뭐냐,,? 하면 그냥 어렵게생각할것없이
		//밖에서 접근할때 직접 건들지말고 메소드로 돌아서 건들이라는말인데
		//건들떄 필요한게 메소드이고 수정역할하는 Getter/Setter 메소드 만들어서 해라 
		//뭐이렁 말인것같은데,, 같은데가 아니라 근데 진짜 하는게 그거다
		//그리고 위에서 필드를 보호한다고했는데 이게 뭐 어렵고 복잡한게아니라
		//변수선언할때 그냥 앞에 private 붙혀 주면 된다
		//Ex) private int a;
		//이런식으로 하면된다
		//바로해보자
		
		UserInfo user = new UserInfo();
		user.setName("조민수");
		user.setYear(27);
		user.setId("20193290");

	}

}
