package i_reg;

import java.util.Scanner;
import java.util.regex.*;

import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil.ToStringAdapter;

public class RegEx_01 {

	public static void main(String[] args) {
		/*
		 * 1. 정규식이란?
		 * -텍스트 세이터 중에서 원하는 조건과 일치하는 문자열을 찾기 위해 만들어 졌다.
		 * -정규식의 구성
		 * 		Pattern클래스를 이용하여 정규식을 정의한다.
		 * 		Matcher클래스를 이용하여 대이터를 비교한다.
		 */
		
//		Pattern p = Pattern.compile("[a-z]*");//*없거나 무한정 있을수 있따.
//		java.util.regex.Matcher m = p.matcher("");//????????????
//		System.out.println(m.matches());
		
		/*
		 * ^ 문자열의 시작
		 * $ 문자열의 끝
		 * . 임의의 한문자 단 \는 제외
		 * * 앞 문자가 없거나 무한정일수 있다.
		 * + 앞문자가 한번이상 있다.
		 * ? 앞 문자가 없거나 하나
		 * [] 문자의 집합이나 범위를 표현한다.
		 * {} 횟수 또는 범위를 나타낸다.
		 * () 소괄호안의 문자를 하나의 문잘 인지
		 * | 패턴안에서 or의 의미를 가진다.(010|016)//010또는 016
		 *
		 *\s 공백문자
		 *\S 공백문자를 제외한 모든 문자
		 *\w 알파벳 또는 숫자
		 *\d 숫자[0-9] 0~9
		 */
		
		//영어 소문자 2개또는 3개로 이루어진 정규식
		
		Pattern p1 = Pattern.compile("[^a-zA-Z0-9$]");
		Matcher m1 = p1.matcher("!");//????????????
		System.out.println("1번 "+m1.matches());
		
		String regEx01 = "[a-z]{2,3}";
//		System.out.println(Pattern.matches(regEx01, "asf"));
		
		
		//2 영문자가 3회 나오고 숫가자가 없거나 무제한 있다.
		Pattern p2 = Pattern.compile("[a-zA-Z]{0,3}[0-9]*");
		Matcher m2 = p2.matcher("adf41");
		System.out.println(m2.matches());
		//3. 숫자3 - 숫자 4 - 숫자4 (-도포함)
		Pattern p3 = Pattern.compile("\\d{3}-\\d{4}-\\d{4}");
		Matcher m3 = p3.matcher("011-1234-1234");
		System.out.println("3번문제 " + m3.matches());
		
		//4. 01(0,1,6,7,8,9)가온다. -(첫자는 0이올수 없다 숫자3개) - (숫자4개)
		Pattern p4= Pattern.compile("^01(0|1|[6-9]){1}-[1-9]{1}\\d{3}-\\d{4}");
		Matcher m4 = p4.matcher("011-9234-1234");
		System.out.println("4번문제 " + m4.matches());
		//5추가문제 주민번호
		
		String p5 = "^\\d{2}(0[1-9]|1[0-2])(0[1-9]|[1-2]\\d|3[0-1])-";
		System.out.println("5번 "+Pattern.matches( p5, "001330-"));
		/*
		 * 년월일
		 * 숫자2개 0 1-9 0 1-9 - 1-4 숫자6자리
		 * 		 1 0-2 1 0-9
		 * 		 	   2 0-9
		 * 		 	   
		 */
//		Pattern p5 = Pattern.cs
		
		/*
		 * 이메일주소
		 * 1.영문자로시작
		 * 2.영문자또는 숫자 특수문자 (-_\)무한
		 * 3.@이후에 영문자 또는 숫자가 3~7자가 올수 있따.
		 * 4. .이후에 영문자또는 숫자가2~3자가 올 수 있다.
		 * 5. .kr올수도 있다.
		 * 
		 */
		String email = "^[a-zA-Z][\\w-_]*@[\\w]{3,7}.([\\w]{2,3}|[\\w]{2,3}.kr)";
		System.out.println(Pattern.matches(email, "o-_-o@aasdfsd.1as.kr"));

		Scanner sc = new Scanner(System.in);
		String tt = sc.next();
		String text = tt;
		
		String result = filter(text);
		System.out.println(result);
		
		
	}

	private static String filter(String text) {
		Pattern p = Pattern.compile("건강|부모님|시니",Pattern.CASE_INSENSITIVE);//Pattern.CASE_INSENSITIVE일치해야만 찾는다.
		Matcher m = p.matcher(text);
		StringBuffer sb = new StringBuffer();
		while(m.find()){
			String group = m.group();
			String re = maskword(group);
			m.appendReplacement(sb, re);
		}
		m.appendTail(sb);
		
		
		
		return sb.toString();
	}

	private static String maskword(String group) {
		//부모님 > ✈
		char[] gg = group.toCharArray();
		
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<gg.length; i++){
			if(i == 0){
				sb.append(gg[i]);
			}else{
				sb.append("✈");
			}
		}
		
		return sb.toString();
	}
}

