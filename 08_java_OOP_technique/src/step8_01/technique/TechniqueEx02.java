package step8_01.technique;

/*
 * 
 * 접근제어자 : public , private  + getter/setter
 * 
 * public: 프로젝트 전체에서 접근 가능
 * private: 클래스 내부에서만 접근 가능
 * 
 * default(package): 패키지 내에서만 접근가능
 * protected 		: 상속관계에서 접근가능 
 * 
 * */

class ModifierTest {
	
	private int x;
	public int y;
	
	// private 변수를 외부에서 접근할 수 있도록 만들어주는 메서드 getter
	public int getX() {	// 변수명 앞에 get을 추가하여 메서드의 이름을 지정한다.
		return this.x;
	
	
	// private 변수를 외부에서 수정할 수 있도록 만들어주는 메서드 setter
 //		this.x=x;
	}
	
}

// VO : Value Object				: 값 객체
// DTO : Data Transfer object		: 데이터 전송 객체
class GetterSetterVO {

	private String productCode;
	private String productName;
	private int productPrice;
	private String managerCode;
	private String managerName;

	// getter & setter 생성 단축키
	// 좌측 상단 Source> Generate Getters and Getters > selectAll > Generate

	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public String getManagerCode() {
		return managerCode;
	}
	public void setManagerCode(String managerCode) {
		this.managerCode = managerCode;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
}

public class TechniqueEx02 {

	public static void main(String[] args) {
		
		ModifierTest obj = new ModifierTest();
		
		//private 변수는 클래스 외부에서 접근 불가능
		//obj.x = 1000;
		
		obj.y = 2000;
		System.out.println(obj.y);
		 
		
		//obj.setX(1000);					// setter을 이용하여 private변수를 수정
		System.out.println(obj.getX()); // getter를 이용하여 private 변수에 접근
		
		System.out.println();
		
		GetterSetterVO gsVo = new GetterSetterVO();
		
		gsVo.setProductCode("0x001");
		gsVo.setProductName("기계식 키보드");
		gsVo.setProductPrice(37000);
		gsVo.setManagerCode("mgr1");
		gsVo.setManagerName("담당자A");
		
		System.out.println(gsVo.getProductCode());
		System.out.println(gsVo.getProductName());
		System.out.println(gsVo.getProductPrice());
		System.out.println(gsVo.getManagerCode());
		System.out.println(gsVo.getManagerName());
	}
}
