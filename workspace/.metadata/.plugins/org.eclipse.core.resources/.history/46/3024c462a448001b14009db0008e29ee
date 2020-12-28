package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import util.JDBCUtil;
import util.ScanUtil;

public class Test {

	public static void main(String[] args) {
		JDBCUtil jdbc = JDBCUtil.getInstance();
		String sql = "select count(*) as LOGIN from USERS "
					+ "where USER_ID = ? "
					+ "and PASSWORD = ?";
		List<Object> p = new ArrayList<>();
		System.out.print("아이디를 입력해주세요 >");
		String str = ScanUtil.nextLine();
		p.add(str);
		System.out.print("비밀번호를 입력해주세요 >");
		String str2 = ScanUtil.nextLine();
		p.add(str2);
		Map<String, Object> result =jdbc.SelectOne(sql,p);
		if(result.get("LOGIN").toString().equals("1")){
			System.out.println("접속에 성공했습니다.");
		}else{
			System.out.println("접속에 실패했습니다.");
		}
		
	}

}
