package sale;
import java.sql.*;
import java.util.*;
import product.*;

public class SaleDAO {
	
	Connection con=Database.CON;
	//판매등록
	public void insert(SelVO vo) {
		try {
			String sql="insert into sale(seq,code,sale_date,qnt,price) ";
			sql+="values(seq_sale.nextval, ?, ?, ?, ?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, vo.getCode());
			ps.setString(2, vo.getSale_date());
			ps.setInt(3, vo.getQnt());
			ps.setInt(4, vo.getPrice());
			ps.execute();
		}catch(Exception e) {
			System.out.println("매출등록:" + e.toString());
		}
	}
	//매출현황
	public ArrayList<SelVO> list(){
		ArrayList<SelVO> array=new ArrayList<SelVO>();
		try {
			String sql="select sale_date, code, name, sum(qnt) qnt, sum(price*qnt) price ";
			sql+="from view_sale ";
			sql+="group by sale_date, code, name ";
			sql+="order by sale_date, code";
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				SelVO vo=new SelVO();
				vo.setSale_date(rs.getString("sale_date"));
				vo.setCode(rs.getString("code"));
				vo.setQnt(rs.getInt("qnt"));
				vo.setPrice(rs.getInt("price"));
				vo.setName(rs.getString("name"));
				array.add(vo);
			}
		}catch(Exception e) {
			System.out.println("매출현황:" + e.toString());
		}
		return array;
	}
}