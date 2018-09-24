/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Lector extends Persona {
    
    
    public void registra() {
        System.out.println("el lector ha sido registrado");
    }
    public void busca() {}
    public void reserva() {}
    public void reclama() {}

    @Override
    public String toString() {
        return  "Este es el lector\nNombre: " + nombre +
                "\nDocumento: " + documentoIdentidad +
                "\nFecha de nacimiento: " + fechaNacimiento +
                "\nCorreo: " + correo +
                "\nTelefono: " + telefono + 
                "\nDireccion: " + direccion; 
    }
    
}
