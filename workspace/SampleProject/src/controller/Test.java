package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import util.JDBCUtil;
import util.ScanUtil;

public class Test {

	public static void main(String[] args) {
//		JDBCUtil jdbc = JDBCUtil.getInstance();
//		String sql = "select * from restaurants "
//						+ "where COUSINE = ?";
//		List<Object> p = new ArrayList<>();
//		System.out.print("검색할 음식스타일 > ");
//		String str = ScanUtil.nextLine();
//		p.add(str);
//		List<Map<String, Object>> result =jdbc.SelectList(sql,p);
//		System.out.println("========================================================================");
//		for(int i = 0; i < result.size(); i++){
//			System.out.print("이름 : " + result.get(i).get("RES_NAME"));
//			System.out.print(" 요리 : " + result.get(i).get("COUSINE"));
//			System.out.print(" 주소 : " + result.get(i).get("ADD1"));
//			System.out.print(" 거리 : " + result.get(i).get("DISTANCE") + "m ");
//			
//			String opentime = "";
//			if(result.get(i).get("OPEN_TIME") == null){
//				System.out.println("영업시간 정보없음");
//			}else{
//			opentime = result.get(i).get("OPEN_TIME").toString();}
//			
//			String closetime = "";
//			if(result.get(i).get("CLOSE_TIME") == null){
//				System.out.print("");
//			}else{
//				closetime = result.get(i).get("CLOSE_TIME").toString();
//				System.out.println(opentime+"~"+closetime);}
//			
//		}
//		System.out.println("========================================================================");
		
		
		//검색한 가게 평점, 리뷰갯수
//		JDBCUtil jdbc = JDBCUtil.getInstance();
//		String sql = "select a.*, nvl(b.SCORE,0) as SCORE, nvl(b.REVIEW,0) as REVIEW"
//				+ " from RESTAURANTS a, (select res_id, nvl(round(avg(GRADE),2),0) as SCORE,"
//											+ " count(RES_ID) as REVIEW from review group by res_id) b"
//									 + " where a.RES_ID=b.res_id(+)"
//									 + " and RES_NAME = ?";
//		List<Object> p = new ArrayList<>();
//		System.out.print("검색할 가게이름 > ");
//		String name = ScanUtil.nextLine();
//		p.add("%" + name + "%");
//		List<Map<String, Object>> result =jdbc.SelectList(sql,p);
//		System.out.println("========================================================================");
//		for(int i = 0; i < result.size(); i++){
//			System.out.print("가게명 : " + result.get(i).get("RES_NAME"));
//			System.out.print(" 평점 : " + result.get(i).get("SCORE"));
//			System.out.print(" 리뷰수 : " + result.get(i).get("REVIEW"));
//		}
//		System.out.println("========================================================================");
//	}
	
		
		
		//메뉴검색
//		JDBCUtil jdbc = JDBCUtil.getInstance();
//		String sql = "select distinct a.* "
//				+ " from RESTAURANTS a, MENU b"
//				+ " where a.RES_ID=b.RES_ID(+)"
//				+ " and FOOD like ?";
//		List<Object> p = new ArrayList<>();
//		System.out.print("검색할 메뉴 > ");
//		String menu = ScanUtil.nextLine();
//		p.add("%"+ menu + "%");
//		List<Map<String, Object>> result =jdbc.SelectList(sql,p);
//		System.out.println("========================================================================");
//		for(int i = 0; i < result.size(); i++){
//			System.out.print(" 가게명 : " + result.get(i).get("RES_NAME"));
//			System.out.print(" /주소 : " + result.get(i).get("ADD1"));
//			
//			String openTime = "";
//			if(result.get(i).get("OPEN_TIME")==null){
//				System.out.println(" /영업시간 정보없음");
//			}else{ 
//			openTime = result.get(i).get("OPEN_TIME").toString();
//			System.out.println(" /오픈시간 : " + openTime);}
//			
//		}
//		System.out.println("========================================================================");
		
		
		
		//음식스타일검색
				JDBCUtil jdbc = JDBCUtil.getInstance();
				String sql = "select * from RESTAURANTS"
						+ " where COUSINE = ?";
				List<Object> p = new ArrayList<>();
				System.out.print("음식스타일 검색 > ");
				String cousine = ScanUtil.nextLine();
				p.add(cousine);
				List<Map<String, Object>> result =jdbc.SelectList(sql,p);
				System.out.println("========================================================================");
				for(int i = 0; i < result.size(); i++){
					System.out.print(" 가게명 : " + result.get(i).get("RES_NAME"));
					System.out.print(" / 음식스타일 : " + result.get(i).get("COUSINE"));
					System.out.print(" / 주소 : " + result.get(i).get("ADD1"));
					
					String openTime = "";
					if(result.get(i).get("OPEN_TIME")==null){
						System.out.println(" /영업시간 정보없음");
					}else{ 
					openTime = result.get(i).get("OPEN_TIME").toString();
					System.out.println(" /오픈시간 : " + openTime);}
					
				}
				System.out.println("========================================================================");
		
	}

}
