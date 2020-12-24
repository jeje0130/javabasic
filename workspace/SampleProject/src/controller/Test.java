package controller;

import java.util.List;
import java.util.Map;

import util.JDBCUtil;

public class Test {

	public static void main(String[] args) {
		JDBCUtil jdbc = JDBCUtil.getInstance();
		String sql = "select * from restaurants order by DISTANCE";
		List<Map<String, Object>> result =jdbc.SelectList(sql);
		System.out.println(result.get(1).get("RES_NAME"));
		
	}

}
