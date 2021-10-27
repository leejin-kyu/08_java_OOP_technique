package step8_01.technique;

/*

	# 메서드 오버라이딩 ( Method Overriding )

	- 부모클래스로부터 상속 받은 메서드를 재정의(overriding)하여 사용한다.
	- 메서드 오버로딩과 혼용되기 쉽다.

*/

class Warrior2 extends Beginner{
	
	// 메서드 오버라이딩 ( 메서드 재정의 )
	
	void levelUp() {
		this.level ++;
		this.power +=1000;
		this.dex +=200;
		this.life += 2000;
		this.mana +=380;
	}
}

class Wizard2 extends Beginner{
	
	// 메서드 오버라이딩 ( 메서드 재정의 )
	// 부모클래스의 메서드와 이름이 같고 구현되는 기능이 다르다.
	void levelUp() {
		this.level ++;
		this.power +=5;
		this.dex +=100;
		this.life +=100;
		this.mana +=3000;
	}
	
	void fireBall() { //Warrior2 클래스만의 메서드 추가
		System.out.println("\n wizard2 fireBall1! \n");
		
	}
	
	void dash() { //Warrior2 클래스만의 메서드 추가
		System.out.println("\n warrior2 dash! \n");
	}
	
}


public class TechniqueEx07 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Warrior2 war2 = new Warrior2();
		war2.showStatus();
		war2.levelUp();
		war2.showStatus();
		//war2.fireBall();

		war2.dash();
		//war2.fireBall();
		
		System.out.println("\n================\n");

		Wizard2 wiz2 = new Wizard2();
		wiz2.showStatus();
		wiz2.levelUp();
		wiz2.showStatus();
		wiz2.dash();

	}
	
}