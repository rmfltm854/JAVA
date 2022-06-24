package ITbank;

import java.util.Scanner;

interface Scan{
	public abstract void scanA4();
	public abstract void scanB4();
	
}

interface Print{
	public abstract void printA4();
	public abstract void printB4();
}

class Machine implements Scan,Print{

	@Override
	public void printA4() {
		System.out.println("A4 용지를 프린트합니다");
		
	}

	@Override
	public void printB4() {
		System.out.println("B4 용지를 프린트합니다");
		
	}

	@Override
	public void scanA4() {
		System.out.println("A4 용지를 스캔합니다");
		
	}

	@Override
	public void scanB4() {
		System.out.println("B4 용지를 스캔합니다");
		
	}

	
	
}

class CarTire{
	
	Tire tire = new Hankook();
	public  void run() {
		tire.roll();
	}
	
	
	
}
	


interface Tire{
	public abstract void roll();
	
}

class Hankook implements Tire{

	@Override
	public void roll() {
		System.out.println("한국타이어 굴러가는증~");
		
	}
}

class Kumho implements Tire{

	@Override
	public void roll() {
		System.out.println("금호타이어 굴러가는중~");
		
	}
	
}
interface Animal{
	public static final int  Max_size = 200;//모든 멤버변수는 public static final이어야 한다.
	
	public abstract void Sound();//모든 메소드는 public abstract 이어야한다.
	
	
	public default void defaultMethod() {//접근제한자에서 봤던 default 랑은 다르다
		System.out.println("디폴트 메소드");
	}
	
	public static void StaticMethod() { //스태틱 메소드
		System.out.println("스태틱 메소드");
	}
}
	
class Dog1 implements Animal {

	@Override
	public void Sound() {
		System.out.println("멍~멍");	
		System.out.println("짜증존나나네");
	}
	
}

class cat implements Animal{

	@Override
	public void Sound() {
		System.out.println("냐옹");	
		System.out.println("물지도못할꺼면 짖지도마라");
	}
	
}
	

public class TodayReview0624 {

	public static void main(String[] args) {
		//오늘은 interface 에대해서 배웠다.
		
		Dog1 mydog = new Dog1();
		mydog.Sound();
		
		cat mycat = new cat();
		mycat.Sound();
		
//		Animal animal = new Animal(); /인터페이스는 객체생성불가
		
		Animal myanimal = new Dog1();
		myanimal.Sound();
		
		myanimal = new cat();
		myanimal.Sound();
		
		Animal[] myanimals = new Animal[2]; //객체배열 생성
		myanimals[0] = new Dog1();
		myanimals[1] = new cat();
		
		myanimals[0].Sound();
		myanimals[1].Sound();
		
		
		Machine machine = new Machine();
		machine.printA4();
		machine.scanA4();
		machine.printB4();
		machine.scanB4();
		
		CarTire car = new CarTire();
		
		car.run();
		car.tire = new Kumho();
		car.run();
		
		
		

	}

}
