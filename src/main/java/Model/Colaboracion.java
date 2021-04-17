/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Colaboracion {
    
    private int id;
    private String nombre;
    private String apellido;
    private String correo;
    private String passw;

    public Colaboracion(String nombre, String apellido, String correo, String passw) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.passw = passw;
    }

    public Colaboracion() {
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getPassw() {
        return passw;
    }

    public void setPassw(String passw) {
        this.passw = passw;
    }
    
    

}
