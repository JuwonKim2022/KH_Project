package sales.view;

import java.sql.SQLException;
import java.util.List;

import sales.model.SalesDAO;
import sales.model.domain.SalesDTO;

public class SalesStartView {
	public static void main(String[] args) throws SQLException {


		System.out.println("***** 분기,지역으로 검색 *****");
		List<Object> all3 = SalesDAO.selectAllQuarterAndArea(new SalesDTO(4, "서대문구"));
		int a = 0;
		if (!all3.isEmpty()) {
			for (Object i : all3) {
				a = a + 1;
				System.out.println(a);
			}
			for (Object value2 : all3) {
				System.out.println(value2);
			}
		}
		System.out.println("***** 지역으로만 검색*****");
		List<Object> all = SalesDAO.selectAllArea(new SalesDTO( "서대문구"));
		int b = 0;
		if (!all.isEmpty()) {
	// 자료 수량 확인---
			for (Object i : all) {
				b = b + 1;
				System.out.println(b);
			}
			for (Object value2 : all) {
				System.out.println(value2);
			}
	}
}
}
