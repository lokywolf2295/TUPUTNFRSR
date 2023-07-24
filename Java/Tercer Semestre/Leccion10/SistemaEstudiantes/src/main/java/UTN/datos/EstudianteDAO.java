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
    public List<Estudiante> listarEstudiantes() {
        List<Estudiante> estudiantes = new ArrayList<>();
        //Creamos algunos objetos que son necesarios para comunicarnos con la base de datos
        PreparedStatement ps; //Envia la sentencia a la base de datos
        ResultSet rs; //Obtenemos el resultado de la consulta
        Connection con = getConexion(); //Creamos una instancia de la clase Conexion
        String sql = "SELECT * FROM estudiantes2022 ORDER BY idestudiantes2022"; //Sentencia SQL que se ejecutará en la base de datos
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                //Creamos un objeto de tipo Estudiante
                var estudiante = new Estudiante();
                //Asignamos los atributos al objeto estudiante
                estudiante.setIdEstudiante(rs.getInt("idestudiantes2022"));
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellido(rs.getString("apellido"));
                estudiante.setTelefono(rs.getString("telefono"));
                estudiante.setEmail(rs.getString("email"));
                //Agregamos el objeto estudiante a la lista estudiantes
                estudiantes.add(estudiante);
            }
        } catch (Exception e) {
            System.out.println("Ocurió un error al seleccionar datos: " + e.getMessage());
        }
        finally {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println("Ocurrió un error al cerrar la conexión: " + e.getMessage());
            }
        } //Fin try-catch-finally
        return estudiantes;
    } //Fin metodo listar

    public static void main(String[] args) {
        //Listar los estudiantes
        var estudianteDao = new EstudianteDAO();
        System.out.println("Listado de estudiantes");
        List<Estudiante> estudiantes = estudianteDao.listarEstudiantes();
        estudiantes.forEach(System.out::println); //Función lambda para imprimir los estudiantes
    }

} //Fin clase
