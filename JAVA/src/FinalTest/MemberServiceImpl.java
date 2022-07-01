package FinalTest;

import java.util.*;

public class MemberServiceImpl implements MemberService {
	
	ArrayList<Member> member = new ArrayList<Member>();
	Scanner scan = new Scanner(System.in);

	@Override
	public void insert() { //회원등록
		System.out.println("몇명의 회원을 등록하시겠습니까??");
		int many = scan.nextInt();
		
		for(int i = 0;i < many;i++) {
			System.out.println("이름, 나이, 학번, 전화번호 를 순서대로 입력해주세요");
			//이름
			System.out.print("이름 : ");
			String name = scan.next();
			
			//나이
			System.out.print("나이 : ");
			int age = scan.nextInt();
			
			//학번
			System.out.print("학번 : ");
			String ID = scan.next();
			
			//전화번호
			System.out.print("전화번호 : ");
			String tel = scan.next();
			
			member.add(new Member(name,age,ID,tel));
		}
		System.out.println(many + "명 저장되었습니다.");
		
		
	}

	@Override
	public void list() {//회원 목록
		for(int i = 0;i<member.size();i++) {
			Member all = member.get(i);
			all.profile();
			
		}
		
		
	}

	@Override
	public void select() {//회원 이름으로 검색해서 있으면 나머지정보출력
		System.out.println("이름을 입력해주세요");
		String name = scan.next();
	    for(int i = 0;i<member.size();i++) {
	    	
	    	Member name1 = member.get(i);
	    	
	    	if(name1.getName().equals(name)) {
	    		name1.profile();
	    		return;
	    	}
	    }
	    System.out.println("등록되어있지않은 회원입니다.");
		
		
	}

	@Override
	public void edit() {//회원 수정
		System.out.println("수정할 회원의 이름을 입력해주세요");
		String editname = scan.next();
for(int i = 0;i<member.size();i++) {
	    	
	    	Member name1 = member.get(i);
	    	
	    	if(name1.getName().equals(editname)) {
	    		System.out.println("수정할 회원의 정보를 입력해주세요");
	    		System.out.print("이름 : ");
				String name = scan.next();
				
				//나이
				System.out.print("나이 : ");
				int age = scan.nextInt();
				
				//학번
				System.out.print("학번 : ");
				String ID = scan.next();
				
				//전화번호
				System.out.print("전화번호 : ");
				String tel = scan.next();
				
				member.set(i,new Member(name,age,ID,tel));
	    		
	    		
	    		return;
	    	}
	    }
		
		
	}

	@Override
	public void delete() {//회원삭제
		System.out.println("삭제할 회원의 이름을 입력해주세요");
		String deletename = scan.next();
		
for(int i = 0;i<member.size();i++) {
	    	
	    	Member name1 = member.get(i);
	    	
	    	if(name1.getName().equals(deletename)) {
	    		System.out.println(deletename + "님의 정보를 삭제합니다.");
	    		
	    		member.remove(i);
	    		System.out.println(deletename + "님의 정보를 삭제했습니다");
	    		return;
	    		
	    	}
	    }
	    System.out.println("등록되어있지않은 회원입니다.");
		
		
	
		
		
		
		
	}
	

}
