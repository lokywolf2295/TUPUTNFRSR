package utn.estudiantes.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import utn.estudiantes.modelo.Estudiante;

public class EstudianteRepositorio  extends JpaRepository<Estudiante, Integer> {
}
