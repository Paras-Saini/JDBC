
public class ForNameDemo {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		Class.forName("Pqr");

	}

}
class Pqr
{
	static {
		System.out.println("in static");
	}
	{
		System.out.println("in instance");
	}
}
