import java.sql.*;
class JdbcDemo1
{
	public static void main(String args[]) throws Exception
	{
		String url="jdbc:mysql://localhost:3306/student";
		String uname="root";
		String pwd="Paras@29";
		String query="Select * from stu";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pwd);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		while(rs.next())
		{
		String data=rs.getInt(1) + ":" + rs.getString(2) + ":" + rs.getInt(3)
		+ ":" + rs.getInt(4);
		System.out.println(data);
		}
		st.close();
		con.close();
	}
}
