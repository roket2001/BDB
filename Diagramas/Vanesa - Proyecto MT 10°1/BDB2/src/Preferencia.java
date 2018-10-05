
import java.util.List;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Preferencia {
    
    public List<Genero> listaGeneros;
    public Lector lector;

    public Preferencia(List<Genero> lista, Lector l) {
        this.listaGeneros = lista;
        this.lector = l;
    }
    
}
