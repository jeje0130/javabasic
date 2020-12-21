package c_statement;

import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		/* 
		 * 숫자 야구 게임 만들기
		 * 135
		 * 
		 * 123 : 1S (숫자도 같고, 자릿수도 같을때), 1B(숫자는 같고, 자릿수는 다를때), 1O(아예 다를때)
		 * 136 : 2S 0B 1O
		 * 
		 * 
		 */
				
		
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		
		while(true){		
			c1 = (int)(Math.random()*9) + 1;
			c2 = (int)(Math.random()*9) + 1;
			c3 = (int)(Math.random()*9) + 1;
				if(c1 != c2 && c2 != c3 && c3 != c1){
					break;
				}		
		}
		System.out.println( c1 +" "+ c2 +" "+ c3);		
		
		Scanner s = new Scanner(System.in);
		
		int S = 0;
		int B = 0;
		int O = 0;
		
		while (S != 3){
			
			int num1 = 0;
			int num2 = 0;
			int num3 = 0;
			
			System.out.println("===숫자 야구 게임을 시작합니다===");
			System.out.print("첫번째 숫자 입력(1~9)> ");
			num1 = s.nextInt();
			System.out.print("두번째 숫자 입력(1~9)> ");
			num2 = s.nextInt();
			System.out.print("세번째 숫자 입력(1~9)> ");
			num3 = s.nextInt();
			
			S = 0;
			B = 0;
			O = 0;
			
			if(c1 == num1){
				S += 1;
			}else if (c1 == num2 || c1 == num3){
				B += 1;
			}else{
				O += 1;
			}
			if(c2 == num2){
				S += 1;
			}else if (c2 == num1 || c2 == num3){
				B += 1;
			}else{
				O += 1;
			}
			if(c3 == num3){
				S += 1;
			}else if (c3 == num1 || c3 == num2){
				B += 1;
			}else{
				O += 1;
			}
			System.out.println("S : " + S + "\t" + " B : " + B + "\t"+ " O : " + O);	
					
		}
		System.out.println("정답은 " + c1 +" "+ c2 +" "+ c3 + " 입니다!!");
		
		
		
		
		//정답//
//		int a1 = (int)(Math.random()*9)+1;
//	    int a2;
//	    int a3;
//	    
//	    do{
//	    	a2 = (int)(Math.random()*9)+1;
//	    }while(a1 == a2);
//	    
//	    do{
//	    	a3 = (int)(Math.random()*9)+1;
//	    }while(a1 == a3 || a2 == a3);
//	    
//	    Scanner sc = new Scanner(System.in);
//	    int count = 0;
//	    while(true){
//	    	System.out.println("3자리 숫자>");
//	    	int input = Integer.parseInt(sc.nextLine());
//	    	input
//	    }
		
		
	}

}
