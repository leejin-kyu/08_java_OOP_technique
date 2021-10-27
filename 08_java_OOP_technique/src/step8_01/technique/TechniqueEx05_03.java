package step8_01.technique;

/*
 * 
 * # 생성자 오버로딩
 * 
 *  - 생성자도 메서드이기 때문에 메서드 오버로딩 기법이 적용 가능하다.
 *  - 생성자 오버로딩을 구현하기 위해서는 메서드와 마찬가지로
 *    파라메타의 개수나 타입을 다르게 정의 하면 된다.
 * 
 * */

class Fruit2 {
	
	String name;
	int price;
	
	// 생성자 오버로딩
	Fruit2(){
		this.name = "없음";
		this.price= -1;
	}

	// 생성자 오버로딩
	Fruit2(String name){
		this.name=name;
		this.price=-1;
	}

	// 생성자 오버로딩
	Fruit2(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	void printData() {
		System.out.println("name: " + this.name);
		System.out.println("price : "+ this.price);
		System.out.println();
	}

}

public class TechniqueEx05_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Fruit2().printData();
		
		new Fruit2("사과").printData();
		
		new Fruit2("포도",50000).printData();
		
	}
}
