package h_javaLang;

import java.util.StringTokenizer;

public class StringTokenizerTest_01 {

	public static void main(String[] args) {
		
		String text = "100,,,200,,300,400";
		
		String[] sp = text.split("0,");
		//포함하는 만큼 자른다.
		for(int i=0; i<sp.length; i++){
			System.out.println(sp[i]);
		}
		System.out.println("====================");
		StringTokenizer st = new StringTokenizer(text,"0,");
		//문자열의 크기를 모른다.
		//써있는 모든걸 구분자로한다.
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
			
		}
		
	}

}
