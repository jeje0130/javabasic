package b_operator;

import java.util.Scanner;

public class Etc {

	public static void main(String[] args) {
		/*
		 * 비트연산자 
		 * - |, &, ^, ~, <<, >>
		 * - 비트 단위로 연산한다.
		 * - 특수한 분야에서만 사용함
		 * 
		 * 기타연산자
		 * - .(참조연산자) : 특정 범위내에 속해 있는 멤버를 지칭할 때 사용한다.
		 * - (type) : 형변환
		 * - ?:(삼항연산자) : 조건식 ? 조건식이 참일 경우 수행할 문장 : 조건식이 거짓일 경우 수행할 문장 (중요)
		 */
		//1byte : 01010101
		System.out.println(10 | 15); // | : 둘다 0인 경우 0 그외 1
		//10 : 00001010
		//15 : 00001111
		//   : 00001111 = 15
		
		int x = 10;
		int y = 20;
		int result = x < y ? x : y; //int result = x; 
		System.out.println(result);
		
		//주민등록번호 뒷자리의 첫번째 숫자가 1이면 남자 2면 여자
		int regNo = 3;
		String gender = regNo == 1 ? "남자" : "여자"; //1 이외는 다 여자로 출력
		System.out.println("당신의 성별은 " + gender + "입니다.");
		
		gender = regNo == 1 ? "남자" : (regNo == 2 ? "여자" : "확인불가"); // 1, 2 이외는 확인불가로 출력
		System.out.println("당신의 성별은 " + gender + "입니다.");
		
		//2개의 숫자를 입력받고, 둘 중 더 큰 숫자를 출력해주세요.
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("첫번째 숫자>");
//		int num1 = Integer.parseInt(sc.nextLine());
//		System.out.println("두번째 숫자>");
//		int num2 = Integer.parseInt(sc.nextLine());
//		
//		int B = num1 > num2 ? num1 : num2;
//		System.out.println(B);
		
		//숫자를 입력받고, 그 숫자가 1이나 3이면 남자를 2나 4면 여자를 출력해주세요.
		//그외의 숫자를 입력하면 확인불가를 출력해주세요.
		
		System.out.println("숫자입력>");
		int num3 = Integer.parseInt(sc.nextLine());
		gender = num3 == 1 || num3 == 3 ? "남자" : 
			(num3 == 2 || num3 == 4 ? "여자" : "확인불가");
		System.out.println(gender);
		
		
		
		
		
		
		
		
		
		
	}

}
