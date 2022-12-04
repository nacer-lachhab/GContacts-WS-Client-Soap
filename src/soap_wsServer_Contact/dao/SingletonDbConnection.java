package soap_wsServer_Contact.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingletonDbConnection {

	private static Connection connection;

	static {
		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");//tester la presence du driver
			connection = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/soap-gestion-contacts", "root", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		return connection;
	}
}
