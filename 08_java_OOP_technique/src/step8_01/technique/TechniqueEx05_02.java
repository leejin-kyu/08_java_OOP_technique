package step8_01.technique;

// 생성자를 이용한 멤버 변수 초기화
class Fruit{
	
	String name;
	int price;
	

	// 생성자 단축키 > 좌측 상단 Source > Generate Constructor Using Fields..
	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
		System.out.println(this.name+"("+this.price +")");		

	}



	void printData() {
		System.out.println(this.name+"("+this.price +")");		
	}
	
}


public class TechniqueEx05_02 {

	public static void main(String[] args) {
			
			// 생성자를 이용한 멤버변수 초기화
			Fruit banana = new Fruit("바나나", 2500);
			banana.printData();		
			Fruit apple = new Fruit("사과", 1200);
			apple.printData();

			//new Random();
			//new Scanner(System.in);
			//new Data();
			//new SimpleDateFormat("yyyy-MM-dd");
	}
}
