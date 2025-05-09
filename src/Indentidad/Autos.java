
package Indentidad;

import java.time.LocalDate;

public class Autos extends Transporte{
    
    // Constructor de una clase hija de vehiculo
    public Autos(String placa, String modelo, String marca, String color, LocalDate fechaUltimoMantenimiento, String estado){
        super(placa, modelo, marca, color, fechaUltimoMantenimiento, estado);
    }
    public Autos(){}
}
