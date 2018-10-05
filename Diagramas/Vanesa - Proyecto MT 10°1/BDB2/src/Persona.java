/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Persona {
    
    String nombre;
    String fechaNacimiento;
    int documentoIdentidad;
    String correo;
    int telefono;
    String direccion;
    
    @Override
    public String toString() {
        return  "éste es la persona\nnombre: " + nombre +
                "\ntelefono: " + telefono; //To change body of generated methods, choose Tools | Templates.
    }
}
