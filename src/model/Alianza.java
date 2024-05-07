package model;

import java.util.List;
import java.util.Objects;

public class Alianza {

    public int codigoAlianza;
    public List<String> objetivos;
    public List<String> actividades;
    public String beneficiosEsperados;

    public Alianza(int codigoAlianza, List<String> objetivos) {
        this.codigoAlianza = codigoAlianza;
        this.objetivos = objetivos;
    }

    public int getCodigoAlianza() {
        return codigoAlianza;
    }

    public void setCodigoAlianza(int codigoAlianza) {
        this.codigoAlianza = codigoAlianza;
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

    public String getBeneficiosEsperados() {
        return beneficiosEsperados;
    }

    public void setBeneficiosEsperados(String beneficiosEsperados) {
        this.beneficiosEsperados = beneficiosEsperados;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alianza alianza = (Alianza) o;
        return codigoAlianza == alianza.codigoAlianza && Objects.equals(objetivos, alianza.objetivos) && Objects.equals(actividades, alianza.actividades) && Objects.equals(beneficiosEsperados, alianza.beneficiosEsperados);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoAlianza, objetivos, actividades, beneficiosEsperados);
    }

    @Override
    public String toString() {
        return "Alianza{" +
                "codigoAlianza=" + codigoAlianza +
                ", objetivos=" + objetivos +
                ", actividades=" + actividades +
                ", beneficiosEsperados='" + beneficiosEsperados + '\'' +
                '}';
    }
}
