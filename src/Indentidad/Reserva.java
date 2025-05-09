
package Indentidad;

import java.time.LocalDate;
import java.util.Date;


public class Reserva {
    private int id;
    private Usuario usuario;
    private LocalDate fechainicio;
    private LocalDate fechafin;
    private String estado;
    private Autos auto;
    private Motos moto;
    private Bicicleta bicicleta;
    private LocalDate fechadeentrega;
    private String estadoFinalizacion;
    private String novedad;

    public Reserva(int id, Usuario usuario, LocalDate fechainicio, LocalDate fechafin, String estado, Autos auto, Motos moto, Bicicleta bicicleta, LocalDate fechadeentrega, String estadoFinalizacion, String novedad) {
        this.id = id;
        this.usuario = usuario;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
        this.estado = estado;
        this.auto = auto;
        this.moto = moto;
        this.bicicleta = bicicleta;
        this.fechadeentrega = fechadeentrega;
        this.estadoFinalizacion = estadoFinalizacion;
        this.novedad = novedad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDate getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(LocalDate fechainicio) {
        this.fechainicio = fechainicio;
    }

    public LocalDate getFechafin() {
        return fechafin;
    }

    public void setFechafin(LocalDate fechafin) {
        this.fechafin = fechafin;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Autos getAuto() {
        return auto;
    }

    public void setAuto(Autos auto) {
        this.auto = auto;
    }

    public Motos getMoto() {
        return moto;
    }

    public void setMoto(Motos moto) {
        this.moto = moto;
    }

    public Bicicleta getBicicleta() {
        return bicicleta;
    }

    public void setBicicleta(Bicicleta bicicleta) {
        this.bicicleta = bicicleta;
    }

    public LocalDate getFechadeentrega() {
        return fechadeentrega;
    }

    public void setFechadeentrega(LocalDate fechadeentrega) {
        this.fechadeentrega = fechadeentrega;
    }

    public String getEstadoFinalizacion() {
        return estadoFinalizacion;
    }

    public void setEstadoFinalizacion(String estadoFinalizacion) {
        this.estadoFinalizacion = estadoFinalizacion;
    }

    public String getNovedad() {
        return novedad;
    }

    public void setNovedad(String novedad) {
        this.novedad = novedad;
    }

    @Override
    public String toString() {
        return "id=" + id + ", usuario=" + usuario + ", fechainicio=" + fechainicio + ", fechafin=" + fechafin + ", estado=" + estado + ", auto=" + auto + ", moto=" + moto + ", bicicleta=" + bicicleta + ", fechadeentrega=" + fechadeentrega + ", estadoFinalizacion=" + estadoFinalizacion + ", novedad=" + novedad;
    }
 
}
