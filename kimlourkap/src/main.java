
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		userAccount us =new userAccount("nikos","123",true);
		System.out.println(us.name);
		
		//site s=new site();
		//s.textArea2.setText("efe");



	}

}


/*


String url = "jdbc:mysql://127.0.0.1:3306/";

String dbName = "";
String driver = "com.mysql.jdbc.Driver";
String userName = "";
String password = "";

try 
{
	Class.forName(driver);
	conn = DriverManager.getConnection(url+dbName,userName,password);
}
catch (Exception e) 
{
e.printStackTrace();
}

}



 */