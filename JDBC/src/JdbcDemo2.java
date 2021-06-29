import java.sql.*;
public class JdbcDemo2 {

	public static void main(String[] args) throws Exception
	{
		String url="jdbc:mysql://localhost:3306/student";
		String uname="root";
		String pwd="Paras@29";
		int rollno=8;
		String sname="Roni";
		int marks=80;
		int age=23;
		String query="insert into stu values(?,?,?,?)";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pwd);
		PreparedStatement st=con.prepareStatement(query);
		st.setInt(1, rollno);
		st.setString(2, sname);
		st.setInt(3,marks);
		st.setInt(4, age);
		int count=st.executeUpdate(); //DDL(executerUpdate),DML,DQL(executeQuery)
		System.out.println(count + " row affected");
		st.close();
		con.close();
		
	}

}
