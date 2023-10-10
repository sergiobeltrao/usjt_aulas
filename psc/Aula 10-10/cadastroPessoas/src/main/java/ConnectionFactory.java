
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

    private static String usuario = "root";
    private static String senha = "12345";
    private static String host = "localhost";
    private static String porta = "3006";
    private static String db = "db_pessoas";

    public static Connection obtemConexao() {
        try {
            Connection c = DriverManager.getConnection(
                    "jdbc:mysql://" + host + ":" + porta + "/" + db + "?user=" + usuario + "&password=" + senha
                    + "&useTimezone=true&serverTimezone=America/Sao_Paulo");
            return c;

        } catch (Exception e) {
            // Exibe o erro e continua
            e.printStackTrace();
            return null;
        }
    }

}
