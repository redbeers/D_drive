package store;

import java.util.Arrays;
import java.util.Vector;


public class Main {

	public static void main(String[] args) {

		Guest g1 = new Guest("냉장고", 1100);
		Guest g2 = new Guest("나2", 100);
		Guest g3 = new Guest("나3", 100);
		Guest g4 = new Guest("나4", 100);
	
		
		OutGuest outG = new OutGuest();//사람등록
		outG.storage(g1);//사람1등록
		outG.storage(g2);//사람2등록
		outG.storage(g3);//사람3등록
		outG.storage(g4);//사람4등록
		
		outG.output();//사람전부 출력
		
		//물건등록
		
	}
}
