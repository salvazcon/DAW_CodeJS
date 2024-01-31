package com.prog03.principal;

import com.prog03.figuras.Rectangulo;

public class Principal {

	 public static void main(String[] args) {
		 Rectangulo objRectangulo1 = new Rectangulo();
		 System.out.println("Esto son los valores del rectangulo " + objRectangulo1.getAltura() + " " + objRectangulo1.getBase());
		 objRectangulo1.setAltura(2);
		 objRectangulo1.setBase(5);
		 System.out.println("Esto son los valores del rectangulo " + objRectangulo1.getAltura() + " " + objRectangulo1.getBase());
		 
		 Rectangulo objRectangulo2 = new Rectangulo(7, 3);
		 System.out.println(objRectangulo2.toString());		 
		 if (objRectangulo2.isCuadrado())
			 System.out.println("La figura es un cuadrado.");
		 else
			 System.out.println("La figura es un rectangulo.");
	 
		 Rectangulo objRectangulo3 = new Rectangulo(8, 8);
		 System.out.println(objRectangulo3.toString() + ", Base: " + objRectangulo3.getBase() + ".");	
		 if (objRectangulo3.isCuadrado())
			 System.out.println("La figura es un cuadrado.");
		 else
			 System.out.println("La figura es un rectangulo.");
	 }
}
