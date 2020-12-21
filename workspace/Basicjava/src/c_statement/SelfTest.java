package c_statement;

import java.util.Scanner;

public class SelfTest {

	public static void main(String[] args) {
		//탄수화물 중독 자가진단 테스트 프로그램을 만들어주세요.
		
		Scanner sc = new Scanner(System.in);
		
		int o = 0;
		int x = 0;
		
		System.out.println("=====탄수화물 중독 자가진단 테스트=====");
		String Q = sc. nextLine();
		
		System.out.print("아침을 배불리 먹은 후 점심시간 전에 배가 고프다  O | X : ");
		String Q1 = sc.nextLine();
		 if (Q1.equals("o")){
			 o++;			
			 }else {
				 x++;
			 }
		System.out.print("밥, 빵, 과자 등 음식을 먹기 시작하면 끝이 없다  O | X : ");
		String Q2 = sc.nextLine();
		 if (Q2.equals("o")){
			 o++;
			 }else {
				 x++;
			 } 
		System.out.print("음식을 금방 먹은 후에도 만족스럽지 못하고 더 먹는다  O | X : ");
		String Q3 = sc.nextLine();
		 if (Q3.equals("o")){
			 o++;
			 }else {
				 x++;
			 }
		System.out.print("정말 배고프지 않더라도 먹을 때가 있다  O | X : ");
		String Q4 = sc.nextLine();
		 if (Q4.equals("o")){
			 o++;
			 }else {
				 x++;
			 }
		System.out.print("저녁을 먹고 간식을 먹지 않으면 잠이 오지 않는다  O | X : ");
		String Q5 = sc.nextLine();
		 if (Q5.equals("o")){
			 o++;
			 }else {
				 x++;
			 }
		System.out.print("스트레스를 받으면 자꾸 먹고 싶어진다  O | X : ");
		String Q6 = sc.nextLine();
		 if (Q6.equals("o")){
			 o++;
			 }else {
				 x++;
			 }
		System.out.print("책상이나 식탁 위에 항상 과자, 초콜릿 등이 놓여있다  O | X : ");
		String Q7 = sc.nextLine();
		 if (Q1.equals("o")){
			 o++;
			 }else {
				 x++;
			 }
		System.out.print("오후 5시가 되면 피곤함과 배고픔을 느끼고 일이 손에 안 잡힌다  O | X : ");
		String Q8 = sc.nextLine();
		 if (Q8.equals("o")){
			 o++;
			 }else {
				 x++;
			 }
		System.out.print("과자, 초콜릿 등 단 음식은 상상만해도 먹고 싶어진다  O | X : ");
		String Q9 = sc.nextLine();
		 if (Q9.equals("o")){
			 o++;
			 }else {
				 x++;
			 }
		System.out.print("다이어트를 위해 식이조절을 하는데 3일도 못간다  O | X : ");
		String Q10 = sc.nextLine();
		 if (Q10.equals("o")){
			 o++;
			 }else {
				 x++;
			 }		
		
	
		if(o <= 3){
			System.out.println("주의! 위험한 수준은 아니지만 관리필요");
		}else if(o <= 6){
			System.out.println("위험! 탄수화물 섭취 줄이기 위한 식습관 개선이 필요함");
		}else{
			System.out.println("중독! 전문의 상담이 필요함");
		}	

	}

	
}

