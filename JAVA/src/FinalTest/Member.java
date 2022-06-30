package FinalTest;

public class Member {
	private String name;
	private int age;
	private String ID;
	private String tel;
	
	public Member(String name, int age, String ID, String tel) {
		super();
		this.name = name;
		this.age = age;
		this.ID = ID;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public void profile() {
		System.out.println("**************************************");
		System.out.println("이름: " + name);
		System.out.println("나이 : " + age);
		System.out.println("학번 : " + ID);
		System.out.println("전화번호 : " + tel);
		System.out.println("**************************************");
	}
	
	
	

}
