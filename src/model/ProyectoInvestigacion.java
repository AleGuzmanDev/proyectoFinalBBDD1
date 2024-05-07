package model;

import java.util.List;
import java.util.Objects;

public class ProyectoInvestigacion {

    public int codigoProyecto;
    public String tituloProyecto;

    public List<String> objetivos;
    public String descripcion;

    public String contenido;
    public String metodologia;

    public String resultados;

    public ProyectoInvestigacion(int codigoProyecto, String tituloProyecto, List<String> objetivos, String descripcion, String contenido, String metodologia, String resultados) {
        this.codigoProyecto = codigoProyecto;
        this.tituloProyecto = tituloProyecto;
        this.objetivos = objetivos;
        this.descripcion = descripcion;
        this.contenido = contenido;
        this.metodologia = metodologia;
        this.resultados = resultados;
    }

    public int getCodigoProyecto() {
        return codigoProyecto;
    }

    public void setCodigoProyecto(int codigoProyecto) {
        this.codigoProyecto = codigoProyecto;
    }

    public String getTituloProyecto() {
        return tituloProyecto;
    }

    public void setTituloProyecto(String tituloProyecto) {
        this.tituloProyecto = tituloProyecto;
    }

    public List<String> getObjetivos() {
        return objetivos;
    }

    public void setObjetivos(List<String> objetivos) {
        this.objetivos = objetivos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getMetodologia() {
        return metodologia;
    }

    public void setMetodologia(String metodologia) {
        this.metodologia = metodologia;
    }

    public String getResultados() {
        return resultados;
    }

    public void setResultados(String resultados) {
        this.resultados = resultados;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProyectoInvestigacion that = (ProyectoInvestigacion) o;
        return codigoProyecto == that.codigoProyecto && Objects.equals(tituloProyecto, that.tituloProyecto) && Objects.equals(objetivos, that.objetivos) && Objects.equals(descripcion, that.descripcion) && Objects.equals(contenido, that.contenido) && Objects.equals(metodologia, that.metodologia) && Objects.equals(resultados, that.resultados);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoProyecto, tituloProyecto, objetivos, descripcion, contenido, metodologia, resultados);
    }

    @Override
    public String toString() {
        return "ProyectoInvestigacion{" +
                "codigoProyecto=" + codigoProyecto +
                ", tituloProyecto='" + tituloProyecto + '\'' +
                ", objetivos=" + objetivos +
                ", descripcion='" + descripcion + '\'' +
                ", contenido='" + contenido + '\'' +
                ", metodologia='" + metodologia + '\'' +
                ", resultados='" + resultados + '\'' +
                '}';
    }
}
