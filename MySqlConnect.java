
import java.sql.*;
import javax.swing.*;

public class MySqlConnect {  
        public static Connection ConnectDB() {
        	/*
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nuststay","root","");
                return conn;
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Incorrect Username or password, DB connection failed");
                return null;
            }
            */
        	try{
    			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nuststay", "root", ""); //id and pass are student.
    			Statement myst = conn.createStatement();
    			ResultSet myRs = myst.executeQuery("select * from student");
    			return conn;
        	}
    		catch(Exception ex){
    			ex.printStackTrace();
    		}
			return null;
		
        }
}