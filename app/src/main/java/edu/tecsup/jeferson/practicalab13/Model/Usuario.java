package edu.tecsup.jeferson.practicalab13.Model;

/**
 * Created by Alumno on 13/11/2017.
 */

public class Usuario
{

    String username, password,nombres,correo,imagen,estado;

    public Usuario() {
    }

    public Usuario(String username, String password, String nombres, String correo, String imagen, String estado) {
        this.username = username;
        this.password = password;
        this.nombres = nombres;
        this.correo = correo;
        this.imagen = imagen;
        this.estado = estado;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
