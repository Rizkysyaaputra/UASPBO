    package koneksi;
    import java.sql.*;
    import javax.swing.JOptionPane;
    public class KoneksiDatabase {
        Connection rizky;
        public static Connection BukaKoneksi(){
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection aam = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_apotik","root","");
                return aam;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
                return null;
            }
        }
    }
