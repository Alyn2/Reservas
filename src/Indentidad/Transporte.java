package Indentidad;

import java.time.LocalDate;

public class Transporte {

    private String placa;
    private String modelo;
    private String marca;
    private String color;
    private LocalDate fechaUltimoMantenimiento;
    private String estado;
    
    //El constructor
    public Transporte(String placa, String modelo, String marca, String color, LocalDate fechaUltimoMantenimiento, String estado) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.fechaUltimoMantenimiento = fechaUltimoMantenimiento;
        this.estado = estado;
    }
    
    //Constructor para la bicicleta
    public Transporte(String modelo, String marca, String color, LocalDate fechaUltimoMantenimiento, String estado) {
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.fechaUltimoMantenimiento = fechaUltimoMantenimiento;
        this.estado = estado;
    }
    
    public Transporte(){}

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalDate getFechaUltimoMantenimiento() {
        return fechaUltimoMantenimiento;
    }

    public void setFechaUltimoMantenimiento(LocalDate fechaUltimoMantenimiento) {
        this.fechaUltimoMantenimiento = fechaUltimoMantenimiento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
