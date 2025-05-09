
package Indentidad;

import java.time.LocalDate;

public class Motos extends Transporte{
    
    public Motos(){}
    
    public Motos(String placa, String modelo, String marca, String color, LocalDate fechaUltimoMantenimiento, String estado){
        super(placa, modelo, marca, color, fechaUltimoMantenimiento, estado);
    } 
    
}
