import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    public static Connection getConnection() {
        try {
            String url = "jdbc:mysql://localhost:3306/cadastro";
            String user = "root";      // coloque seu usuário do MySQL
            String password = "";  // coloque sua senha do MySQL

            return DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            throw new RuntimeException("Erro na conexão: " + e.getMessage());
        }
    }
}
