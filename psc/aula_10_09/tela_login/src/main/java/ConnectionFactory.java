
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

    private static String usuario = "root";
    private static String senha = "12345";
    private static String host = "localhost";
    private static String porta = "3306";
    private static String bd = "tb_usuario";

    public static Connection obtemConexao() {
        try {
            return DriverManager
                    .getConnection("jdbc:mysql://" + host + ":" + porta + "/" + bd + "?user=" + usuario + "&password=" + senha + "&sueTimezone=true&serverTimezone=America/Sao+Paulo");
            // teste
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
