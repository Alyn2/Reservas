
package Indentidad;

public class Usuario {
    
    private String nombre;
    private long idusuario;//no podra exister otor usuario con el mismo id.
    private String direccion;
    private String correo;
    private int celular;
    private String calificacion;    

    
    public Usuario(String nombre, long idusuario, String direccion, String correo, int celular, String calificacion) {
        this.nombre = nombre;
        this.idusuario = idusuario;
        this.direccion = direccion;
        this.correo = correo;
        this.celular = celular;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(long idusuario) {
        this.idusuario = idusuario;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }   

}
