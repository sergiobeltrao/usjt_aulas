
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CursoDAO {

    public Curso[] obterCursos() throws Exception {
        String sql = "SELECT * FROM TB_CURSOS";
        try (Connection conn = ConnectionFactory.obtemConexao();
             PreparedStatement ps = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE,
                     ResultSet.CONCUR_READ_ONLY);
                ResultSet rs = ps.executeQuery()) {
            int totalCursos;
            if(rs.last()){
                totalCursos = rs.getRow();
            } else {
            totalCursos = 0;
            }
            // Maneira alternativa de escrever atribuição
            // int toatalCursos = rs.last() ? rs.getRow() : 0;
            
            Curso cursos[] = new Curso[totalCursos];
            rs.beforeFirst();
            int cont = 0;
            while (rs.next()) {
            int id = rs.getInt("ID");
            String nome = rs.getString("NOME");
            String tipo = rs.getString("TIPO");
            Curso c = new Curso(id, nome, tipo);
            cursos[cont++] = c;
            }
            return cursos;
        }
    }
}
