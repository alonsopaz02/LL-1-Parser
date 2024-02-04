package Analizadores;

import java.util.ArrayList;
import java.util.Scanner;

public class Lexico {
	
	public ArrayList<String> identificadores;
	public ArrayList<String> numerosEnteros;
	public ArrayList<String> numerosReales;
	public ArrayList<String> palabrasReservadas;
	public ArrayList<String> simbolos;
	public ArrayList<String> errores;
	public ArrayList<String> caracteres;
	public int[] codReserv;
	public int[] codSimb;
	String[] simbolosPermitidos = { "+", "-", "*", "/", "%", "y", "o", "=", "=/", "<", "</", ">", ">/", "(", ")",
			"[", "]", ",", ";", "{", "}", "\"", ":" };
	String[] palabrasReservada = { "sinretorno", "fun", "pro", "verdadero", "falso", "prin", "ente", "real",
			"logic", "carac", "konst", "ki", "kino", "kwitch", "kase", "kor", "kientras", "ingresar", "imprimir",
			"devuelve", "klase", "prin()", "conretorno" };
	
	public Lexico() {
		super();
		this.identificadores = new ArrayList<String>();
		this.numerosEnteros =new ArrayList<String>();
		this.numerosReales = new ArrayList<String>();
		this.palabrasReservadas = new ArrayList<String>();
		this.simbolos = new ArrayList<String>();
		this.errores = new ArrayList<String>();
		this.caracteres = new ArrayList<String>();
		codReserv = new int[40];
		codSimb = new int[30];
	}

	public String[] Analisis() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Entrada: ");
		String input = entrada.nextLine();

		String[] tokens = input.split("(?<=[^a-zA-Z0-9.'])|(?=[^a-zA-Z0-9.'])"); // Expresión regular para dividir
																					// en
																					// tokens
		String cadenaEntradaSeparada[] = new String[tokens.length];
		int indiceCadena = 0;
		for (int i = 0; i < tokens.length; i++) {
			if (tokens[i].isEmpty() || Character.isWhitespace(tokens[i].charAt(0))) {
				continue;
			} // Ignora los espacios en blanco y los tokens vacíos
			if (isPalabraReservada(tokens[i])) {
				if (!palabrasReservadas.contains(tokens[i])) {
					palabrasReservadas.add(tokens[i]);
				}
				cadenaEntradaSeparada[indiceCadena] = tokens[i];
				indiceCadena++;
			} else if (isCaracter(tokens[i])) {
				if (!caracteres.contains(tokens[i])) {
					caracteres.add(tokens[i]);
				}
				cadenaEntradaSeparada[indiceCadena] = "c";
				indiceCadena++;
			} else if (isIdentificador(tokens[i])) {
				if (!identificadores.contains(tokens[i])) {
					identificadores.add(tokens[i]);
				}
				cadenaEntradaSeparada[indiceCadena] = "id";
				indiceCadena++;

			} else if (isNumeroEntero(tokens[i])) {
				if (!numerosEnteros.contains(tokens[i])) {
					numerosEnteros.add(tokens[i]);
				}
				cadenaEntradaSeparada[indiceCadena] = "num";
				indiceCadena++;

			} else if (isNumeroReal(tokens[i])) {
				if (!numerosReales.contains(tokens[i])) {
					numerosReales.add(tokens[i]);
				}
				cadenaEntradaSeparada[indiceCadena] = "num";
				indiceCadena++;

			} else if (isSimbolo(tokens[i])) {
				if (!simbolos.contains(tokens[i])) {
					simbolos.add(tokens[i]);
				}
				cadenaEntradaSeparada[indiceCadena] = tokens[i];
				indiceCadena++;

			} else {
				if (tokens[i] != "" || tokens[i] != null) {

				}

			}

		}
		int longitudCadena = 0;
		for (int i = 0; i < cadenaEntradaSeparada.length; i++) {
			if (cadenaEntradaSeparada[i] != null) {
				longitudCadena = i + 2;
			}
		}
		String[] cadena = new String[longitudCadena];
		for (int i = 0; i < longitudCadena - 1; i++) {
			cadena[i] = cadenaEntradaSeparada[i];
		}
		cadena[longitudCadena - 1] = "$";
		return cadena;
	}

	public boolean isPalabraReservada(String token) {
		if (token == null || token.isEmpty()) {
			return false;
		}
		for(int i=0;i<palabrasReservada.length;i++) {
			codReserv[i]=200+i;
		}
		for (String palabraReservada : palabrasReservada) {
			if (palabraReservada.equals(token)) {
				return true;
			}
		}
		return false;
	}

	public boolean isIdentificador(String token) {
		if (token == null || token.isEmpty()) {
			return false;
		}

		// El primer carácter debe ser una letra
		if (!Character.isLetter(token.charAt(0))) {
			return false;
		}

		// Comprueba el resto de caracteres del token
		for (int i = 1; i < token.length(); i++) {
			char c = token.charAt(i);
			if (!Character.isLetterOrDigit(c) && c != '_') {
				return false;
			}
		}

		// Si no se han encontrado caracteres no válidos, devuelve true
		return true;
	}

	public boolean isNumeroEntero(String token) {
		if (token == null || token.isEmpty()) {
			return false;
		}

		// Verifica que el token esté compuesto sólo por dígitos
		for (int i = 0; i < token.length(); i++) {
			char c = token.charAt(i);
			if (!Character.isDigit(c)) {
				return false;
			}
		}

		// Si el token empieza por 0 y no es solo un 0, no es un número entero válido
		if (token.charAt(0) == '0' && token.length() > 1) {
			return false;
		}

		// Si no se han encontrado caracteres no válidos, devuelve true
		return true;
	}

	public boolean isNumeroReal(String token) {
		if (token == null || token.isEmpty()) {
			return false;
		}

		int count = 0; // contador de puntos en el token

		// Verifica que el token esté compuesto por dígitos y puntos
		for (int i = 0; i < token.length(); i++) {
			char c = token.charAt(i);
			if (!Character.isDigit(c) && c != '.') {
				return false;
			}
			if (c == '.') {
				count++;
			}
		}

		// Si el token empieza o termina por un punto, o contiene más de un punto, no es
		// un número real válido
		if (token.charAt(0) == '.' || token.charAt(token.length() - 1) == '.' || count > 1) {
			return false;
		}

		// Si no se han encontrado caracteres no válidos, devuelve true
		return true;
	}

	public boolean isSimbolo(String token) {
		if (token == null || token.isEmpty()) {
			return false;
		}
		for(int i=0;i<simbolosPermitidos.length;i++) {
			codSimb[i]=500+i;
		}

		for (String simbolo : simbolosPermitidos) {
			if (token.equals(simbolo)) {
				return true;
			}
		}

		return false;
	}

	public boolean isCadena(String token) {
		if (token == null || token.isEmpty()) {
			return false;
		}
		int length = token.length();
		if (length < 2 || token.charAt(0) != '"' || token.charAt(length - 1) != '"') {
			return false;
		}
		return true;
	}

	public boolean isCaracter(String token) {
		if (token == null || token.isEmpty()) {
			return false;
		}
		int length = token.length();
		if (length != 3 || token.charAt(0) != '\'' || token.charAt(2) != '\'') {
			return false;
		}
		return true;
	}

	public void imprimirTokens() {
		System.out.println("\n------Lista de Tokens------\n");

		if (!palabrasReservadas.isEmpty()) {
			System.out.println("Palabras Reservadas:");
			for (String token : palabrasReservadas) {
				for(int i=0;i<palabrasReservada.length;i++) {
					if(token.equals(palabrasReservada[i])) {
						System.out.println(token + "\t-----------\t" + (codReserv[i]));
					}
				}
			}
			System.out.println();
		}

		if (!identificadores.isEmpty()) {
			int ids=0;
			System.out.println("Identificadores:");
			for (String token : identificadores) {
				System.out.println(token + "\t-----------\t" + (100+ids));
				ids++;
			}
			System.out.println();
		}

		if (!numerosEnteros.isEmpty()) {
			System.out.println("Numeros Enteros:");
			int enteros = 0;
			for (String token : numerosEnteros) {
				System.out.println(token + "\t-----------\t" + (300+enteros));
				enteros++;
			}
			System.out.println();
		}

		if (!numerosReales.isEmpty()) {
			System.out.println("Numeros Reales:");
			int reales=0;
			for (String token : numerosReales) {
				System.out.println(token + "\t-----------\t" + (400 + reales));
				reales++;
			}
			System.out.println();
		}

		if (!simbolos.isEmpty()) {
			int simbs=0;
			System.out.println("Simbolos:");
			for (String token : simbolos) {
				for(int i=0;i<simbolosPermitidos.length;i++) {
					if(token.equals(simbolosPermitidos[i])) {
						System.out.println(token + "\t-----------\t" + (codSimb[i]));
					}
				}
			}
			System.out.println();
		}

		if (!caracteres.isEmpty()) {
			System.out.println("Caracter:");
			int caract=0;
			for (String token : caracteres) {
				System.out.println(token +  "\t-----------\t" + (caract));
				caract++;
			}
			System.out.println();
		}
	}

	
}