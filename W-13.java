import java.sql.*;

public class JDBC {

	static final String DB_URL = "jdbc:mysql://localhost:3306/sample";

	static final String USER = "root";

	static final String PASS = "Ashok@123";

	static final String QUERY = "select * from employee";

	static final String QUERY_INS = "insert into employee(emp_no,emp_name,salary) values(567,'Anil Ambani',8965)";

	public static void main(String[] args) throws ClassNotFoundException {

		// Open a connection

		try {

			Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

			Statement stmt = conn.createStatement();

			stmt.executeUpdate(QUERY_INS);

			ResultSet rs = stmt.executeQuery(QUERY);

			// Extract data from result set

			System.out.print("*****************************************************");

			System.out.print("\nEmp No\tEmp Name\tSalary\n");

			System.out.print("*****************************************************");

			while (rs.next()) {

				// Retrieve by column name

				System.out.print("\n"+rs.getInt("emp_no")+"\t"+rs.getString("emp_name")+"\t"+rs.getInt("salary")+"\n");

			}

			System.out.print("*****************************************************");

		} 

		catch (SQLException e) {

			e.printStackTrace();

		}

	}

}
