package store;

import java.util.Vector;

public class Guest {
	String name;
	int money;
	int miles;
	
	public Guest(String name, int money) {//초기화
		this.name = name;
		this.money = money;
	}
}

class OutGuest{
	
	Vector<Guest> people = new Vector<>();//백터 사람관리
	
	public void storage(Guest g){//백터에 저장
		people.add(g);
		System.out.println(g.name+"님 안녕하세요");	
	}
	public void output(){//백터 저장 출력
		
		for(int i=0; i<people.size(); i++){
			Guest result = (Guest)people.get(i);
			System.out.println("이름 : " + result.name+ ", 돈 : " +result.money+", 마일리지 : "+result.miles);
		}
	}
	
}