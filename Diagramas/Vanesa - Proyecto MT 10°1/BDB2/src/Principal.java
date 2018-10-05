/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Principal {
    
    public static void main (String[] args) {
        Lector unLector = new Lector();
        unLector.nombre = "Andres Morales";
        unLector.fechaNacimiento = "Marzo 07 del 2001";
        unLector.documentoIdentidad = 100887407;
        unLector.correo = "andres07032001@gmail.com";
        unLector.telefono = 4186678;
        unLector.direccion = "Calle 106 No. 66-07";
        // los otros datos
        unLector.busca();
        unLector.reclama();
        unLector.registra();
        unLector.reserva();
        
        Bibliotecario b = new Bibliotecario();
        b.nombre = "Amparo";
        b.fechaNacimiento = "Abril 04 del 1988";
        b.documentoIdentidad = 96787507;
        b.correo = "amparo09061988@gmail.com";
        b.telefono = 5786518;
        b.direccion = "Calle 68c No. 55-08";
        //los demas datos
        
        Libro lb = new Libro();
        lb.nombre = "Opio en las nubes";
        lb.autor = "Rafael Chaparro Madiedo";
        lb.añoPublicación = 1992;
        lb.editorial = "TROPO";
        lb.sinopsis = "Soy Pink Tomate, el gato de Amarilla. A veces no sé si soy tomate o gato. "
                + "En todo caso a veces me parece que soy un gato que le gustan los tomates o más \n"
                + "bien un tomate con cara de gato. O algo así. Me gusta el olor a vodka con las flores. "
                + "Me gusta ese olor en las mañanas cuando Amarilla llega de una fiesta llena de sudores y \n"
                + "humos y me dice hola Pînk y yo me digo mierda, esta Amarilla es cosa seria, nunca duerme, "
                + "nunca come, nunca descansa, qué vaina, qué cosa tan seria. Claro que a veces me desespera \n"
                + "cuando llega con la noche entre sus manos, con la desesperación en su boca y entonces se "
                + "sienta en el sofá, me riega un poco de ceniza en el pelo, qué cosa tan seria, y empieza a \n"
                + "cantar alguna canción triste, algo así como I want a trip trip trip como para poder resistir "
                + "la mañana o para terminar de joderla trip trip trip";
        lb.tematica = "La historia es contada por tres narradores, todos marcados por la droga, la música rock, "
                + "el sexo y la derrota como forma de vida. El libro incursiona en la experimentación con el \n"
                + "lenguaje, lo que lleva a una narración psicodélica, rápida, relacionada con la narrativa "
                + "cinematográfica, con el montaje teatral y con el funcionamiento de la perronera.\n" 
                + "La historia se centra en el estilo de vida de distintos personajes cuyas historias reflejan \n"
                + "las marcas de su personalidad y la razón por la que ahora se reflejan en las drogas, los bares "
                + "y el amor hacia el ideal de existir";
        
        System.out.println(unLector);
        System.out.println(b);
        System.out.println(lb);
    }
}
