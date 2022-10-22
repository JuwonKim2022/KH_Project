package sales.model;

import java.sql.SQLException;
import java.util.List;
import org.apache.ibatis.session.SqlSession;

import sales.model.domain.SalesDTO;
import sales.util.DBUtil2;

public class SalesDAO {

	//selectAllAccountsAccId()
	
	//insertAccount()

	//selectAccountById()

	//updateAccount()

	//deleteAccount()

	public static List<Object> selectAllQuarterAndArea(SalesDTO salesDTO)	 throws SQLException {

		
		SqlSession session = DBUtil2.getSqlSession();
		List<Object> selectAll = null;
		try {
			selectAll = (List<Object>)session.selectList("Sales.selectAllQuarterAndArea", salesDTO);
		}finally {
			if(session != null)
				session.close();
		}
		return selectAll;
	}
	public static List<Object> selectAllArea(SalesDTO salesDTO) throws SQLException {
	
		
		SqlSession session = DBUtil2.getSqlSession();
		List<Object> selectAll = null;
		try {
			selectAll = (List<Object>)session.selectList("Sales.selectAllArea", salesDTO);
		}finally {
			if(session != null)
				session.close();
		}
		return selectAll;
	}
}




