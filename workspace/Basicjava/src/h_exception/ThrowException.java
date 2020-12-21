package h_exception;

import java.io.IOException;

public class ThrowException {

   public static void main(String[] args) {
      /*
       * 예외발생시키기 (**잘 사용하지 않는다.)
       * - throw new Exception();
       * - throw 예약어와 예외 클래스의 객체로 예외를 고의로 발생시킬 수 있다.
       */
      
      IOException ioe = new IOException();
      
      try {
         throw ioe;
      } catch (IOException e) {
         e.printStackTrace();
      }
      
      
      
      throw new NullPointerException(); //예외처리를 안해도 컴파일 에러가 발생하지 않는다. 부모가 누구냐에 따라. 이건 RuntimeException자식이기에 예외처리 안해줘도 그만
      

      
      
   }

}

	


