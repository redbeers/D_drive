package h_javaLang;

public class JavaLang_01 {

	public static void main(String[] args) {
		/*
		 * 1.java.lang패키지
		 * 	-java.lang패키지는 자바프로그래밍에 기본이 되는 클래스들을 포함하고 있따.
		 * 	-ex) String,object, System.....등
		 * 
		 * 2.object클래스
		 * 	-object클래스는 멤버변수는 없이 11개의 메서드로 이루어져 있다.
		 * 	-boolean equals(object obj)
		 * 		매개변수로 객체의 참조변수를 받아서 비교하여 그 결과를 boolean겂으로 알려준다.
		 * 		참조변수가 저장하고 있는 주소가 같은지를 비교할수 있따.
		 * 		equls()가 오버라이드 되어 있는 클레스들
		 * 		=>String, Date, File, wearpper클래스...
		 * 	-hashCode() - 10진수로 이루어져 있다.
		 * 		객체의 주소값을 이용해서 해시코드를 만들어 반환한다.//hashCode가 같다면 주소가 같다.
		 * 		String클래스는 문자열의 내용이 같으면 같은 해시코드를 반환하도록 만들어져 있다.
		 * 	-toString()
		 * 		인스턴스의 정보를 문자열로 반환할 목적으로 만들어져 있다.
		 * 		기본toString()
		 * 		->return getClass().get Name()+"@".toHexString(hachCode()//인스턴스의 모든정보를 가지고있다.
		 * 		
		 * 	-clone()
		 * 		얕은 복사
		 * 		-자신을 복제하여 새로운 인스턴스를 생성한다. 
		 * 		-단순히 인스턴스변수의 값만을 복사한다.
		 * 		-객체가 참조하고  있는 객체까지 복제하지 않는다.
		 * 	-getClass()
		 * 		자신이 속한 클래스의 Class객체를 반환하는 메서드
		 * 		Class 객체를 얻는 방법
		 * 		-생성된 객체로 부터 얻는 방법
		 * 		Class ca = new Card().getClass();
		 * 		
		 * 		-클래스 리터럴로 부터 얻는 방법
		 * 		Class ca = Card.class;
		 * 
		 * 		-클래스의 이름으로부터 얻는 방법
		 * 		Class.forName("클래스명")
		 * 		Class ca = Class.forName("Card")//문자열을 주고 불러오는 경우 예외처리를 해준다.
		 * 		
		 * 3 String 클래스
		 * 	-다른 언어에서는 문자열을 char형배열로 다룬다. 하지만 자바에서는 문자열을 위한 클래스가 존재한다.
		 * 	-문자열을 하치게 되면 새로운 문자열을 가진 String 인스턴스가 생성된다.
		 * 	-문자열 간의 결합시에는 StringBuffer클래스를 사용한다.
		 * 
		 * 	-문자열의 비교
		 * 		문자열 리터럴을 지정하는 방법과 String 클래스의 생성자를 사용해서 만드는 방법이 있다.
		 * 		문자열 리터럴은 클래스가 메모리에 로드될때 자동적으로 미리 생성된다.
		 * 	-String 클래스의 생성자와 메서드
		 * 		자주 사용되는 것만 확인해 보자
		 * 
		 * 	-String 인코딩
		 * 		한글 윈도우의 경우 인고딩 CP949방식을 가지고 있다.
		 * 			우리는 UTF8방식을 사용하고 있다.
		 * 	-String format
		 * 		기본형 겂을 String으로 변환
		 * 		(1)valueOf()
		 * 		-int a = 10;
		 * 		-String str = String.valueOf(a);
		 * 		(2)빈 문자열을 더하는 방법
		 * 		-int a = 10;
		 * 		-String str = a + "";
		 * 		
		 * 		String을 기본형 값으로 변환
		 * 		(1)wrapper클래스를 이용하는 방법//10진수 이용
		 * 		-String str = "100";
		 *		-int a = Integer.parseInt(str);//문자가들어오면 예외가 발생한다.
		 *		-int a = Interger.valueOf(str);
		 *
		 *		(2)여러가지 진수 이용
		 *		-String str = "100"
		 *		-int a = Interger.parseInt(str,4);//str이 4진수 입니다.라고 읽는다.//(문자,다른 진수)가들어오면 예외가 발생한다.
		 *	
		 *4.StringBuffer 클래스와 StringBuilder클래스
		 *	-String클래스는 인스턴스를 생성할때 지정된 문자열을 변경할 수 없다.
		 *	-StringBuffer를 사용하는 것이 좋다.//문자열을 합칠때는 StringBuffer를 쓴다. 빠르다.아주아주 빠르다 동기화에도 유용하다.
		 * 	-StringBuilder 동기화에 유용하지않다.
		 * 
		 * 5.Math클래스
		 * 
		 * 6.wrapper클래스
		 * 	-객체지향의 개념은 모든 것을 객체로다루어야 한다.
		 * 	-8가지 기본형은 객체로 다루지 않는다.
		 * 	-때로는 기본형 변수도 객체로 다루어야 하는 경우
		 * 		매개변수로 객체를 요구할때
		 * 		기본형이 아닌 객체로 저장되어야 할때
		 *  	
		 *  	기본형
		 *  	boolean	:Boolean
		 *      char 	: Character ***
		 *      byte 	: Byte
		 *      short 	: Short
		 *  	int 	: Integer ***
		 *      long 	: Long
		 *      float 	: Float
		 *      double	 : Double
		 *      
		 *	-오토박싱 : 기본형 값을 래퍼클래스의 객체로 자동 변환해 주는 것
		 *	-언박싱 : 래퍼클래스의 객체를 기본형 값으로 변환해 주는것
		 *
		 *7.StringTokenizer클래스
		 *	-긴 문자열을 지정된 구분자를 기준으로 토큰이라는 여러개의 문자열로 잘라내는데 사용하낟.
		 *	-단 한 문자의 구분자를 사용할 수 있다.
		 *      
		 *8. 
		 *      
		 *      
		 */     
                
	}           
                
}
