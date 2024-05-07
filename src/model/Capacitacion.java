package model;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Capacitacion {

    public int codigoPrograma;
    public List<Date> fechasSesiones;
    public List<String> tutores;

    public double costo;

    public Capacitacion(int codigoPrograma, List<Date> fechasSesiones, List<String> tutores, double costo) {
        this.codigoPrograma = codigoPrograma;
        this.fechasSesiones = fechasSesiones;
        this.tutores = tutores;
        this.costo = costo;
    }

    public int getCodigoPrograma() {
        return codigoPrograma;
    }

    public void setCodigoPrograma(int codigoPrograma) {
        this.codigoPrograma = codigoPrograma;
    }

    public List<Date> getFechasSesiones() {
        return fechasSesiones;
    }

    public void setFechasSesiones(List<Date> fechasSesiones) {
        this.fechasSesiones = fechasSesiones;
    }

    public List<String> getTutores() {
        return tutores;
    }

    public void setTutores(List<String> tutores) {
        this.tutores = tutores;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Capacitacion that = (Capacitacion) o;
        return codigoPrograma == that.codigoPrograma && Double.compare(that.costo, costo) == 0 && Objects.equals(fechasSesiones, that.fechasSesiones) && Objects.equals(tutores, that.tutores);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoPrograma, fechasSesiones, tutores, costo);
    }

    @Override
    public String toString() {
        return "Capacitacion{" +
                "codigoPrograma=" + codigoPrograma +
                ", fechasSesiones=" + fechasSesiones +
                ", tutores=" + tutores +
                ", costo=" + costo +
                '}';
    }
}