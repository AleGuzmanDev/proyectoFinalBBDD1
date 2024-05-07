package model;

import java.util.Objects;

public class Universidad {

    public int nit;
    public String razonSocial;
    public String ubicacion;
    public String paginaWeb;

    public Universidad(int nit, String razonSocial) {
        this.nit = nit;
        this.razonSocial = razonSocial;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Universidad that = (Universidad) o;
        return nit == that.nit && Objects.equals(razonSocial, that.razonSocial) && Objects.equals(ubicacion, that.ubicacion) && Objects.equals(paginaWeb, that.paginaWeb);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nit, razonSocial, ubicacion, paginaWeb);
    }

    @Override
    public String toString() {
        return "Universidad{" +
                "nit=" + nit +
                ", razonSocial='" + razonSocial + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", paginaWeb='" + paginaWeb + '\'' +
                '}';
    }
}
