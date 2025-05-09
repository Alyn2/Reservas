package Indentidad;

import java.time.LocalDate;

public class Bicicleta extends Transporte{
    
    // Atributo privado
    private int chasis;
    
    public Bicicleta(){}
    
    public Bicicleta(int chasis,String modelo, String marca, String color, LocalDate fechaUltimoMantenimiento, String estado){
        super(modelo, marca, color, fechaUltimoMantenimiento, estado);
        this.chasis = chasis;
    }

    public int getChasis() {
        return chasis;
    }

    public void setChasis(int chasis) {
        this.chasis = chasis;
    } 
    
    @Override
    public String toString() {
        String cadena = "chasis=" + chasis + ", marca=" + this.getMarca() + ", modelo=" + this.getModelo() + ", fechaUltimoMantenimiento=" + this.getFechaUltimoMantenimiento() + ", estado=" + this.getEstado();
        return cadena;
    }

}
