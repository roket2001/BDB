/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Bibliotecario extends Persona {
    
    @Override
    public String toString() {
        return  "Esta es la bibliotecaria\nNombre: " + nombre +
                "\nDocumento: " + documentoIdentidad +
                "\nFecha de nacimiento: " + fechaNacimiento +
                "\nCorreo: " + correo +
                "\nTelefono: " + telefono + 
                "\nDireccion: " + direccion; 
    }
}
