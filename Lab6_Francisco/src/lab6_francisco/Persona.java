
package lab6_francisco;

import java.util.*;


public class Persona {
    private String nombre;
    private String apellido;
    private String correo;
    private Date fechaN;
    private String pais;
    private String telefono;
    private String contraseña;
    private ArrayList<Buzon>leido;
    private ArrayList<Buzon>noleido;
    private ArrayList<Buzon>borradores;
    private ArrayList<Buzon>spam;
    private ArrayList<Buzon>enviado;
    private ArrayList<Buzon>eliminado;
    private ArrayList<Buzon>importante;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String correo, Date fechaN, String pais, String telefono, String contraseña) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.fechaN = fechaN;
        this.pais = pais;
        this.telefono = telefono;
        this.contraseña = contraseña;
    }
    

    public Persona(String nombre, String apellido, String correo, Date fechaN, String pais, String telefono, String contraseña, ArrayList<Buzon> leido, ArrayList<Buzon> noleido, ArrayList<Buzon> borradores, ArrayList<Buzon> spam, ArrayList<Buzon> enviado, ArrayList<Buzon> eliminado, ArrayList<Buzon> importante) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.fechaN = fechaN;
        this.pais = pais;
        this.telefono = telefono;
        this.contraseña = contraseña;
        this.leido = leido;
        this.noleido = noleido;
        this.borradores = borradores;
        this.spam = spam;
        this.enviado = enviado;
        this.eliminado = eliminado;
        this.importante = importante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Date getFechaN() {
        return fechaN;
    }

    public void setFechaN(Date fechaN) {
        this.fechaN = fechaN;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public ArrayList<Buzon> getLeido() {
        return leido;
    }

    public void setLeido(ArrayList<Buzon> leido) {
        this.leido = leido;
    }

    public ArrayList<Buzon> getNoleido() {
        return noleido;
    }

    public void setNoleido(ArrayList<Buzon> noleido) {
        this.noleido = noleido;
    }

    public ArrayList<Buzon> getBorradores() {
        return borradores;
    }

    public void setBorradores(ArrayList<Buzon> borradores) {
        this.borradores = borradores;
    }

    public ArrayList<Buzon> getSpam() {
        return spam;
    }

    public void setSpam(ArrayList<Buzon> spam) {
        this.spam = spam;
    }

    public ArrayList<Buzon> getEnviado() {
        return enviado;
    }

    public void setEnviado(ArrayList<Buzon> enviado) {
        this.enviado = enviado;
    }

    public ArrayList<Buzon> getEliminado() {
        return eliminado;
    }

    public void setEliminado(ArrayList<Buzon> eliminado) {
        this.eliminado = eliminado;
    }

    public ArrayList<Buzon> getImportante() {
        return importante;
    }

    public void setImportante(ArrayList<Buzon> importante) {
        this.importante = importante;
    }
    
    
}
