package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import util.JDBCUtil;
import util.ScanUtil;

public class Test {

	public static void main(String[] args) {
		JDBCUtil jdbc = JDBCUtil.getInstance();
		String sql = "select * from restaurants "
						+ "where COUSINE = ?";
		List<Object> p = new ArrayList<>();
		System.out.print("검색할 음식스타일 > ");
		String str = ScanUtil.nextLine();
		p.add(str);
		List<Map<String, Object>> result =jdbc.SelectList(sql,p);
		System.out.println("========================================================================");
		for(int i = 0; i < result.size(); i++){
			System.out.print("이름 : " + result.get(i).get("RES_NAME"));
			System.out.print(" 요리 : " + result.get(i).get("COUSINE"));
			System.out.print(" 주소 : " + result.get(i).get("ADD1"));
			System.out.print(" 거리 : " + result.get(i).get("DISTANCE") + "m ");
			
			String opentime = "";
			if(result.get(i).get("OPEN_TIME") == null){
				System.out.println("영업시간 정보없음");
			}else{
			opentime = result.get(i).get("OPEN_TIME").toString();}
			
			String closetime = "";
			if(result.get(i).get("CLOSE_TIME") == null){
				System.out.print("");
			}else{
				closetime = result.get(i).get("CLOSE_TIME").toString();
				System.out.println(opentime+"~"+closetime);}
			
		}
		System.out.println("========================================================================");
	}

}
