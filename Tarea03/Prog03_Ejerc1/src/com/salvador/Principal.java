package com.salvador;

import com.salvador.Fecha.enumMes;

public class Principal {

    public static void main(String[] args) {
        Fecha objFecha1 = new Fecha(enumMes.JUNIO);
        objFecha1.setDia(20);
        objFecha1.setAnio(2000);
        System.out.println("Fecha objFecha1: " + objFecha1);

        String mensajeVerano1 = (objFecha1.isSummer()) ? "Es verano." : "No es verano.";
        System.out.println(mensajeVerano1);

        Fecha objFecha2 = new Fecha(10, enumMes.NOVIEMBRE, 2023);
        System.out.println("Año de objFecha2: " + objFecha2.getAnio());
        System.out.println("Fecha objFecha2: " + objFecha2);

        String mensajeVerano2 = (objFecha2.isSummer()) ? "Es verano." : "No es verano.";
        System.out.println(mensajeVerano2);
    }
}
