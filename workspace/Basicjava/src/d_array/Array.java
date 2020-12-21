package d_array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		//sysout + Ctrl + Spacebar : System.out.println()
		//라인 삭제 : ctrl + D
		//라인 복사 : Ctrl + Alt + 방향키(위/아래)
		//라인 이동 : Alt + 방향키 (위/아래)
		
		/*
		 * 배열
		 * - 여러개의 값을 하나의 변수에 저장해서 사용하는 것이다.
		 * - 참조형 타입이다.
		 * - 인덱스로 값을 구분한다.
		 * - 길이를 변경 할 수 없다.
		 */
		
		int[] array; //배열의 주소를 저장할 공간이 만들어진다.
		array = new int[5]; 
		//배열이 생성되고 그 주소가 저장된다. [5] : 배열의 길이 - int 5개 저장
		//배열 초기화시 기본값이 저장된다. 
		/*
		 * 기본값
		 * 정수  : 0
		 * 실수 : 0.0
		 * 문자 : ' '(0)
		 * 논리 : false
		 * 참조형 : null
		 */
		
		array = new int[]{1, 2, 3, 4, 5}; //뒤에 중괄호를 열고 값을 넣어주면 값의 갯수가 배열의 길이가 된다.
		
//		array = {1, 2, 3, 4, 5};
		//이 방법은 선언과 초기화를 동시에 해야한다.(아래처럼)
		int[] array2 = {1, 2, 3, 4, 5};
		
		System.out.println(array[0]); //array[] : 배열을 사용할 때 붙이는 것 - 인덱스, 인덱스는 0부터 시작
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);		
		
		array [0] = 10;
		array [1] = 20;
		array [2] = 30;
		array [3] = 40;
		array [4] = 50;
		//for문과 함께 주로 사용한다.
		
		int sum = 0;
		for(int i = 0; i < array.length; i++){ //array.length : 배열의 길이를 알려주는 변수 
			sum += array[i];
		}
		System.out.println("합계 : " + sum);
		
		//10개의 정수를 저장할 수 있는 배열을 선언 및 초기화 해주세요.
		
		int [] array3 = new int [10];
		
		//배열의 모든 인덱스에 1~100사이의 랜덤한 값을 저장해주세요.
		
//		array3 [0] = (int)(Math.random()*100)+1;
//		array3 [1] = (int)(Math.random()*100)+1;
//		array3 [2] = (int)(Math.random()*100)+1;
//		array3 [3] = (int)(Math.random()*100)+1;
//		array3 [4] = (int)(Math.random()*100)+1;
//		array3 [5] = (int)(Math.random()*100)+1;
//		array3 [6] = (int)(Math.random()*100)+1;
//		array3 [7] = (int)(Math.random()*100)+1;
//		array3 [8] = (int)(Math.random()*100)+1;
//		array3 [9] = (int)(Math.random()*100)+1;
		
		
		for(int i = 0; i < array3.length; i++){
			array3[i] = (int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(array3)); // Arrays.toString : 배열 내용 출력
		
		//배열에 저장된 모든 값의 합계와 평균을 구해주세요.
		
		sum = 0;
		double avg = 0;
		
		for(int i = 0; i < array3.length; i++){
			sum += array3[i];
		}
		avg = (double)sum / array3.length;
		System.out.println("합계 : " + sum + " 평균 : " + avg);
		
		//배열에 저장된 값들 중 최소값과 최대값을 출력해주세요.
		
		//최소값과 최대값을 저장할 변수를 만들고 0번 인덱스의 값을 저장한다.
		int min = array3[0];
		int max = array3[0];
		
		//배열의 모든 값을 비교하기위해 0번 인덱스부터 마지막 인덱스까지 반복한다.
		for(int i = 0; i < array3.length; i++){
			//최소값과 배열의 모든 인덱스값을 비교해 더 작은 값을 만나면 최소값으로 저장한다.
			if(min > array3[i]){
				min = array3[i];
			}
			//최대값과 배열의 모든 인덱스값을 비교해 더 큰 값을 만나면 최대값으로 저장한다.
			if(max < array3[i]);{
				max = array3[i];		
			}
		}
		System.out.println("min : " + min + " / max : " + max );
		
		
		int [] shuffle = new int [10];
		for(int i = 0; i < shuffle.length; i++){
			shuffle[i] = i + 1;
		}
		System.out.println(Arrays.toString(shuffle));
		
		//배열의 값을 섞어주세요.
		
		for(int i =0; i < 100; i++){
			//0~9사이의 랜덤한 인덱스를 발생시킨다.
			int index = (int)(Math.random() * shuffle.length); 
		
			//0번 인덱스의 값과 랜덤한 인덱스의 값을 바꾼다.
			int temp = shuffle[0];
			shuffle[0] = shuffle[index];
			shuffle[index] = temp;
		}
		System.out.println(Arrays.toString(shuffle));
		
		
		//1~10 사이의 랜덤값을 500번 생성하고, 각 숫자가 생성된 횟수를 출력해주세요.
		
		int [] count = new int [10];

		for(int i = 0; i < 500; i++){
			int num = (int)(Math.random()*10)+1;
		
//			if (num == 1) count[0]++; //규칙
//			if (num == 2) count[1]++;
//			if (num == 3) count[2]++;
			
			count[num - 1]++;
		}
		System.out.println(Arrays.toString(count));

		
		//과제 : 위 문제의 최소값(1), 최대값(10), 발생횟수(500)를 입력받아 각 숫자가 생성된 횟수를 출력해주세요.
		
		Scanner s = new Scanner (System.in);
		
//		System.out.println("최소값을 입력해주세요>");
//		int min2 = Integer.parseInt(s.nextLine());
//		
//		System.out.println("최대값을 입력해주세요>");
//		int max2 = Integer.parseInt(s.nextLine());
//		
//		System.out.println("발생횟수를 입력해주세요>");
//		int count1 = Integer.parseInt(s.nextLine());
//		
//		
//		int x []  = new int [max2];
//
//		for(int i = 0; i < count1; i++){
//			int num = (int)(Math.random()*max2)+1;
//			
//			x[num - 1]++;
//		}
//		System.out.println(Arrays.toString(x));
		
		
		//정답
		
		System.out.println("최소값>");
		int _min = Integer.parseInt(s.nextLine());
		
		System.out.println("최대값>");
		int _max = Integer.parseInt(s.nextLine());
		
		System.out.println("발생횟수>");
		int _repeat = Integer.parseInt(s.nextLine());
		
		
		int [] _counts = new int[_max - _min + 1];
		
		for(int i =0; i <_repeat; i++){
			int random = (int)(Math.random()*(_max - _min + 1)) + _min;
			
			_counts[random - _min]++;
		}
		System.out.println(Arrays.toString(_counts));
				
		
	}
}

















