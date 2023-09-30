package utn.tienda_libros.servicio;

import utn.tienda_libros.modelo.Libro;

import java.util.List;

public interface ILibroServicio {
    public List<Libro> listarLibros();
    public Libro guardarLibroPorId(Integer idLibro);
    public Libro guardarLibro(Libro libro);
    public void eliminarLibro(Integer idLibro);
}
