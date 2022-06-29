package ITbank;

import java.util.Objects;

class Lambo{
	String name;
	String color;
	int CC;//배기량 띠
	
	public Lambo(String name, String color, int CC) {
		this.name = name;
		this.color = color;
		this.CC = CC;
	}

	@Override
	public int hashCode() {
		return Objects.hash(CC, color, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lambo other = (Lambo) obj;
		return CC == other.CC && Objects.equals(color, other.color) && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", CC=" + CC + "CC" +"]";
	}
	
	
	
	
}

public class TodayReview0628_V2 {

	public static void main(String[] args) {
		//자동으로 이클립스에서 만들어주는걸로 한번 써보겠다
		//학원이랑 똑같은거하면 재미없으니까 나는 자동차로 간다
		
		Lambo car1 = new Lambo("람보르기니 아벤타도르", "Yellow", 6498);//내 드림카다 ^^ 죽기전에 무조건 산다 ^^
		Lambo car2 = new Lambo("람보르기니 아벤타도르", "Yellow", 6498);
		
		System.out.println(car1.equals(car2));
		System.out.println(car1.hashCode());
		System.out.println(car2.hashCode());
		System.out.println(car1.toString());
		System.out.println(car2.toString());
		
		//솔직히 개편한데,, 원리도모르고 걍쓰는거보다는 원리정도는 알고 아~ 편하다 하고 쓰는게 맞다고 보기때문에 나느 원리는알았으니까 이제 이렇게쓸꺼다~

	}

}
