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

    //Método buscar por id -> findById
    public boolean buscarEstudiantePorId(Estudiante estudiante){
        //Creamos algunos objetos que son necesarios para comunicarnos con la base de datos
        PreparedStatement ps; //Envia la sentencia a la base de datos
        ResultSet rs; //Obtenemos el resultado de la consulta
        Connection con = getConexion(); //Creamos una instancia de la clase Conexion
        String sql = "SELECT * FROM estudiantes2022 WHERE idestudiantes2022 = ?"; //Sentencia SQL que se ejecutará en la base de datos
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, estudiante.getIdEstudiante());
            rs = ps.executeQuery();
            if (rs.next()){
                //Asignamos los atributos al objeto estudiante
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellido(rs.getString("apellido"));
                estudiante.setTelefono(rs.getString("telefono"));
                estudiante.setEmail(rs.getString("email"));
                return true; //Si encuentra el estudiante
            }
        } catch (Exception e) {
            System.out.println("Ocurió un error al seleccionar datos: " + e.getMessage());
            return false;
        }
        finally {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println("Ocurrió un error al cerrar la conexión: " + e.getMessage());
            }
        } //Fin try-catch-finally
        return false; //Si no encuentra el estudiante
    } //Fin metodo buscarEstudiantePorId

    //Método agregar un nuevo estudiante
    public boolean agregarEstudiante(Estudiante estudiante){
        //Creamos algunos objetos que son necesarios para comunicarnos con la base de datos
        PreparedStatement ps; //Envia la sentencia a la base de datos
        Connection con = getConexion(); //Creamos una instancia de la clase Conexion
        String sql = "INSERT INTO estudiantes2022 (nombre, apellido, telefono, email) VALUES (?, ?, ?, ?)"; //Sentencia SQL que se ejecutará en la base de datos
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, estudiante.getNombre());
            ps.setString(2, estudiante.getApellido());
            ps.setString(3, estudiante.getTelefono());
            ps.setString(4, estudiante.getEmail());
        } catch (Exception e) {
            System.out.println("Ocurió un error al insertar datos: " + e.getMessage());
        }
    } //Fin metodo agregarEstudiante

    public static void main(String[] args) {
        //Listar los estudiantes
        var estudianteDao = new EstudianteDAO();
        System.out.println("Listado de estudiantes");
        List<Estudiante> estudiantes = estudianteDao.listarEstudiantes();
        estudiantes.forEach(System.out::println); //Función lambda para imprimir los estudiantes

        //Buscar un estudiante por id
        var estudiante1 = new Estudiante(2);
        System.out.println("Estudiantes antes de la busuqeda: " + estudiante1);
        var encontrado = estudianteDao.buscarEstudiantePorId(estudiante1);
        if(encontrado){
            System.out.println("Estudiante encontrado: " + estudiante1);
        } else {
            System.out.println("Estudiante no encontrado" + estudiante1.getIdEstudiante());
        }
    }

} //Fin clase
