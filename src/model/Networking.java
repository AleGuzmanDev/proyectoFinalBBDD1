package model;

import java.util.List;
import java.util.Objects;

public class Networking {

    public int idNetworking;
    public List<String> gruposDeInteres;
    public List<String> proyectos;
    public String areaExpertise;


    public Networking(int idNetworking, List<String> gruposDeInteres) {
        this.idNetworking = idNetworking;
        this.gruposDeInteres = gruposDeInteres;
    }

    public int getIdNetworking() {
        return idNetworking;
    }

    public void setIdNetworking(int idNetworking) {
        this.idNetworking = idNetworking;
    }

    public List<String> getGruposDeInteres() {
        return gruposDeInteres;
    }

    public void setGruposDeInteres(List<String> gruposDeInteres) {
        this.gruposDeInteres = gruposDeInteres;
    }

    public List<String> getProyectos() {
        return proyectos;
    }

    public void setProyectos(List<String> proyectos) {
        this.proyectos = proyectos;
    }

    public String getAreaExpertise() {
        return areaExpertise;
    }

    public void setAreaExpertise(String areaExpertise) {
        this.areaExpertise = areaExpertise;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Networking that = (Networking) o;
        return idNetworking == that.idNetworking && Objects.equals(gruposDeInteres, that.gruposDeInteres) && Objects.equals(proyectos, that.proyectos) && Objects.equals(areaExpertise, that.areaExpertise);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idNetworking, gruposDeInteres, proyectos, areaExpertise);
    }


    @Override
    public String toString() {
        return "Networking{" +
                "idNetworking=" + idNetworking +
                ", gruposDeInteres=" + gruposDeInteres +
                ", proyectos=" + proyectos +
                ", areaExpertise='" + areaExpertise + '\'' +
                '}';
    }
}
