
import java.util.List;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Libro {
    
    String nombre;
    String autor;
    int anioPublicación;
    String editorial;
    String sinopsis;
    String tematica;
    List<Genero> listaGeneros;
    
    @Override
    public String toString() {
        return  "Este es el libro\nNombre: " + nombre +
                "\nAutor: " + autor +
                "\nAño de publicación: " + anioPublicación +
                "\nEditorial: " + editorial +
                "\nSinopsis: " + sinopsis + 
                "\nTematica: " + tematica; 
    }
}
