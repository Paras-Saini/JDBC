import java.sql.*;

public class JdbcDaoDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDAO dao=new StudentDAO();
		Student s1=dao.getStudent(12);
		System.out.println(s1.sname);

	}

}
class StudentDAO
{
	public Student getStudent(int rollno)
	{
		try
		{
			String Query="select sname from stu1 where rollno="+rollno;
			Student s=new Student();
		s.rollno=rollno;
		Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root","Paras@29");
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery(Query);
	rs.next();
	String name=rs.getString(1);
	s.sname=name;
	
		return s;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return null;
	}
}

class Student
{
	int rollno;
	String sname;
}