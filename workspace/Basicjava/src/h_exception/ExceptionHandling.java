package h_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling {

	public static void main(String[] args) {
		 /*
	       * 에러
	       * - 컴파일에러 : 컴파일 시에 발생되는 에러(빨간줄)
	       * - 논리적에러 : 실행은 되지만, 의도와 다르게 동작하는 것(버그)
	       * - 런타임 에러 : 실행 시에 발생되는 에러
	       * 
	       * 
	       * 런타임 에러
	       * - 런타임 에러 발생시 발생한 위치에서 프로그램이 비정상적으로 종료된다.
	       * - 에러 : 프로그램 코드에 의해 수습될 수 없는 심각한 오류(처리 불가)
	       * - 예외 : 프로그램 코드에 의해서 수습될 수 있는 다소 미약한 오류(처리 가능)
	       * 
	       * 
	       * 예외
	       * - 모든 예외는 Exception 클래스의 자식 클래스이다. 상속
	       * - RuntimeException 클래스와 그 자식들은 예외처리가 강제되지 않는다.~해도되고 안해도되기에 보통 하지 않고, 컴파일에러가 발생될 때에만. try catch~(이걸로 예외처리 해주면 프로그램 종료 방지)
	       * - [RuntimeException 클래스와 그 자식들을 제외한]
	       *     Exception 클래스의 자식들은 예외처리가 강제된다.
	       * 
	       * 
	       * 예외처리(try-catch)
	       * - 예외처리를 통해 프로그램이 비정상적으로 종료되는 것을 방지할 수 있다.
	       * - try {} catch(Exception e){}   ~{} 안에서 예외가 발생되면 catch 파라미터의 타입과 발생한 예외 타입이 일치하면 catch 안의 파라미터가 발생된다.
	       * - try 블럭 안의 내용을 실행 중 예외가 발생하면 catch로 넘어간다.
	       * - catch의 ()안에는 처리할 예외를 지정해줄 수 있다.
	       * - 여러 종류의 예외를 처리할 수 있도록 catch는 하나 이상 올 수 있다.
	       * - 발생한 예외와 일치하는 catch 블럭안의 내용이 수행된 후 try-catch를 빠져나간다.
	       * - 발생한 예외와 일치하는 catch가 없을 경우 예외는 처리되지 않는다.
	       */
	      
	      try{
	         int result = 10 / 0;      //정수인 경우 0으로 나눌 수 없다. > 예외발생
	         System.out.println(result);
	      }catch(ArithmeticException | IndexOutOfBoundsException e){   //try 안에서 발생할 수 있는 예외의 타입을 catch(파라미터)파라미터 안에 넣어주면, 예외 처리(프로그램 종료 안되고 실행됨)
	         e.printStackTrace(); //printStackTrace 메서드는 에러 메시지를 출력한다
	      }catch(NullPointerException e){
	            
	      }catch(Exception e){   //모든 예외를 처리 가능
	         
	      }
	       
	      
	      //**많이 볼 에러메시지
	       // IndexOutOfBoundsException: 배열의 인덱스가 범위를 벗어났다는 에러 메시지
	       // NullPointerException: null에서 참조를 했다.
	      
	      
	      int[] arr = new int[5];  //5개 배열 0,1,2,3,4 만들었는데
	      System.out.println(arr[5]);  //5번 인덱스는 존재하지 않는다.
	      //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 배열의 인덱스가 범위를 벗어났다는 에러 메시지 5

	      String str = null;
	      System.out.println(str.charAt(1));
	      ///Exception in thread "main" java.lang.NullPointerException: null에서 참조를 했다.
	      
	      
	      
	      test1();//컴파일 에러 발생시 Ctrl+1 누르면  > Create method test 2
	   }

	   private static void test1() {
	      test2();
	   }

	   private static void test2() {
	      /*
	       * Call stack
	       * 
	       * |       |
	       * |         |
	       * |       |
	       * |  test2  |
	       * |  test1    |
	       * |__main___|
	       * 
	       * 데이터가 들어올 수 있는 공간이 있지만, 밑으로는 나갈 수 없다.
	       * 데이터가 쌓일때 밑에서 부터 차곡차곡 쌓이는 구조
	       * 나갈때는 위에 있는 애부터 나가야한다. 스택구조
	       * 위에서 나가기 전에는 밑에서 나갈 수 없다.
	       * 예외메세지가 출력되면 맨 위에 있는 에러메시지로 들어가서 해결하면 된다.
	       * 
	       */
	      //System.out.println(10 / 0);
	      
	      
	      try {
	         new FileInputStream(" ");
	      } catch (FileNotFoundException e) {
	         e.printStackTrace();
	      }  
	      //RuntimeException 클래스와 그 자식들을 제외한 Exception 클래스의 자식들은 예외처리가 강제된다.
	                           //Ctrl + 1 > Surround with try catch
	   }

	}


	


