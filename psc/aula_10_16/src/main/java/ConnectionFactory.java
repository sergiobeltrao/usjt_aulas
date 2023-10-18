
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

    private static String usuario = "avnadmin";
    private static String senha = "AVNS_XCkZ5sSCbELTX_FR9kd";
    private static String host = "mysql-1cc252d6-brunoffco-7e33.aivencloud.com";
    private static String porta = "13572";
    private static String bd = "defaultdb";

    public static Connection obtemConexao() {
        try {
            Connection c = DriverManager.getConnection(
                    "jdbc:mysql://" + host + ":" + porta + "/" + bd + "?user=" + usuario + "&password=" + senha + "&useTimezone=true&serverTimezone=America/Sao_Paulo");
            return c;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
