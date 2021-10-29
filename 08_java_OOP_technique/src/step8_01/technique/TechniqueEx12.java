package step8_01.technique;

import java.util.HashMap;

/*

# 클래스의 형변환 (업다운 캐스팅)

- 부모클래스는 객체를 생성 할때 부모클래스에 있는 자원만 생성된다.
  반면 자녀클래스는 객체를 생성 할때 부모와 자녀의 자원이 둘다 생성된다. 결국
  자녀클래스는 부모클래스의 타입으로 객체를 생성 할 수 있고,
  부모클래스는 자녀클래스의 타입으로 객체를 생성 할 수 없다.
*/	


// 부모 클래스
class Shape {
	void draw() {} // 자녀클래스가 상속받아서 사용할 메서드를 정의
}

class Line extends Shape{
	void draw() { //부모 메서드를 재정의
		System.out.println("선을 그린다.");		
	}
}
class Circle extends Shape{
	void draw() { //부모 메서드를 재정의
		System.out.println("원을 그린다.");		
	}
}

class Rect extends Shape{
	void draw() { //부모 메서드를 재정의
		System.out.println("사각형을 그린다.");		
	}
}

public class TechniqueEx12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape[] shape = new Shape[3];
		
		shape[0] = new Line();
		shape[1] = new Circle();
		shape[2] = new Rect();
		
		shape[0].draw();
		shape[1].draw();
		shape[2].draw();
		
		// 참고 자료
		HashMap<String, Object> map = new HashMap<String, Object>(); // Object는 str, int, 불리언, 객체 등를 모두를 포함함...
		
		map.put("data1", 123); // 정수 데이터
		map.put("data2", "문자열데이터"); // 문자열 데이터
		map.put("data3",true); // 불리언 데이터
		map.put("data4", new Student()); // Student객체
		map.put("data5", new ArrayList<integer>()); // ArrayList
		
	}

}
