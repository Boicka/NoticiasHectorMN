package ModeloDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionJDB implements ConexionI {

    private final String db = "hectormn";
    private final String server = "jdbc:mysql://localhost/" + db;
    private final String user = "dev";
    private final String pass = "Hol@8520";

    @Override
    public void cerrar(Connection c) throws SQLException {
        c.close();
    }

    @Override
    public Connection abrir() throws SQLException {
        Connection c;
        c = DriverManager.getConnection(server, user, pass);
        return c;
    }
}
