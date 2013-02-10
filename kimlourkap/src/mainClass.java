import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Observable;


public class mainClass extends Observable {






	public static void main(String[] args) {



		System.out.println("userName    pasword    totalPosts        trusted\t\t\treview\t\t\trev_id");
		/************************************************************************/
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;

		try { 
			Class.forName("com.mysql.jdbc.Driver").newInstance(); 
			String connectionURL="jdbc:mysql://127.0.0.1:3306/db_klk";
			String connectionUser="root";
			String connectionPass="mysql";
			conn=DriverManager.getConnection(connectionURL,connectionUser,connectionPass);
			stmt=conn.createStatement();
			rs=stmt.executeQuery("select * from table_klk");

			while(rs.next())
			{
				String userName = rs.getString("userName");
				String password = rs.getString("password");
				int totalPosts = rs.getInt("totalPosts");
				int trusted = rs.getInt("trusted");
				String review = rs.getString("review");
				int rev_id = rs.getInt("rev_id");
				System.out.println(userName + "\t\t" + password + "\t\t" + totalPosts + "\t\t" + trusted +"\t\t" + review + "\t\t" + rev_id);



			}

		}
		catch (Exception e) { 
			e.printStackTrace(); 
		}

		finally {
			try { if(rs != null) rs.close(); } catch (SQLException e) { e.printStackTrace(); }
			try { if(stmt != null) stmt.close(); } catch (SQLException e) { e.printStackTrace(); }
			try { if(conn != null) conn.close(); } catch (SQLException e) { e.printStackTrace(); }
		}




		//EventQueue.invokeLater(new Runnable() {
		//public void run() {
		try {
			site frame = new site();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}




