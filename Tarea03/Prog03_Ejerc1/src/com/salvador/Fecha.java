package com.salvador;

public class Fecha {
    public enum enumMes {
        ENERO, FEBRERO, MARZO, ABRIL, MAYO, JUNIO, JULIO, AGOSTO, SEPTIEMBRE, OCTUBRE, NOVIEMBRE, DICIEMBRE
    }

    private int dia;
    private enumMes mes;
    private int anio;
    
    public Fecha() {}

    public Fecha(enumMes mes) {
        this.dia = 0;
        this.mes = mes;
        this.anio = 0;
    }

    public Fecha(int dia, enumMes mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public enumMes getMes() {
        return mes;
    }

    public void setMes(enumMes mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public boolean isSummer() {
        return (mes == enumMes.JUNIO || mes == enumMes.JULIO || mes == enumMes.AGOSTO);
    }

    public String toString() {
        return dia + " de " + mes + " de " + anio;
    }    
}
