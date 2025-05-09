package Indentidad;

import javax.swing.JOptionPane;
import Indentidad.Bicicleta;
import Indentidad.Usuario;
import Indentidad.Reserva;
import java.time.LocalDate;
import java.util.ArrayList;

public class Inicializador {

    //metodos estaticos para inicializar los objetos al momento de correr el programa
    public static void iniciarUsuario(ArrayList<Usuario> listausuario) {       
        //instanciando el objeto usuario en la cual pasamos todos sus parametros.
        listausuario.add(new Usuario("alim", 45455656, "chimbote", "alim@gamil.com", 9999999, "shsdsd"));
        listausuario.add(new Usuario("jenny", 7323445, "gaudalupito", "jenny@gamil.com", 999999, "-")); 
        // instanciando el objeto Usuario
        Usuario p5=new Usuario("castillo", 5446557, "cajamarca", "cast@gamil.com", 888888, "-");
        listausuario.add(p5);
    }

    public static void iniciarBicicleta(ArrayList<Bicicleta> listabicicleta) {
        
        Bicicleta bici = new Bicicleta(600, "as23", "aasa", "azul",LocalDate.now(), "Disponible");
        listabicicleta.add(bici);
        listabicicleta.add(new Bicicleta(602, "gggg", "hgdd", "rojo",LocalDate.now(), "Reparación"));
        listabicicleta.add(new Bicicleta(603, "cccc", "cccc", "verde",LocalDate.now(), "Disponible"));
    }
    
    public static void iniciarMotos(ArrayList<Motos> listamotos){
        //String placa;
        //String modelo;
        //String marca;
        //String color;
        //LocalDate fechaUltimoMantenimiento;
        //String estado;

        Motos moto = new Motos("abcsd","adgd653","fdggdf","negro",LocalDate.now(), "Disponible");
        listamotos.add(moto);
        listamotos.add(new Motos("23gdgf","jdgdgf","jjfff","negro",LocalDate.now(), "Disponible"));
        listamotos.add(new Motos("23gdgf","jdgdgf","kggta","blanco",LocalDate.now(), "Dañada"));
        listamotos.add(new Motos("777ddd","midad","lhdtsa","rojo",LocalDate.now(), "Reparación"));
    }
    
    public static void iniciarAutos(ArrayList<Autos> listaautos){
        listaautos.add(new Autos("wahsd", "123dfss", "audi", "negro", LocalDate.now(), "Disponible"));
        listaautos.add(new Autos("ouddn", "1224tdd", "jeep", "negro", LocalDate.now(), "Disponible"));
        listaautos.add(new Autos("ldkfj", "774nfnd", "jeep", "blanco", LocalDate.now(), "Reparación"));
        listaautos.add(new Autos("esndf", "25955hd", "ford", "rojo", LocalDate.now(), "Dañada"));
    }
}
