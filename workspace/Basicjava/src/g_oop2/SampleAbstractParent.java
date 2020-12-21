package g_oop2;

public abstract class SampleAbstractParent {

	void method(){
		
	}
	
	//추상메서드 : 선언부만 있고 내용이 없음, 부모클래스 역할
	abstract void abstractMethod(); 
	
}

class SampleAbstractChild extends SampleAbstractParent{

	@Override
	void abstractMethod() {
		System.out.println("추상메서드를 상속받아 내용을 만들어줌.");
		
	}
	
}





























