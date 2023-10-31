
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

    private static String usuario = "avnadmin";
    private static String senha = "AVNS_wC0LYjBl0iFcvbK6pXk";
    private static String host = "mysql-142e36e7-aluno-aaec.a.aivencloud.com";
    private static String porta = "12006";
    private static String bd = "sergio_db";

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
