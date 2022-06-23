package ModeloDAO;

import Modelo.Externo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PersonaDAO {
    public void alta(Externo e) throws SQLException {
        Connection c;
        String sql;
        Statement smt;
        //--Abrir BD
        ConexionJDB conexion = new ConexionJDB();
        c = conexion.abrir();
        //--Obtener los valores de los atributos del objeto
        String nombre = e.getNombre();
        String apepaterno = e.getApepaterno();
        String apematerno = e.getApematerno();
        String direccion = e.getDireccion();
        String pass = e.getPass();
        //--Definir la sentencia
        sql = "INSERT INTO personal VALUES("
                + nombre + ","
                + "'" + apepaterno + "',"
                + "'" + apematerno + "',"
                + "'" + direccion + "',"
                + pass + ")";
//        System.out.println(sql);
        //--Ejecutar la sentencia
        smt = c.createStatement();
        smt.executeUpdate(sql);
        //--Cerrar la BD
        c.close();
    }
}
