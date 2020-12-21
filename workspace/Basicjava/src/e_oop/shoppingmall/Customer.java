package e_oop.shoppingmall;

public class Customer {

	//메서드 : 알바가 할 일(보스가 알바에게 시킨 일)
	//파라미터 : 일을 하기 위해 필요한 것(보스가 알바에게 주는 것)
	//리턴타입 : 일을 하고 난 후 돌려주는 것(알바가 보스에게 주는 것)
		
	//쇼핑하기
	//쇼핑하기 위해 필요한 것? 
	//질문 후 고객에게 줄 것? 
	
	String question1(){
		System.out.println("어떤 옷을 찾으세요?");
		return "원피스";
	}
	
	String question2 (){
		System.out.println("사이즈는 어떻게 되세요?");
		return "M사이즈";
	}
	
	void product (String one){
		System.out.println("옷 입어보세요.");
	}
	
	void pay (String money){
		System.out.println("100만원입니다. 안녕히가세요");
	}
	
	
}
