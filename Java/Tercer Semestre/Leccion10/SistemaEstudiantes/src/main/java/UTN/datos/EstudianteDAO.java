package UTN.datos;

import static UTN.conexion.Conexion.getConexion;
import UTN.dominio.Estudiante;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EstudianteDAO {
    //Metod Listar
    public List<Estudiante> listar() {
        List<Estudiante> estudiantes = new ArrayList<>();
        //Creamos algunos objetos que son necesarios para comunicarnos con la base de datos
        PreparedStatement ps; //Envia la sentencia a la base de datos
        ResultSet rs; //Obtenemos el resultado de la consulta
        Connection con = getConexion(); //Creamos una instancia de la clase Conexion
        String sql = "SELECT * FROM estudiantes"; //Sentencia SQL que se ejecutará en la base de datos
    }
}
