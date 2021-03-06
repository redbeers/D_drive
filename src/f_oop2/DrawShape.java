package f_oop2;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class DrawShape extends Frame{
	public static void main(String[] args) {
		DrawShape ds = new DrawShape();
		//ds.paint(new Graphics())  << 인자값 지정 호출되었다
	
	}
	
	DrawShape(){
		super("밥신청하세요");//부모클래스의 생성자를 호출
		setSize(500, 500);
		setBackground(Color.MAGENTA);
		setVisible(true);
		setResizable(false);	//고인돌 모양 기억하기
		//같은 영역내에 있으면 클래스명. 안해도 된다
		//인스턴스끼리 같은 영역 그럼 생략가능
		//드로우쉐이프 영역내에 있으면 인스턴스화 없이 바로 그냥 메서드 부를 수 있다
		//
	}
	
	@Override
	//위에서 부른 적 없는데 어떻게 알고 호출? 그림에는 안그렸지만 frame에는 페인트라는 메서드가 있다 
	//부모에 있지만 부모 꺼 맘에 안들어서 내 맘대로 수정한 것
	public void paint(Graphics g){
		//1. 매개변수가 두개인 생성자를 이용하여 원을 만들어주세요 c
		Point p1 = new Point(100, 100);
		Circle c = new Circle(50, p1);

		
		//2. g.drawOval()을 이용하여 원을 그려주세요
		g.drawOval(c.p.x, c.p.y, c.r, c.r);//pp로접근하면 안된다 걔는 필요해서 만든애 c로 접근해야함
		
		//3. 매개변수가 하나인 생성자를 이용하여 삼각형을 만들어주세요 t
		//   100,100  200,200  100,200
	
		Point p2 = new Point(200, 200);
		Point p3 = new Point(100, 200);
		
		Point[] p = new Point[]{p1, p2, p3};
		
		Triangle t = new Triangle(p);
		
		//4. g.drawLine() 3개를 이용하여 삼각형을 그려주세요
		
		g.drawLine(t.p[0].x, t.p[0].y, t.p[1].x, t.p[1].y);
		g.drawLine(t.p[1].x, t.p[1].y, t.p[2].x, t.p[2].y);
		g.drawLine(t.p[2].x, t.p[2].y, t.p[0].x, t.p[0].y);
		
		
	}
	
}


class Point{
	int x;
	int y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	
}


class Circle{
	//1. 반지름(정수)를 저장할 수 있는 변수 r을 선언해주세요
	int r;
	//2. 중심점을 저장할 수 있는 변수 p를 선언해주세요
	Point p;

	//3. 매개변수가 두개인 생성자를 만들어주세요
	Circle(int r, Point p){
		this.r = r;
		this.p = p;
	}
	
	
	//4. 기본생성자를 만들어주세요
	//	 단. 매개변수가 두개인 생성자를 이용하여 100, 100 반지름 50으로 초기화 해주세요 
	Circle(){
		//Point p = new Point(100, 100);
		//this.r = 50;
		this(50, new Point(100, 100));//new를 바로해서 이렇게 해도 주소를 만들어지니까 변수 활용하지 않고 넣는다 
	}

}


class Triangle{
	//1. 점3개를 저장할 수 있는 변수 p를 선언해주세요
	Point[] p;

	//2. 매개변수가 한개인 생성자를 만들어주세요
	Triangle(Point[] p){
		this.p = p;
	}
	
	//3. 매개변수가 세개인 생성자를 만들어주세요
	
	Triangle(Point a, Point b, Point c){
		//Point[] p = new Point[3];
		
		p = new Point[3];//집만들어놓고 입주시키기
		
		p[0] = a;
		p[1] = b;
		p[2] = c;		
	}
	
}
