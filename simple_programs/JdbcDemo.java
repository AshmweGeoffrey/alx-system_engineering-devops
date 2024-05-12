import java.sql.*;

public class JdbcDemo {
    public static void main(String[] args) throws SQLException {
        final String url = "jdbc:mysql://localhost:3306/AUCA";
        final String username = "root";
        final String password = "Ashimwe#001";

        Connection con = DriverManager.getConnection(url, username, password);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM PRODUCTS");

        // Iterate through the ResultSet and print each row's data
        while (rs.next()) {
            String pname = rs.getString("pname");
            int price = rs.getInt("price");
            String category = rs.getString("category");
            System.out.println("Product Name: " + pname + ", Price: " + price + ", Category: " + category);
        }

        // Close ResultSet, Statement, and Connection
        rs.close();
        st.close();
        con.close();
    }
}