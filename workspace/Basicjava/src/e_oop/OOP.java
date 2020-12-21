package e_oop;

public class OOP {

	public static void main(String[] args) {
		/*
		 * 객체지향 프로그래밍(Object Oriented Programming)
		 * - 프로그래밍을 단순히 코드의 연속으로 보는 것이 아니라 객체간의 상호작용으로 보는 것
		 * - 코드의 재사용성이 높고 유지보수가 용이하다.
		 */

		
		SampleClass sc = new SampleClass();
		
		System.out.println(sc.field);
		
		sc.method1();
		
		String returnValue = sc.method2(123);
		System.out.println(returnValue);

		sc.flowTest1();
		
		
		//다음을 한줄씩 계산해서 최종 결과값을 출력해주세요.
		Calculator cal = new Calculator();
		
		//1. 123456 + 654321
		double num = cal.add(123456, 654321);
		num = cal.multiply(num, 123456);
		num = cal.divide(num, 123456);
		num = cal.subtract(num, 654321);
		num = cal.mod(num, 123456);
		
		System.out.println(num);
		
		
		/*
		 * 어떤 대상을 잡아 클래스를 만들어주세요.
		 * 메서드의 내용은 구체적이지 않아도 괜찮습니다.
		 * 파라미터와 리턴타입 위주로 만들어주세요.
		 * 클레스에 메서드를 만들어보면서 파라미터와 리턴타입을 생각해보는 것이 중요합니다.
		 * 만들어진 클래스를 main메서드에서 사용해주세요.
		 */
	}
	
	

}





























