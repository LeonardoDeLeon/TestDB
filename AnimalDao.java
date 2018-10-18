import java.util.ArrayList;
import java.util.List;

import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AnimalDao {

	public static List<Animals> getAnimals() {
        PreparedStatement ps = null;
        
		Animals a = null;
		List<Animals> aList = new ArrayList<Animals>();

		//try(Connection conn = DbConnUtil.getDbConnect()) {
        try {
            System.out.println("Before trying to connect");
            Connection conn = DbConnUtil.getDbConnect();
            if (conn != null) {
                System.out.print("Conn Successful");
            } else {
                System.out.println("Conn Failed...");
            }

			String sql = "SELECT * FROM ANIMALS";
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int legs = rs.getInt("legs");
				int age = rs.getInt("age");
				
				a = new Animals(id, name, legs, age);
				aList.add(a);
			}
			
			rs.close();
			ps.close();
		} catch (SQLException ex) {
            System.out.println("in the sql catch");
			ex.getMessage();
		} catch (IOException ex) {
            System.out.println("in the io catch");
			ex.getMessage();
		}
		
		return aList;
    }
    
}
