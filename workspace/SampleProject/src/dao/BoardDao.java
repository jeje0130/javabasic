package dao;

import java.util.List;
import java.util.Map;

import service.BoardService;
import util.JDBCUtil;

public class BoardDao {
	
	private static BoardDao instance;
	private BoardDao(){}
	public static BoardDao getInstance(){
		if(instance == null){
			instance = new BoardDao();
		}
		return instance;
		
		
	}
	
	private JDBCUtil jdbc = JDBCUtil.getInstance();
	
	public List<Map<String, Object>> selectBoardList(){
		String sql = "SELECT A.BOARD_NO, A.TITLE, A.CONTENT, B.USER_NAME, A.REG_DATE "
				+ " FROM TB_JDBC_BOARD A "
				+ " LEFT OURTER JOIN TB_JDBC_BOARD B "
				+ " ON A.USER_ID = B.USER_ID "
				+ " ORDER BY A.BOARD_NO DESC";
		
		return jdbc.selectList(sql);
	}
}






























