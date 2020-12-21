package h_exception;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Finally {

	public static void main(String[] args) {
		/*
	       * finally
	       * - 필요에 따라 try-catch 뒤에 finally를 추가할 수 있다.
	       * - finally는 예외의 발생여부와 상관없이 가장 마지막에 수행된다.
	       * 
	       *  자동자원반환
	       *  - try(변수선언;변수선언) {} catch(Exception e){}
	       *  - 사용 후 반환이 필요한 객체를 try의 ()안에서 선언하면 try 블럭 종료시 자동으로 반환된다.
	       */

	      FileInputStream fis = null; //파일 읽기 위한 클래스
	      
	      try{
	         fis = new FileInputStream("d:/file.txt");  //객체생성 및 파라미터()로 파일의 경로 지정, 지정한 경로에 파일이 없으면 에러가 발생한다.
	         fis.close();         //다 사용하고 나면 반드시 close 호출해서 닫아줘야한다.
	      } catch (Exception e) {
	         e.printStackTrace();
	      }finally{
	         try {
	            fis.close();
	         } catch (Exception e) {
	            e.printStackTrace();
	         }//컴파일 에러가 뜨니까 ctrl+1 surround with try/catch로 변경해준다.
	         
	         //예외발생 : try -> catch -> finally
	         //예외미발생: try -> finally
	         
	         //자동자원반환(JDK1.7)
	         try(FileOutputStream fos = new FileOutputStream("d:/file.txt")){   //FileOutputStream 파일의 내용을 만들어주는 클래스에 변수선언, 초기화 
	            String str = "아무내용이나 써보자....";
	            
	            byte[] bytes = str.getBytes();
	            
	            for(int i=0; i < bytes.length; i++){
	               fos.write(bytes[i]);
	            }
	         }catch(Exception e){
	            e.printStackTrace();
	         
	            }
	         }
	      }   
	   

	//파일을 출력하면 "d:/file.txt" 여기에 텍스트파일이 생긴다.

	}


