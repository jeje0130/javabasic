package d_array;

import java.util.Scanner;

public class SetComma {

	public static void main(String[] args) {
		//숫자를 입력받아 입력받은 숫자에 3자리마다 콤마(,)를 붙여 출력해주세요.
		//10,000,000,000
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요>");
		String number = s.nextLine();
		String comma = "";

		int count = 0;
		for(int i = number.length()-1; i >= 0; i--){
			comma = number.charAt(i)+comma;
			count++;
			if(count % 3 == 0 && count != number.length()){
				comma = ","+comma;
			}
		}
		System.out.println(comma);
		

		
		

	}

}
