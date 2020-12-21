package d_array;

public class StringSpeedTest {

	public static void main(String[] args) {
		// 문자열은 변경을 하면 새로운 문자열을 만든다
		
		String str = "a";
		
//		long start = System.currentTimeMillis();
//		
//		for(int i = 0; i < 400000; i ++){
//			str += "a";
//		}
//		long end = System.currentTimeMillis();
//		System.out.println(end - start + "ms");
		
		StringBuffer sb = new StringBuffer("a");   //String을 많이 변경할때 사용하면 좋다. 시간절약
		
		long start = System.currentTimeMillis();
		for(int i = 0; i < 200000000; i++){
			sb.append("a");
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start + "ms");
	}

}




















