package professors;
import java.sql.*;
import java.util.*;

public class ProDAO {
	Connection con=Database.CON;
	//교수수정
	public void update(ProVO vo) {
		try {
			//System.out.println(vo.toString());
			String sql="update professors set pname=?,dept=?,title=? where pcode=?"; //마지막은 ,없음
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, vo.getPname()); //값을 넣을땐 set 값을 가져올땐 get
			ps.setString(2, vo.getDept());
			ps.setString(3, vo.getTitle());
			ps.setString(4, vo.getPcode());
			ps.execute();
		}catch(Exception e) {
			System.out.println("교수수정:"+e.toString());
		}
	}
	
	//교수삭제
	public void delete(String pcode) {
		try {
			String sql="delete from professors where pcode=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,pcode);
			ps.execute();
		}catch(Exception e) {
			System.out.println("교수삭제:"+e.toString());
		}
	}
	
	//교수조회
	public ProVO read(String pcode) {
		ProVO vo=new ProVO();
		try {
			String sql="select * from professors where pcode=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,pcode);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				vo.setPcode(rs.getString("pcode"));
				vo.setPname(rs.getString("pname"));
				vo.setDept(rs.getString("dept"));
				vo.setHiredate(rs.getString("hiredate"));
				vo.setTitle(rs.getString("title"));
				vo.setSalary(rs.getInt("salary"));
			}
		}catch(Exception e) {
			System.out.println("교수조회:"+e.toString());
		}
		return vo;
	}
	//새로운 코드를 만드는 메소드
	public int getCode() {
		int code=0;
		try {
			String sql="select max(pcode)+1 as code from professors";
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) { //rs가 next가면 값을 꺼내오는데 code에 있는 값을 int로 가져온다.
				code=rs.getInt("code");
			}
		}catch(Exception e) {
			System.out.println("새로운 코드:"+e.toString());
		}
		return code;
	}
	
	//교수등록
	public void insert(ProVO vo) {
		try {
			String sql="insert into professors(pcode,pname,dept,hiredate,title,salary)";
					sql+= "values(?,?,?,?,?,?)"; //값이 뭐가 들어갈지 모르니까 ?로 표시
			PreparedStatement ps=con.prepareStatement(sql); //sql을 ps에 저장
			ps.setString(1, vo.getPcode());
			ps.setString(2, vo.getPname());
			ps.setString(3, vo.getDept());
			ps.setString(4, vo.getHiredate());
			ps.setString(5, vo.getTitle());
			ps.setInt(6, vo.getSalary());
			ps.execute(); //실행하다
		}catch(Exception e) {
			System.out.println("교수등록:"+e.toString());
		}
	}
	//교수목록
	public ArrayList<ProVO> list(){
		ArrayList<ProVO> array=new ArrayList<ProVO>();
		try {
			String sql="select * from professors order by pcode";
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery(); //sql을 ps에 넣어서 rs에 넣는 것
			while(rs.next()) {
				ProVO vo=new ProVO();
				vo.setPcode(rs.getString("pcode"));
				vo.setPname(rs.getString("pname"));
				vo.setDept(rs.getString("dept"));
				vo.setHiredate(rs.getString("hiredate"));
				vo.setTitle(rs.getString("title"));
				vo.setSalary(rs.getInt("salary"));
				array.add(vo);
			}
		}catch(Exception e) {
			System.out.println("교수목록:"+e.toString());
		}
		return array;
	}
}
