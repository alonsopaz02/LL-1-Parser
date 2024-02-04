package Analizadores;
import Tabla.*;

public class Sintactico {
	TABLA t = new TABLA();
	//TAS t = new TAS();
	String pila[] = new String[1000];
	String simboloAnalisis;
	int indicePila;
	public String entrada[];
	int indiceEntrada;
	
	public String lexema() {
		return entrada[indiceEntrada];
	}
	
	public Sintactico() {
		pila[0] ="$";
		pila[1] = "S";
		indicePila = 2;
		indiceEntrada = 0;
	}
	
	public void Empilar(String produccion) {
		String parteProduccion = "";
		for(int i=0;i<produccion.length();i++) {
			if(produccion.charAt(i)!=' ') {
				parteProduccion = parteProduccion + produccion.charAt(i);
			}
			else {
				pila[indicePila]=parteProduccion;
				indicePila++;
				parteProduccion = "";
			}
		}
	}
	
	String RetPila() {
		String CadPila = "";
		for (int j = 0; j < indicePila; j++)
			CadPila = CadPila + " " + pila[j];
		return CadPila;
	}
	
	String RetCad() {
		String temp = "";
		int j;
		for (j = indiceEntrada; j < entrada.length; j++) {
			temp = temp +" "+ entrada[j];
		}
		return temp;
	}
	
	void error() {
		System.out.println(" error de sintaxis");
		System.exit(0);
	}
	
	public void AnalizadorSintactico() {
		String XX;
		String produccion;
		do {
			simboloAnalisis = lexema();
			XX = pila[indicePila-1];
			if(t.Terminal(XX)) { //retorna 1 si XX es terminal
				indiceEntrada++;
				if(XX.equals(simboloAnalisis)) {
					indicePila = indicePila-1;
				} else {
					System.out.println("1");
					error();
				}
			} else if(t.ExisteInterseccion(XX,simboloAnalisis)){
				produccion = t.RetProduccion();
				System.out.println("|Pila:" + RetPila() + " |Cadena:" + RetCad() + " |" + XX + "-->" + t.invert(produccion));
				indicePila = indicePila -1;
				if(!produccion.equals("&")) {
					Empilar(produccion);
				}
			} else {
				System.out.println("2");
				error();
			}
		}while(!XX.equals("$"));
	}
} // FIN DE PARSER