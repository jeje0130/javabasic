package d_array;

import java.util.Arrays;

public class Stringclass {

	public static void main(String[] args) {
		/*
		 * String
		 * - 여러개의 문자를 사용하기 쉽게 만들어 놓은 클래스
		 * 
		 * String의 주요 메서드
		 * -equals() : 문자열의 내용이 같은지 반환한다.
		 * -length() : 문자열의 길이를 반환한다.
		 * -charAt() : 특정 인덱스에 위치한 문자를 반환한다. //괄호안에 인덱스번호를 넣어주면 해당 인덱스 문자 반환
		 * -substring() : 문자열의 특정 부분을 잘라서 반환한다.
		 * -indexOf() : 문자열 내의 특정 문자의 인덱스를 반환한다.
		 * -contains() : 문자열이 특정 문자열을 포함하고 있는지 반환한다.
		 * -split() : 문자열을 특정 문자를 기준으로 나누어 배열형태로 반환한다. // , 같은 특정 문자 기준으로 쪼개서 배열로 돌려줌
		 * -trim() : 문자열 앞뒤의 공백을 제거해 반환한다.
		 * -valueOf() : 다른 타입의 데이터를 문자열로 변환해 반환한다.
		 */

		// 클래스 = 변수 + 메서드(코드들이 모여 있는 것)
		
		
		
		//equals() : 문자열의 내용이 같은지 반환한다.
		boolean equals = "문자열".equals("문자열");  // == 은 주소를 비교해줌
		System.out.println(equals);
		
		String str1 = "문자열";
		String str2 = null;
		System.out.println(str1.equals(str2)); // str1. : ( . 은 참조형) str1안에서 equals()를 찾는 것
//		System.out.println(str2.equals(str1)); 
		// null이 있을 수 있는 변수는 앞에 두지않는다.
		
		
		
		//length() : 문자열의 길이를 반환한다.
		//charAt() : 특정 인덱스에 위치한 문자를 반환한다. //괄호안에 인덱스번호를 넣어주면 해당 인덱스 문자 반환
		String str = "12345";
		int length = str.length();
		for(int i = 0; i < length; i++){
			char charAt = str.charAt(i);    
			System.out.println(charAt);
		}
		
		//Q.문자열 뒤집기
		String rev = ""; //12345 -> 54321
		for(int i = str.length()-1; 0 <= i; i--){
			rev += str.charAt(i);
		}
		System.out.println(rev);
		
		
		//substring() : 문자열의 특정 부분을 잘라서 반환한다.
		str = "0123456789";
		String sub1 = str.substring(3); //3번 인덱스부터 잘라서 반환한다.
		System.out.println(sub1);
		String sub2 = str.substring(5,8); //5번 인덱스부터 8번 인덱스전까지 잘라서 반환한다.
		System.out.println(sub2);
		
		
		//indexOf() : 문자열 내의 특정 문자의 인덱스를 반환한다.
		str = "수박 오렌지 귤 블루베리";
		int index = str.indexOf("오렌지"); //오렌지의 시작 인덱스를 반환한다. (0,1-수박,2-공백,3-오렌지..)
		System.out.println(index);
		
		//Q.substring과 indexOf를 조합해서 문자열 자르기
		String[] menu = {
				"수박 20000원",
				"오렌지 100000원",
				"귤 500원",
				"블루베리 3000원"
		};
		
		for(int i = 0; i < menu.length; i++){
			String name = menu[i].substring(0,menu[i].indexOf(" "));
			System.out.println(name);

		//Q.가격만 잘라서 int타입 변수에 저장해주세요   //Integer.parseInt : 문자를 숫자로 형변환
			int price = Integer.parseInt(menu[i].substring(menu[i].indexOf(" ")+1, menu[i].indexOf("원")));
				System.out.println(price);		
		}
		
		
		
		//contains() : 문자열이 특정 문자열을 포함하고 있는지 반환한다.
		str = "abcd";
		boolean contains = str.contains("a");
		System.out.println(contains);
		
		//Q.오렌지가 메뉴의 몇번 인덱스에 있는지 찾기
		for(int i = 0; i < menu.length; i++){
			if(menu[i].contains("오렌지")){
				System.out.println("오렌지는 " + i + "번 인덱스에 있습니다.");
			}
		}
		
		
		
		//split() : 문자열을 특정 문자를 기준으로 나누어 배열형태로 반환한다. // , 같은 특정 문자 기준으로 쪼개서 배열로 돌려줌
		str = "a/b/c";
		String[] split = str.split("/");  
		System.out.println(Arrays.toString(split));
		
		//Q.메뉴명과 가격나누기
		for(int i = 0; i < menu.length; i++){
			split = menu[i].split(" ");
			System.out.println("메뉴명 : " + split[0] + " / 가격 : " + split[1]);
		}
		
		
		
		//trim() : 문자열 앞뒤의 공백을 제거해 반환한다.중간공백은 안 없어짐
		str = " 문 자 열 ";
		String trim = str.trim(); 
		System.out.println("[" + str + "] -> [" + trim + "]");
		
		String id = " myId";
		String password = "myPassword ";
		System.out.println(id);
		System.out.println(password);
		System.out.println(id.trim());
		System.out.println(password.trim());
		
		
		
		//valueOf() : 다른 타입의 데이터를 문자열로 변환해 반환한다.
		int number = 10;
		str = number + ""; // 숫자를 문자로 바꾸는 법 1) 숫자에 빈 문자열을 더한다
		str = str.valueOf(number); // 숫자를 문자로 바꾸는 법 2) valueOf() 괄호안에 숫자를 넣어준다
		System.out.println(str);
		
		
	}

}























