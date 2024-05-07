package model;

import java.util.List;
import java.util.Objects;

public class Colaboracion {

    public int idColaboracion;
    public List<String> objetivos;

    public List<String> actividades;

    public Colaboracion(int idColaboracion, List<String> objetivos, List<String> actividades) {
        this.idColaboracion = idColaboracion;
        this.objetivos = objetivos;
        this.actividades = actividades;
    }

    public int getIdColaboracion() {
        return idColaboracion;
    }

    public void setIdColaboracion(int idColaboracion) {
        this.idColaboracion = idColaboracion;
    }

    public List<String> getObjetivos() {
        return objetivos;
    }

    public void setObjetivos(List<String> objetivos) {
        this.objetivos = objetivos;
    }

    public List<String> getActividades() {
        return actividades;
    }

    public void setActividades(List<String> actividades) {
        this.actividades = actividades;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Colaboracion that = (Colaboracion) o;
        return idColaboracion == that.idColaboracion && Objects.equals(objetivos, that.objetivos) && Objects.equals(actividades, that.actividades);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idColaboracion, objetivos, actividades);
    }

    public String toString() {
        return "Colaboracion{" +
                "idColaboracion=" + idColaboracion +
                ", objetivos=" + objetivos +
                ", actividades=" + actividades +
                '}';
    }
}
