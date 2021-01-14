package f_oop;

public class OOP2_01 {

	public static void main(String[] args) {
		/*
		 * 
		 * 1.상속(is ~ a)
		 * -기존의 클래스를 재사용하여 새로운 클래스를 작성한다.
		 * -적은 양의 코드로 새로운 콜르새를 작성할 수 있다.
		 * -새로 작성하고자 하는 클래스 뒤에 상속받고자 하는 클래스의 이름을 
		 * extends 와 함께 써준다.
		 * 
		 * class Child extends parent{
		 * 
		 * }
		 * 
		 * -상속해주는 클래스를 조상클래스, 상속받는 클래스를 자손클래스라 한다.
		 * 	조상클래스 -> 부모클래스, 상위클래스, 기반클래스
		 * 	자손클래스 -> 자식클래스, 화위클래스, 파생된클래스
		 * -멤버만 상속된다.
		 * -자손클래스의 멤버의 갯수는 조상 클래스보다 항상 같거나 많다.
		 * 
		 * 2.포함(has ~a)
		 * -상속이외에 클래스를 재사용하는 방법
		 * -한 클래스의 멤버변수로 다른 클래스를 선언하는 방법
		 * 
		 * 
		 * toString()
		 * 	인스턴스의 정보를 반환할 목적으로 만들어졌다. 
		 *
		 * 
		 * 3.단일상속
		 * -자바에서는 단일상속 가능(두개이상은 불가능)
		 * 	class TVCR extends TV,VCR{불가능하다.
		 * 	}
		 * -Tv와 VCR에 같은 메서드가 존재할때 어떤것을 상속받을지 알 수 없다.
		 * -메서드의 명을 바꾼다면 기존에 사용하던 모든 곳을 수정해 주어야 한다.
		 * -클래스 간의 관계가보다 명확해지고 더욱 신뢰하 수 있도록 해준다.
		 * 
		 * 4.Object클래스
		 * -코든 클래스의 상속계층도의 제일 위에 위피하는 조상 클래스이바.
		 * -다른 클래스로부터 상속받지 않는 클래스는 자돚억으로 objce클래스를 상속받는다.
		 * 	classs Tv{
		 * 	}
		 * 	class Tv ectends Object{
		 * 	}
		 * -toStrong(), equals()같은 메서드를 따로 정의하지 않고 사용하는 것은 Object클래스에 정의된 것이기 때문이다.
		 * 
		 * 5.오버라이드(override)
		 * -조상 클래스로부터 상속받은 메서드의 내용을 수정하는 것
		 * -오버라이드의 조건
		 * 		상속받는 메서드의 이름이 같아야 하낟.
		 * 		매개변수의 갯수와 타입이 같아야한다.
		 * 		반환타입은 같아야한다.
		 * -조상클래스의 메서드를 자손클래스에서 오버라이드 할때는 접근제어자를 조상클래스의 메서드보다 좁은 범위를 선택할 수 있다.
		 * 예외는 조상클래스의 메서드보다 많이 선언 할 수 없다.
		 * 인스턴스 메서드를 클래스 메서드로 변경할 수 없다.
		 * 
		 * 6.super. (
		 * -조상클래스의 멤버와 자손클래스의 멤버가 중복정의 되어 서로 구분해야하는 경우 사용
		 * -자손클래스멤버에서만 사용이 가능
		 * -조상의 멤버와 자신의 멤버를 구분하는데 사용된다는 점ㅇ을 제외하고는 this. 과 동일하다.
		 * -클래스 메서드에는 사용할 수 없고 인스턴스 메서드에서만 사용가능
		 * 
		 * 7. super()
		 * -this() 와 마찬가지로 super()역시 생성자 호출
		 * -this()는 같은 클래스와 다른 생성자를 호출, super() 자손클래스의 생성자에서 
		 * 	부모클래스의 생성자를 호출할때 사용한다.
		 * -생성자를 호출할때 생성자의 가장 첫줄에 써야한다.
		 * 
		 * 8. 제어자
		 * -클래스, 메서드, 변수의 선언부에사용
		 * -접근제어와 그외 제어자로 나누어 진다.
		 * -접근제어자 : public(프로젝트), protected, default(패키지), private(클래스)
		 * -그외 제어자 : static, final, abstract
		 * -접근제어자와 그외 제어자가 동시에 있을때 접근제어자를 가장 왼쪽에 쓴다.
		 * -static(클래스의 , 공통적인)
		 * 		메서드와 변수, 변수 초기화블럭 에만 사용가능
		 * 		클래스변수
		 * 		>모든 인스턴스에서 공통적으로 사용
		 * 		>인스턴스를 생성하지 않고 클래스명.변수명 으로 호출한다.
		 * 		>클래스가 메모리에 로드될때 함께 로드된다.
		 * 		>클래스멤버에서는 인스턴스 멤버를 호출할 수없다.
		 * -final(마지막의, 변경할 수 없는)
		 * 		변수   : 변수에 사용시 값을 병경할 수 없는 상수가 된다.
		 * 		메서드: 메서드에 사용시 오버라이드 사용 불가
		 * 		클래스: 클레스에서 사용하면 부모클래스가 될 수 없다.
		 * -abstract(추상의, 미완성된)
		 * 		메서드에 사용시 선언부만 작성하고 구현부는 작성되지 않느낟.
		 * 		클래스에 사용시 (미완성된 메서드) 추상메서드를 가지고 있음을 알린다.
		 * 9.접근제어자
		 * -public : 접근제한이 없다.
		 * -protected : 같은 패키지 + 다른 패키지의 자손 클래스
		 * -default :같은 패키지 내에서 호출 가능
		 * -private :같은 클래스내에서 호출가능
		 * 
		 * -멤버변수와 메서드에는 전부 사용가능
		 * -클래스에는 public, default만 사용가능
		 * 
		 * 
		 * 10.생성자의 접근제어자
		 * -인스턴스의 생성을 제한 할 수 있다.
		 * -생성자의 접근제어자를 private으로 변경
		 * 		객체생성이 불가능
		 * 		상속도 불가능 > 다른 클래스의 조장이 될수 없다.
		 * 		상속할 수 없는 클래스임으로 final을 추가하여 상속하 수 없는 클래스임을 알리는 것이다.
		 * -singleton
		 * 		
		 * 11. 캡슐화
		 * -접근제어자를 사용하는 이유
		 * 		외부로부터 데이터를 보호하기 위해
		 * 		외부에는 불필요한 내부적으로만 사용되는 부분을 감추기위해
		 * 
		 * 12. 다형성(polymorphism)
		 * -여러가지 행태를 가질수 있는 능력
		 * -한 타입의 참조변술 여러 타입의 객체를 참조할 수 있다.
		 * -부모타입의 참조변수로 자식타입의 인스턴스를 참조할 수 있다.
		 * 
		 * 13. 참조변수의 형변환
		 * -서로 상속관계에 있는 클래스간에는 형변환이 가능하다.
		 * -자식타입 > 부모타입(up-casting) > 생략가능
		 * -부모타입 > 자식타입(down-casting) > 생략불가능
		 * 
		 * 14.instanceof
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */

	}

}
