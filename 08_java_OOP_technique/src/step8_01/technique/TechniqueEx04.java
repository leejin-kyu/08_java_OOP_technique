package step8_01.technique;

/*
 * 
 * # 싱글턴 패턴
 * 
 *  - 객체를 1번만 생성하고 싶을 때 사용하는 기법
 *  
 *  - 싱글턴 패턴을 만드는 방법
 *  
 *    1) private 기본 생성자를 만든다.
 *    2) 내부에서 static으로 자기자신의 인스턴스를 생성한다. (핵심)
 *	  3) instance를 반환할 getter를 만들어준다.	  
 *
 * */

class MySingleTon {
	
	//1) private 기본 생성자를 만든다.
	private MySingleTon() {}
	
	//2) 내부에서 static으로 자기자신의 인스턴스를 생성한다. (핵심)
	private static MySingleTon instance = new MySingleTon();
	
	//3) instance를 반환할 getter를 만들어준다.	  
	public static MySingleTon getInstance() {
		return instance;
	}
	
	// 테스트용 메서드
	void method1() {System.out.println("# 메서드1");}
	void method2() {System.out.println("# 메서드2");}
	void method3() {System.out.println("# 메서드3");}

}

class ClassTest{}

public class TechniqueEx04 {

	public static void main(String[] args) {

		System.out.println(new ClassTest()); // 다른 객체
		System.out.println(new ClassTest());
		System.out.println(new ClassTest());
		System.out.println();
		
		System.out.println(MySingleTon.getInstance()); // 같은 객체
		System.out.println(MySingleTon.getInstance());
		System.out.println(MySingleTon.getInstance());
		System.out.println();
		
		MySingleTon.getInstance().method1(); // 싱글턴 클래스의 메서드 사용법
		MySingleTon.getInstance().method2(); // 싱글턴클래스명.getInstance().메서드명()
		MySingleTon.getInstance().method3(); 
		System.out.println();
		
		// error , 싱글턴 클래스의 사용방식은 일반 클래스 사용방식과 다르다.
		//MySingleTon test = new MySingleTon();
		
		// 응용
		MySingleTon temp = MySingleTon.getInstance();  // 싱글턴 객체의 주소가 temp변수에 대입
		
		System.out.println(MySingleTon.getInstance());
		System.out.println(temp);					   // 싱글턴 객체와 같은 주소
		
		
	}

}
