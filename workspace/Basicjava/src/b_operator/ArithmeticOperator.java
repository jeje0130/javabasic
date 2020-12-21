package b_operator;

public class ArithmeticOperator {

	public static void main(String[] args) {
		/*
		 * 산술연산자
		 * - 사칙연산 : +, -, *, /, %(나머지) // 나머지 : 나눗셈에서 나머지를 구해주는 것
		 * - 복합연산자 : +=, -=, *=, /=, %= // 오른쪽에 있는 값을 왼쪽에 연산해주는 것 
		 * - 증감연산자 : ++, -- // 1만큼 증감 
		 */

		int result = 10 + 20 - 30 * 40 / 50 % 60;
		//곱하기와 나누기가 더하기 빼기보다 우선순위가 높다. 우선순위가 같을땐 왼쪽부터 연산
		System.out.println(result);
		
		
		//나머지 연산
		result = 10 / 3; 
		System.out.println(result); 
		//3.333...이 연산의 결과여야 하지만 타입이 int이기 때문에 정수만 표현된다.
		result = 10 % 3;
		System.out.println(result); // 나머지인 1을 구해줌
		
		//5개의 산술연산자를 사용해 5개의 연산을 수행 후 결과를 출력해주세요.
		int q;
		int w;
		int e;
		int r;
		int t;
		
		q = 1 + 1;
		System.out.println(q);	
		w = 2 - 1;
		System.out.println(w);
		e = 3 * 3;
		System.out.println(e);
		r = 5 / 2;
		System.out.println(r);
		t = 10 % 4;
		System.out.println(t);
		
		//복합연산자
		//변수에 저장되어 있는 값에 연산을 수행할 때 수행할 연산자와 대입연산자를 결합해 사용할 수 있다.
		result = result + 3;
		System.out.println(result);
		
		result += 3;
		System.out.println(result);
		
		result -= 5;
		System.out.println(result);
		
		result *= 2;
		System.out.println(result);
		
		
		//아래의 문장을 복합연산자를 사용한 문장으로 만들어주세요.
		//result = result + 10;
		  result += 10;
		//result = result - 2 * 3;
		  result -= 2 * 3;
		//result = result % 5;
		  result %= 5;
	      
	      
	    //증감연산자
	    //증가연산자(++) : 변수의 값을 1 증가시킨다.
	    //감소연산자(--) : 변수의 값을 1 감소시킨다.
	    int i = 0;
	    
	    ++i; //전위형 : 변수의 값을 읽어오기 전에 1 증가된다.
	    i++; //후위형 : 변수의 값을 읽어온 후에 1 증가된다.
	    --i;
	    i--;
	    
	    i = 0;
	    System.out.println("++i = " + ++i);
	    i = 0;
	    System.out.println("i++ = " + i++);
	    System.out.println(i);
	    
	    //피연산자의 타입이 서로 같아야만 연산이 가능하다.
	    int _int = 10;
	    double _double = 3.14;
	    double result2 = (double)_int + _double; //표현범위가 더 큰 타입으로 자동 형변환된다.
	    System.out.println(result2);
 
		long _long = 100L;
		_long = _int + _long;
		_int = _int + (int)_long; //int타입에 저장하려면 값이 int여야한다.
		
		byte _byte = 5;
		short _short = 10;
		int result3 = _byte + _short; //int보다 작은 타입은 int로 형변환된다. 4바이트보다 작은건 4바이트로 맞춰서 계산
		System.out.println(result3);
		
		char _char = 'a'; //컴터는 문자표현을 숫자로함 (유니코드표) a = 97, b = 98
		char _char2 = 'b';
		_int = _char + _char2; 
		System.out.println(_int);
		
		//오버플로우, 언더플로우
		//표현번위를 벗어나는 값을 표현할 때 발생하는 현상
		byte b = 127; // byte는 -128~127 까지 표현, 가장 큰 값을 넘었을땐 가장 작은 값을 표현(오버플로우) 
		b++;
		System.out.println(b);
		b--;
		System.out.println(b);
		
		//타입을 선택할 때 연산의 범위를 고려해야한다.
		
		
		//다음을 한줄씩 계산해서 최종 결과값을 출력해주세요
		//1. 123456 + 654321
		//2. 1번의 결과값 * 123456
		//3. 2번의 결과값 / 123456
		//4. 3번의 결과값 - 654321
		//5. 4번의 결과값 % 123456
		
		long z = 123456 + 654321L;		
		z *= 123456;
		z /= 123456;
		z -= 654321;
		z %= 123456;
		System.out.println(z);
		
	    //3개의 int형 변수를 선언 및 초기화 후 합계와 평균을 구해주세요.
		
		int x = 5;
		int c = 2;
		int v = 3;
		
		int sum = x + c + v;
		double avg = sum / 3.0;
		System.out.println("합계 : " + sum + " / 평균 : " + avg);
		
	    //반올림
//		avg = Math.round(avg); //무조건 소수점 첫째자리에서 반올림하는 메서드
//		System.out.println(avg);
		avg = Math.round(avg * 100) / 100.0;  //소수점을 표현할 수 없는 메서드라 뒤에 100.0으로 곱한다.
		System.out.println(avg);
		
		
		//랜덤
		int random = (int)(Math.random() * 100) + 1; // Math.random : 0.0~0.999999....(1미만의 수)
		System.out.println(random); // 1~100 사이의 랜덤 숫자가 나옴
		
		
		
		
	}

}
