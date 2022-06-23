package ModeloDAO;

import java.sql.SQLException;

public class ComprobarConexion {
    public static void main(String[] args) throws SQLException {
        ConexionJDB c = new ConexionJDB();
        try {
            if(c.abrir() != null ){
                System.out.println("Conexion exitosa");
            }else{
                System.out.println("Ocurrio un error al conectar");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
