package model;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Evento {

    public int idEvento;
    public String nombreEvento;
    public Date fechaEvento;

    public boolean estado;

    public String descripcion;

    public List<String> organizadores;

    public Evento(int idEvento, String nombreEvento, Date fechaEvento, boolean estado, String descripcion, List<String> organizadores) {
        this.idEvento = idEvento;
        this.nombreEvento = nombreEvento;
        this.fechaEvento = fechaEvento;
        this.estado = estado;
        this.descripcion = descripcion;
        this.organizadores = organizadores;
    }

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public Date getFechaEvento() {
        return fechaEvento;
    }

    public void setFechaEvento(Date fechaEvento) {
        this.fechaEvento = fechaEvento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<String> getOrganizadores() {
        return organizadores;
    }

    public void setOrganizadores(List<String> organizadores) {
        this.organizadores = organizadores;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Evento evento = (Evento) o;
        return idEvento == evento.idEvento && Objects.equals(nombreEvento, evento.nombreEvento) && Objects.equals(fechaEvento, evento.fechaEvento) && Objects.equals(descripcion, evento.descripcion) && Objects.equals(organizadores, evento.organizadores);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEvento, nombreEvento, fechaEvento, descripcion, organizadores);
    }

    public String toString() {
        return "Evento{" +
                "idEvento=" + idEvento +
                ", nombreEvento=" + nombreEvento +
                ", fechaEvento=" + fechaEvento +
                ", descripcion=" + descripcion +
                ", organizadores=" + organizadores +
                '}';
    }
}
