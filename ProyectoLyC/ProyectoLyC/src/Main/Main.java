package Main;

import Analizadores.*;

public class Main {
public static void main(String[] args) {
		
		
		
		Lexico l = new Lexico();
		Sintactico p = new Sintactico();
		p.entrada=l.Analisis();
		l.imprimirTokens();
		p.AnalizadorSintactico();
		System.out.println("\n CADENA ACEPTADA");
		

	}
}
