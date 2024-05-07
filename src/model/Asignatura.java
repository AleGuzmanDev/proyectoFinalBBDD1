package model;

import java.util.List;

public class Asignatura {

    public int codigoAsignatura;
    public String nombreAsignatura;
    public int creditos;
    public int horasSemanales;
    public String descripcion;
    public List<String> prerequisitos;

        public Asignatura(int codigoAsignatura, String nombreAsignatura, int creditos, int horasSemanales, String descripcion) {
        this.codigoAsignatura = codigoAsignatura;
        this.nombreAsignatura = nombreAsignatura;
        this.creditos = creditos;
        this.horasSemanales = horasSemanales;
        this.descripcion = descripcion;
        this.prerequisitos = null;
    }
}
