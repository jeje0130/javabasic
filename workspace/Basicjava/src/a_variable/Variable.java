package a_variable; //클래스의 위치

import java.util.Scanner;

public class Variable { //클래스 : 변수와 메서드로 구성

	public static void main(String[] args) { //메서드 - ()가 붙은 것
	    //메서드 : 명령문의 집합
		//main메서드 : 프로그램의 시작과 끝
		
		//주석 : 프로그램 코드로 인식하지 않는 문장(주로 코드를 설명하는데 사용)
		
//		한줄 주석 : Ctrl + Shift + c
		
		/*범위 주석 : Ctrl + Shift + / (해제:\)*/
		
		
		
		//데이터의 형태(데이터 타입)와 이름을 작성하면 변수를 만들 수 있다.
		//데이터타입을 선택할 때는 표현하고자 하는 데이터에 맞는 타입을 선택해주면 된다.
		//변수이름을 정할때는 표현하고자 하는 데이터의 의미와 부합하는 이름을 지어주면 된다.
		
		/*
		 * 기본형 타입
		 * -정수 : byte(1), short(2), *int(4), long(8) -2진수
		 * -실수 : float(4), *double(8)
		 * -문자 : char(2) - 문자 한글자 표현
		 * -논리 : boolean(1)
		 */
		
		int x; //정수를 저장할 수 있는 x라는 이름을 가진 그릇을 만들어라.
		// 변수를 만드는 것을 변수 선언이라고 표현한다.
		
//		double x; // 블럭{}안에서 이름이 중복될 수 없다. 
		double y; 
		
		//=(대입연산자) : 오른쪽의 값을 왼쪽의 변수에 저장
		x = 10; //초기화 : 변수에 처음으로 값을 저장하는 것
		y = 3.14; //변수의 타입에 맞는 값을 저장해야한다.
		
	    int abc = 30; //일반적으로 선언과 초기화를 한번에 한다.
	    long l =  40L; //접미사 L을 붙어야 long타입이 된다.
	    float f = 5.5f; //접미사 f를 붙어야 float타입이 된다.
	    char c = '한'; //따옴표안에 반드시 한글자를 넣어야 한다. (최소한 공백이라도 들어가야함)
	    boolean b = true; //true, false
	    
	    //8가지 기본형 타입을 사용해서 8개의 변수를 선언 및 초기화 해주세요.
	    byte m = 10;
	    short n = 20;
	    int z = 30;
	    long h = 40L;
	    float d = 2.2f;
	    double s = 3.3;
	    char e = '윤';
	    boolean a = true;
	    
	    //변수의 값을 변경하기 위해서는 대입연산자를 사용해 변수에 새로운 값을 대입해주면 된다.
	    x = 20; //기존에 저장되어 있는 10이라는 값은 사라지고 20이라는 값이 저장된다.
//	    int x = 20; //변수를 만들때만 타입을 붙인다. 변수를 사용하기 위해서는 이름만 있으면 된다.
	    y = 5.5; 
	    
	    //위에서 만든 8개 변수에 새로운 값을 저장해주세요.
	    m = 15;
	    n = 25;
	    z = 35;
	    h = 50L;
	    d = 4.4f;
	    s = 6.6;
	    e = '지';
	    a = false;
	    
	    
	    //콘솔창에 출력
	    System.out.println(100);
	    //실행 단축키 : ctrl + F11
	    System.out.println(x);
	    
	    //위에서 만든 8개의 변수의 값을 출력해주세요.
	    System.out.println(m);
	    System.out.println(n);
	    System.out.println(z);
	    System.out.println(h);
	    System.out.println(d);
	    System.out.println(s);
	    System.out.println(e);
	    System.out.println(a);
	    
	    //문자열
	    String str = "문자 여러개.."; //클래스는 참조형 타입 데이터이다.
	    System.out.println(str);
	    //문자열과 다른 타입의 데이터가 결합되면 문자열의 결과를 얻는다.
	    System.out.println(str + 50);
	    System.out.println(10 + 20 + str);
	    System.out.println(str + 10 + 20);
	    
	    //형변환
	    //다른 타입의 값을 저장하기 위해서는 값의 타입을 변경해 주어야 하는데 이를 형변환이라 한다.
	    int small = 10;
	    long big = 10L;
	    
	    small = (int)big; //값 앞에 괄호치고 변환할 타입을 써준다.
	    big = small; //표현범위가 작은쪽에서 큰쪽으로의 형변환은 생략이 가능하다.
	    
	    /*
	     * 명명규칙 -> 외우기
	     * - 영문자 대소문자, 한글, 숫자, 특수문자('_','$')를 사용할 수 있다.
	     * - 숫자로 시작할 수 없다.
	     * - 예약어는 사용할 수 없다.
	     * - [낙타식 표기법을 사용한다. (mySampleVariable)]
	     * - [클래스명의 첫글자는 대문자로 한다. (MySampleClass)]
	     */
	    
	    /*
	     * 상수
	     * -값을 변경 할 수 없는 그릇
	     * -리터럴에 의미를 부여하기 위해 사용한다.
	     * -이름 대문자로 표현
	     * -앞에 final을 붙인다. 
	     */
	    final int MAX_NUMBER = 10;
//	    MAX_NUMBER = 20; //컴파일 에러 발생(값 변경 못함)
	    
	    //출력
	    System.out.print("줄바꿈을 하지 않는다.");
	    System.out.print("줄바꿈을 하지 않는다.\n"); //괄호안에 \n을 넣으면 줄바꿈 기능
	    System.out.println("줄바꿈을 \t 한다."); // 괄호안에 \t를 넣으면 tab 기능
	    System.out.printf("문자열 : %s, 숫자 : %d", "Hello", 10); //출력 포맷을 지정한다. %s : 문자열, %d : 숫자 불러옴
	    System.out.println();
	    
	    //입력
	    Scanner sc = new Scanner(System.in); //입력받기 위한 클래스
	    //import 단축키 : ctrl + shift + o
	    
//	    System.out.println("아무거나 입력해주세요>");
//	    String str2 = sc.nextLine(); //위에서 부터 실행되다가 여기서 멈추고 사용자가 문자열을 입력하길 기다림. 
//	    System.out.println(str2);
	    
//	    System.out.print("int 입력>"); //nextInt는 숫자를 입력받는다. 버그가 있어서 사용하지 않는게 좋다.
//	    int nextInt = sc.nextInt();
//	    System.out.println(nextInt); //nextInt 입력받고 next가 나오면 통과시키는 버그
//	    System.out.print("문자열입력>");
//	    String nextLine = sc.nextLine();
//	    System.out.println(nextLine);
//	    System.out.println("입력 끝!!"); 
	    
//	    System.out.print("int 입력>");
//	    int number = Integer.parseInt(sc.nextLine()); //문자열을 입력받은뒤 int타입으로 바꿔줌
//	    System.out.println(number);
	    
	    //자신의 이름을 저장할 변수를 선언해주세요.
	    String name;
	    
	    //위에서 선언한 변수를 초기화하기 위해 이름을 입력받아주세요.
	    System.out.println("이름을 입력해주세요>");
	    name = sc. nextLine();
	    
	    //자신의 나이를 저장할 변수를 선언해주세요.
	    int age;
	    
	    //위에서 선언한 변수를 초기화 하기 위해 나이를 입력받아주세요.
	    System.out.println("나이를 입력해주세요>");
	    age = Integer.parseInt(sc.nextLine());
//	    Double.parseDouble(sc.nextLine()); // 더블타입의 실수 입력받기
	    
	    System.out.println("이름 :" + name + " / 나이 : " + age);
	    
	    
	    //다음과 같은 프로그램을 작성해주세요.
	    /*
	     * ==========회원가입==========
	     * 아이디>admin
	     * 비밀번호(4자리숫자)>1234
	     * 이름>홍길동
	     * 나이>30
	     * 키>185.5
	     * ==========================
	     * 아이디 : admin
	     * 비밀번호 : 1234
	     * 이름 : 홍길동
	     * 나이 : 30세
	     * 키 : 185.5cm
	     * ==========================
	     */
	    
	     String id;
	     int pw;
	     String name1;
	     int age1;
	     double height;
	     
	     System.out.println("==========회원가입==========");
	     System.out.print("아이디>");
		 id = sc. nextLine();
		 System.out.print("비밀번호(4자리숫자)>");
		 pw = Integer.parseInt(sc.nextLine());
		 System.out.print("이름>");
		 name1 = sc. nextLine();
		 System.out.print("나이>");
		 age1 = Integer.parseInt(sc.nextLine());
		 System.out.print("키>");
		 height = Double.parseDouble(sc.nextLine());
		 
		 System.out.println("==========================");
		 System.out.println("아이디 :" + id) ;
		 System.out.println("비밀번호 :" + pw) ;
		 System.out.println("이름 :" + name1) ;
		 System.out.println("나이 :" + age1) ;
		 System.out.println("키 :" + height) ;
		 System.out.println("==========================");
		 
		 
	     
	}

}





