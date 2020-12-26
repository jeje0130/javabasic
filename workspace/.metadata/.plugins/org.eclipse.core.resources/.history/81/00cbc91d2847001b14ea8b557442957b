package controller;

import java.util.List;
import java.util.Map;

import util.JDBCUtil;

public class Test {

	public static void main(String[] args) {
		JDBCUtil jdbc = JDBCUtil.getInstance();
		String sql = "select * from review order by user_id";
		List<Map<String, Object>> result =jdbc.SelectList(sql);
		for(int i = 0; i < result.size(); i++){
			System.out.print(" 아이디 : " + result.get(i).get("USER_ID"));
			System.out.print(" 리뷰 : " + result.get(i).get("R_CONTENT"));
			System.out.print(" 평점 : " + result.get(i).get("GRADE"));
			System.out.println(" 번호 : " + result.get(i).get("RE_NO"));
		}
	}

}
