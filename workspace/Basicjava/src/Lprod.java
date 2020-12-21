import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;


public class Lprod {

	public static void main(String[] args) {
		
		//데이터베이스 접속 정보
		String ur1 = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "YJH01";
		String password = "java";
		
		//Connection 생성
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(ur1, user, password);
			
			String sql = "insert into lprod values (?,?,?)";     
			ps = con.prepareStatement(sql);
			
			ps.setInt(1, 11);               //물음표에 값을 넣는 메서드
			ps.setString(2, "P601");
			ps.setString(3, "유제품");
			
//			ps.setInt(parameterIndex, x);
//			ps.setObject(parameterIndex, x);
			
			
			//★  insert, update, delete에서 사용
			int result = ps.executeUpdate();
			System.out.println("영향을 받은 행의 수 :" + result);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
	
		}
		
	}

}
