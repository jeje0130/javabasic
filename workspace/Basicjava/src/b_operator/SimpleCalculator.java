package b_operator;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		//두개의 숫자와 연산자를 입력받아 연산결과를 알려주는 프로그램을 만들어주세요.
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("첫번째 숫자>");
//		int num1 = Integer.parseInt(sc.nextLine());
//		System.out.println("연산자(+,-,*,/,% 를 입력해주세요>");
//		String v = sc. nextLine();
//		System.out.println("두번째 숫자>");
//		int num2 = Integer.parseInt(sc.nextLine());
//		double sum=0;
//		
//		sum = (v.equals("+") ? num1 + num2 : 
//							(v.equals("-") ? num1 - num2 : 
//								(v.equals("*") ? num1 * num2 : 
//									(v.equals("/") ? (double)num1 / num2 : 
//										(v.equals("%") ? num1 % num2 : 0)))));		     
//		System.out.println("연산결과 : " + num1 + v + num2 + "=" + sum); 

		
		System.out.println("첫번째 숫자>");
		int x = Integer.parseInt(sc.nextLine());
		System.out.println("연산자(+,-,*,/,% 를 입력해주세요>");
		String op = sc. nextLine();
		System.out.println("두번째 숫자>");
		int y = Integer.parseInt(sc.nextLine());
		
		int result = op.equals("+")? x + y
				: op.equals("-")? x - y
						: op.equals("*")? x * y
								:op.equals("/")? x / y
										: x % y;
		System.out.println(x + " " + op + " " + y + " = " + result);
		
		
		

	}

}
