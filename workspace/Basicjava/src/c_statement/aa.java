package c_statement;

public class aa {

	public static void main(String[] args) {
		int a =12; 
		
		if (a ==1){
			System.out.println("zz");			
		}
		if(a==0){
			System.out.println("노노");
		}
		
		if(a==1){
			System.out.println("1이다");
		}else if (a==2){
			System.out.println("2다");
		}else{
			System.out.println("이외");
		}
		if(a<10){
			System.out.println("10보다작다");
		}else if(a>10){
			System.out.println("10보다 크다");
		}
		
		int score = 50;
		
		if ( 60 <= score){
			System.out.println("합격");			
		}else{
			System.out.println("불합");
		}
		
		//성적 등급 프로그램
		score = 77;
		String grade = null;
		
		if( 90 <= score){
			grade = "A";
		}else if ( 80 <= score && score < 90){
			grade = "B";
		}else if ( 70 <= score && score < 80){
			grade = "C";
		}else{
			grade = "F";
		}
		System.out.println(score + "점의 등급은 " + grade + "입니다.");
		
		score = 92;
		grade = null;
		
		if (90 <= score){
			grade = "A";
					if(97 < score){
						grade += "+";
					}else if (score <= 93){
						grade += "-";
					}
					System.out.println(score + "점의 등급은 " + grade + "입니다.");
		}
		a = 1;
		
		switch(a){
		case 1 : 
		}
	}

}
