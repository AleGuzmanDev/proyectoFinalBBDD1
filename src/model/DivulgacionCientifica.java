package model;

import java.util.Date;
import java.util.Objects;

public class DivulgacionCientifica {

    public int codigoPublicacion;
    public String titulo;
    public Date fechaPublicacion;

    public String descripcion;

    public DivulgacionCientifica(int codigoPublicacion, String titulo, Date fechaPublicacion, String descripcion) {
        this.codigoPublicacion = codigoPublicacion;
        this.titulo = titulo;
        this.fechaPublicacion = fechaPublicacion;
        this.descripcion = descripcion;
    }

    public int getCodigoPublicacion() {
        return codigoPublicacion;
    }

    public void setCodigoPublicacion(int codigoPublicacion) {
        this.codigoPublicacion = codigoPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DivulgacionCientifica that = (DivulgacionCientifica) o;
        return codigoPublicacion == that.codigoPublicacion && Objects.equals(titulo, that.titulo) && Objects.equals(fechaPublicacion, that.fechaPublicacion) && Objects.equals(descripcion, that.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoPublicacion, titulo, fechaPublicacion, descripcion);
    }

    @Override
    public String toString() {
        return "DivulgacionCientifica{" +
                "codigoPublicacion=" + codigoPublicacion +
                ", titulo='" + titulo + '\'' +
                ", fechaPublicacion=" + fechaPublicacion +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }


}
