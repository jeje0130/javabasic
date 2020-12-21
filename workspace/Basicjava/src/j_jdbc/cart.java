package j_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class cart {

	public static void main(String[] args) {
		///데이터베이스 접속 정보
		String ur1 = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "YJH01";
		String password = "java";
		
		//Connection 생성
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(ur1, user, password);
			
			String sql = "select * from cart";     //쿼리작성
			ps = con.prepareStatement(sql);
			
			//★   select에서 사용
			rs = ps.executeQuery();
			
			//★  insert, update, delete에서 사용
//			int result = ps.executeUpdate();         //영향받은 행(row)의 수를 리턴
			
			
			while(rs.next()){
				String cartMember = rs.getString("CART_MEMBER");      
				String cartNo = rs.getString("CART_NO");      
				String cartProd = rs.getString("CART_PROD");      
				int cartQty = rs.getInt(4);      
				System.out.println("CART_MEMBER : " + cartMember + " / CART_NO : " + cartNo
						              + " / CART_PROD : " + cartProd + " / CART_QTY : " + cartQty);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}
	}

}
