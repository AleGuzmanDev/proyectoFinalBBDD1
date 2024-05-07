package model;

import java.util.Objects;

public class Usuario  {


    public int idUsuario;
    public String nombres;
    public String apellidos;
    public String email;

    public String areaDeInteres;


    public Usuario(int idUsuario, String nombres, String apellidos, String email) {
        this.idUsuario = idUsuario;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;

    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAreaDeInteres() {
        return areaDeInteres;
    }

    public void setAreaDeInteres(String areaDeInteres) {
        this.areaDeInteres = areaDeInteres;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return idUsuario == usuario.idUsuario && Objects.equals(nombres, usuario.nombres) && Objects.equals(apellidos, usuario.apellidos) && Objects.equals(email, usuario.email) && Objects.equals(areaDeInteres, usuario.areaDeInteres);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUsuario, nombres, apellidos, email, areaDeInteres);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "idUsuario=" + idUsuario +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", email='" + email + '\'' +
                ", areaDeInteres='" + areaDeInteres + '\'' +
                '}';
    }
}
