package Modelo;
public class clienteVo {

    private int idcliente;
    private String nombre;
    private String colonia;
    private String calle;
    private String num_casa;
    private String telefono;
    private String correo;

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    private int id_trabajador;

    public int getIdcliente() {
        return idcliente;
    }
    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getColonia() {
        return colonia;
    }
    public void setColonia(String colonia) {
        this.colonia = colonia;
    }
    public String getCalle() {
        return calle;
    }
    public void setCalle(String calle) {
        this.calle = calle;
    }
    public String getNum_casa() {
        return num_casa;
    }
    public void setNum_casa(String num_casa) {
        this.num_casa = num_casa;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public int getId_trabajador() {
        return id_trabajador;
    }
    public void setId_trabajador(int id_trabajador) {
        this.id_trabajador = id_trabajador;
    }
     
}
