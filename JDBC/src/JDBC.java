import java.sql.*;

public class JDBC {
    private static String url = "jdbc:mysql://localhost:3306/bankdb?autoReconnect=true&useSSL=false";
    private static String username = "root";
    private static String password = "root";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //Nạp driver
        Class.forName("com.mysql.jdbc.Driver");
        //Đăng ký
        Connection con = DriverManager.getConnection(url, username, password);


        //excuteQuery

        if (con == null){
            System.out.println("false");
        }
        else{
            System.out.println("ok");
            Statement stm = con.createStatement();
            //executeUpdate: update bảng

            String sql = "SELECT * FROM customers";
            ResultSet res = stm.executeQuery(sql);
            while(res.next()) {
                System.out.println(res.getString(1) + " " + res.getString(2));
            }
          }
    }
}
