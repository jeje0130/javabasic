package i_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class HashMapClass {

	public static void main(String[] args) {
		/*
		 * Object put(Object key, Object value) : 지정된 키와 값을 저장한다.
		 * Object remove(Object key) : 지정된 키로 저장된 값을 제거한다.
		 * Object get(Object key) : 지정된 키의 값(없으면 null)을 반환한다.
		 * set keySet() : 저장된 모든 키를 Set으로 반환한다.
		 */
		
		HashMap<String, Object> map = new HashMap<>();
		
		map.put("a", 10);                     
		map.put("b", "홍길동");
		map.put("c", new Scanner(System.in));
		
		System.out.println(map);              //순서는 없다
		
		map.put("b", "이순신");   //덮어쓴다	
		System.out.println(map); // 하나의 키로는 하나의 값 저장
		
		map.remove("c");        //"c" 삭제
		System.out.println(map);
		
		Object value = map.get("b");
		System.out.println(value); //제네릭에 지정된 타입으로 값을 받을 수 있다.
		
		int value1 = (Integer)map.get("a");
		String value2 = (String)map.get("g");
		
		Set<String> keys = map.keySet();// 지정된 모든 키
		
	
		for(String key : keys){
			System.out.println(key + " : "+ map.get(key));
		}

		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i : list){
			
		}
		
		//회원 테이블
		//아이디, 비밀번호, 이름, 전화번호
		/*
		 * id		password	name	tel
		 * admin	admin123	관리자	010-1234-5678
		 */
		
		HashMap<String, String> user = new HashMap<>();
		
		user.put("id", "admin");
		user.put("password", "admin123");
		user.put("name", "관리자");
		user.put("tel", "010-1234-5678");
		
		System.out.println(user);
		
		ArrayList<HashMap<String, String>> table = new ArrayList<>();
		table.add(user);
		
		
		
        user = new HashMap<>();
		
		user.put("id", "yjh");
		user.put("password", "jh1004");
		user.put("name", "윤지혜");
		user.put("tel", "010-4626-0081");
		
		
		table.add(user);
		
		
		for(int i = 0; i < table.size(); i++){
			HashMap<String, String> hashMap = table.get(i);
			Set<String> KeySet = hashMap.keySet();
			for(String key : KeySet){
				System.out.print(key+" : "+hashMap.get(key));
			}
			System.out.println("----------------------------------");
		}
		
	}

}




















































