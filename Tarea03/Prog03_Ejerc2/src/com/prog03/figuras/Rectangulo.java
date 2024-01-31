package com.prog03.figuras;

public class Rectangulo {

	private float base;
    private float altura;

    public Rectangulo() {}

    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getArea() {
        return base * altura;
    }

    public String toString() {
        return "Área: " + getArea() + ", Altura: " + altura;
    }

    public boolean isCuadrado() {
        return base == altura;
    }
}
