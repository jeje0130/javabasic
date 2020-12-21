package c_statement;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		/*
		 * 조건문
		 * -if문
		 * -switch문
		 * 
		 * if문
		 * -if(조건식){ } : 조건식의 결과가 true이면 블럭안의 문장을 수행한다.
		 * -else if(조건식) { } : 다수의 조건이 필요할때 if뒤에 추가한다.
		 * -else{ } : 결과가 true인 조건식이 하나도 없는 경우를 위해 추가한다. 항상 마지막에 위치한다.
		 */

		int a = 1;
		
		if(a == 1){
			System.out.println("조건식의 연산결과가 true이면 수행된다.");
		}
		
		if(a == 0){
			System.out.println("조건식의 연산결과가 false이면 수행되지 않는다");
		}
		
		if(a == 1){                                    // 1개의 if문 - 한묶음
			System.out.println("a가 1인 경우에 하고싶은 것");
		}else if(a == 2){
			System.out.println("a가 2인 경우에 하고싶은 것");
		}else if(a == 3){
			System.out.println("a가 3인 경우에 하고싶은 것");
		}else{
			System.out.println("이외의 경우에 하고싶은 것");
		}
		
		if(a < 10){
			System.out.println("a가 10보다 작다.");
		}if(a < 20){                                  // 2개의 if문 - 서로 다른 묶음 (한묶음으로 쓰려면 else if 사용) 
			System.out.println("a가 20보다 작다.");
		}
		
		//시험점수가 60점 이상이면 합격 그렇지 않으면 불합격
		int score = 50;
		
		if (60 <= score){
			System.out.println("합격");
		}else {
			System.out.println("불합격");
			
		}
		
		//성적에 등급을 부여하는 프로그램을 만들어보자.
		score = 50;
		String grade = null;
		
		if (90 <= score){
			grade = "A";
		}else if (80 <= score && score < 90){
			grade = "B";
		}else if (70 <= score && score < 80){
			grade = "c";
		}else if (60 <= score && score < 70){
			grade = "D";
		}else {
			grade = "F";;
		}
		System.out.println(score + "점에 해당하는 등급은 " + grade + "입니다.");
		
		score = 98;
		grade = null;
		
		if (90 <= score){
			grade = "A";
				if(97 < score){
					grade += "+";             // grade = grade + "+"
				}else if (score <= 93){
					grade += "-";
				}
		}else if(80 <= score){
			grade = "B";
				if(87 < score){
					grade += "+";
				}else if (score <= 83){
					grade += "-";
				}
		}else if(70 <= score){
			grade = "c";
				if(77 < score){
					grade += "+";
				}else if (score <= 73){
					grade += "-";
				}
		}else if(60 <= score){
			grade = "D";
				if(67 < score){
				grade += "+";
				}else if (score <= 63){
				grade += "-";
				}
		}else {
			grade = "F";
		}
		System.out.println(score + "점에 해당하는 등급은 " + grade + "입니다.");
			
		/*
		 * switch문
		 * -switch(int/String){case 1: break;}
		 * -조건식의 결과는 정수와 문자열만(JDK1.7부터 문자열 허용) 허용한다.
		 * -조건식과 일치하는 case문 이후의 문장을 수행한다.
		 */
		
		a = 1;
		
		switch(a){
			case 1 :
				System.out.println("a가 1인 경우에 하고싶은 것");
				break;
			case 2 :
				System.out.println("a가 2인 경우에 하고싶은 것");
				break;
			case 3 :
				System.out.println("a가 3인 경우에 하고싶은 것");
				break;
			default:                                     // if문의 else와 같은 역할
				System.out.println("이외의 경우에 하고싶은 것");
			
		}
		
		String b = "a";
		
		switch(b){
			case "a" :
				System.out.println("b가 \"a\"인 경우에 하고싶은 것"); // \ : ""의 기능을 바꿔주려고 사용
				break;
			case "b" :
				System.out.println("b가 \"b\"인 경우에 하고싶은 것");
				break;
			default:
				System.out.println("이외의 경우에 하고싶은 것");
				break;			
		}
		
		//주어진 월에 해당하는 계절을 출력해봅시다.
		int month = 1;
		String season = null;
		
		switch(month){
			case 3: case 4: case 5:
				season = "봄";
				break;
			case 6: case 7: case 8:
				season = "여름";
				break;
			case 9: case 10: case 11:
				season = "가을";
				break;
			case 12: case 1: case 2:
				season = "겨울";
				break;		
		}
		System.out.println(month + "월은 " + season + "입니다.");
		
		score = 100;
		grade = null;
		
		switch (score / 10){
			case 10 : grade = "A"; break;
		    case 9 : grade = "A"; break;
			case 8 : grade = "b"; break;
			case 7 : grade = "c"; break;
			case 6 : grade = "d"; break;
			default: grade = "F"; break;
		}
		System.out.println(score + "점에 대한 등급은 " + grade + "입니다.");
		
		//숫자를 입력받아 그 숫자가 0인지 0이 아닌지 출력해주세요.
		
		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("숫자를 입력해주세요>");
//		int num = Integer.parseInt(sc.nextLine());
//		
//	    if (num == 0){
//	    	System.out.println("0입니다.");
//	    }else{
//	    	System.out.println("0이 아닙니다.");
//	    }
	    
	    //숫자를 입력받아 그 숫자가 홀수인지 짝수인지 출력해주세요.
	    
//	    System.out.print("숫자를 입력해주세요>");
//		int num2 = Integer.parseInt(sc.nextLine());
//		
//		if (num2 % 2 == 0){
//			System.out.println("짝수입니다.");
//		}else{
//			System.out.println("홀수입니다");
//		}
		
		//점수 3개를 입력받아 총점, 평균, 등급을 출력해주세요.
		
//		System.out.print("점수1>");
//		int n3 = Integer.parseInt(sc.nextLine());
//		System.out.print("점수2>");
//		int n4 = Integer.parseInt(sc.nextLine());
//		System.out.print("점수3>");
//		int n5 = Integer.parseInt(sc.nextLine());
//		
//		int sum = n3 + n4 + n5;
//		System.out.println("점수의 총점은 " + sum + "점 입니다.");
//		
//		double avg = Math.round(sum / 3.0 * 10) / 10.0;
////		avg = Math.round(avg * 100) / 100.0;
//		System.out.println("점수의 평균은 " + avg + "점 입니다.");
//		
//		String v = null;
//		
//		switch (sum / 10){
//		case 10 : v = "A"; break;
//	    case 9 : v = "A"; break;
//		case 8 : v = "B"; break;
//		case 7 : v = "C"; break;
//		case 6 : v = "D"; break;
//		default: v = "F"; break;		
//	}
//		System.out.println("점수의 등급은 " + v + " 등급입니다.");
		
		
		//1 ~ 100 사이의 랜덤한 숫자를 3개 발생시키고 오름차순으로 출력해주세요.
		
		int r1 = (int)(Math.random() * 100) + 1;
		int r2 = (int)(Math.random() * 100) + 1;
		int r3 = (int)(Math.random() * 100) + 1;
		
	
//		if(r1 > r2){
//			if (r2 > r3){
//			System.out.println(r1+" "+r2+" "+r3);
//		}else{
//			System.out.println(r1+" "+r3+" "+r2);
//		}	
//		}else if(r2 > r1){
//			if (r1 > r3){
//			System.out.println(r2+" "+r1+" "+r3);
//		}else{
//			System.out.println(r1+" "+r3+" "+r2);
//			

		if (r1 > r2){
			int xx = r2;
			r2 = r1;
			r1 = xx;
		}if (r1 > r3){
			int xx = r3;
			r3 = r1;
			r1 = xx;
		}if (r2 > r3){
			int xx = r3;
			r3 = r2;
			r2 = xx;
		}System.out.println(r1 + " < " + r2 + " < " + r3);
			
		   
		
	}
}
	












