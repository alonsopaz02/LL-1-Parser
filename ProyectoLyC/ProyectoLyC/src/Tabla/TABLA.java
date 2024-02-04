package Tabla;

public class TABLA {
	String M[][] = new String[50][50];
	String produccion = "";

	public TABLA() { // se inicializa la tabla
		for (int i = 0; i < 50; i++)
			for (int j = 0; j < 50; j++)
				M[i][j] = " ";// primero se llena de blancos
		//Valores terminales
		M[0][1] = "klase";
		M[0][2] = "id";
		M[0][3] = "{";
		M[0][4] = "}";
		M[0][5] = "conretorno";
		M[0][6] = "(";
		M[0][7] = ")";
		M[0][8] = "sinretorno";
		M[0][9] = ",";
		M[0][10] = "devuelve";
		M[0][11] = ";";
		M[0][12] = "prin";
		M[0][13] = "[";
		M[0][14] = "]";
		M[0][15] = "=";
		M[0][16] = "ingresar";
		M[0][17] = "imprimir";
		M[0][18] = "fun";
		M[0][19] = "pro";
		M[0][20] = "ki";
		M[0][21] = "kino";
		M[0][22] = "kientras";
		M[0][23] = "konst";
		M[0][24] = "kor";
		M[0][25] = "ente";
		M[0][26] = "+";
		M[0][27] = "-";
		M[0][28] = "*";
		M[0][29] = "/";
		M[0][30] = "%";
		M[0][31] = ">";
		M[0][32] = "!";
		M[0][33] = "<";
		M[0][34] = "o";
		M[0][35] = "y";
		M[0][36] = "num";
		M[0][37] = "verdadero";
		M[0][38] = "falso";
		M[0][39] = "c";
		M[0][40] = "9";
		M[0][41] = "0";
		M[0][42] = "real";
		M[0][43] = "logic";
		M[0][44] = "carac";
		M[0][45] = ":";
		M[0][46] = "$";
		M[0][47] = "";
		M[0][48] = "";
		
		M[1][0] = "S";
		M[2][0] = "SA";
		M[3][0] = "FCP";
		M[4][0] = "CL";
		M[5][0] = "ATBS";
		M[6][0] = "MTS";
		M[7][0] = "MT";
		M[8][0] = "CFUN";
		M[9][0] = "CPROC";
		M[10][0] = "PMTS";
		M[11][0] = "PMT";
		M[12][0] = "RET";
		M[13][0] = "SB";
		M[14][0] = "INST";
		M[15][0] = "INS";
		M[16][0] = "DCL";
		M[17][0] = "TDCL";
		M[18][0] = "DCLA";
		M[19][0] = "EOV";
		M[20][0] = "IDS";
		M[21][0] = "ASG";
		M[22][0] = "IN";
		M[23][0] = "OUT";
		M[24][0] = "LFUN";
		M[25][0] = "LPROC";
		M[26][0] = "IF";
		M[27][0] = "WH";
		M[28][0] = "CTE";
		M[29][0] = "FOR";
		M[30][0] = "ARGS";
		M[31][0] = "VL";
		M[32][0] = "EXP";
		M[33][0] = "EXPS";
		M[34][0] = "EXPA";
		M[35][0] = "EXPB";
		M[36][0] = "EXPC";
		M[37][0] = "EXPD";
		M[38][0] = "EXPE";
		M[39][0] = "EXPF";
		M[40][0] = "EXPG";
		M[41][0] = "EXPH";
		M[42][0] = "VLEXP";
		M[43][0] = "CR";
		M[44][0] = "NUM";
		M[45][0] = "INT";
		M[46][0] = "TD";
		M[47][0] = "ID";
		M[48][0] = "IDOB";
		
		
		//
		M[1][1] = "SB SA ";
		M[2][1] = "SA FCP ";
		M[3][1] = "CL ";
		M[4][1] = "} MTS ATBS { id klase ";
		M[5][1] = "&";
		
		//
		M[14][2] = "INST INS ";
		M[15][2] = "; ASG ";
		M[21][2] = "VL = ID ";
		M[30][2] = "ARGS VL ";
		M[31][2] = "EXP ";
		M[32][2] = "EXPS EXPA ";
		M[33][2] = "&";
		M[34][2] = "EXPB EXPC ";
		M[35][2] = "&";
		M[36][2] = "EXPD EXPE ";
		M[37][2] = "&";
		M[38][2] = "EXPF EXPG ";
		M[39][2] = "&";
		M[40][2] = "EXPH VLEXP ";
		M[41][2] = "&";
		M[42][2] = "id ";
		M[47][2] = "IDOB id ";
		
		
		//}
		M[5][4] = "&";
		M[6][4] = "&";
		M[14][4] = "&";
		
		//conretorno
		M[1][5] = "SB SA ";
		M[2][5] = "SA FCP ";
		M[3][5] = "CFUN ";
		M[5][5] = "&";
		M[6][5] = "MTS MT ";
		M[7][5] = "CFUN ";
		M[8][5] = "} RET INST { ) PMTS ( id TD conretorno ";
		
		//(
		M[30][6] = "ARGS VL ";
		M[31][6] = "EXP ";
		M[32][6] = "EXPS EXPA ";
		M[33][6] = "&";
		M[34][6] = "EXPB EXPC ";
		M[35][6] = "&";
		M[36][6] = "EXPD EXPE ";
		M[37][6] = "&";
		M[38][6] = "EXPF EXPG ";
		M[39][6] = "&";
		M[40][6] = "EXPH VLEXP ";
		M[41][6] = "&";
		M[42][6] = ") EXP ( ";
		M[48][6] = "&";
		
		//)
		M[10][7] = "&";
		M[30][7] = "&";
		M[33][7] = "&";
		M[35][7] = "&";
		M[37][7] = "&";
		M[39][7] = "&";
		M[41][7] = "&";
		M[48][7] = "&";
		
		//sinretorno
		M[1][8] = "SB SA ";
		M[2][8] = "SA FCP ";
		M[3][8] = "CPROC ";
		M[5][8] = "&";
		M[6][8] = "MTS MT ";
		M[7][8] = "CPROC ";
		M[9][8] = "} INST { ) PMTS ( id sinretorno ";
		
		//,
		M[11][9] ="PMTS id TD , ";
		M[17][9] ="IDS ";
		M[20][9] ="IDS id , ";
		M[30][9] ="ARGS VL , ";
		M[33][9] ="&";
		M[35][9] ="&";
		M[37][9] ="&";
		M[39][9] ="&";
		M[41][9] ="&";
		
		//devuelve
		M[12][10] = "; VL devuelve ";
		M[14][10] = "&";
		
		//;
		M[17][11] = "IDS ";
		M[20][11] = "&";
		M[33][11] = "&";
		M[35][11] = "&";
		M[37][11] = "&";
		M[39][11] = "&";
		M[41][11] = "&";
		
		//prin
		M[1][12] = "SB SA ";
		M[2][12] = "&";
		M[5][12] = "&";
		M[13][12] = "} INST { prin ";
		
		//[
		M[17][13] = "DCLA ";
		M[17][13] = "] EOV [ ";
		
		//
		M[19][14] = "&";
		
		//
		M[37][15] = "EXPD EXPE = = ";
		M[39][15] = "&";
		M[41][15] = "&";
		M[48][15] = "&";
		
		//
		M[14][16] = "INST INS ";
		M[15][16] = "; IN ";
		M[22][16] = ") ID ( ingresar ";
		
		//
		M[14][17] = "INST INS ";
		M[15][17] = "; OUT ";
		M[23][17] = ") VL ( imprimir ";
		
		//
		M[24][18] = ") ARGS ( ID fun ";
		M[30][18] = "ARGS VL ";
		M[31][18] = "LFUN ";
		M[33][18] = "&";
		M[35][18] = "&";
		M[37][18] = "&";
		M[39][18] = "&";
		M[41][18] = "&";
		
		//
		M[14][19] = "INST INS ";
		M[15][19] = "; LPROC ";
		M[25][19] = ") ARGS ( ID pro ";
		
		//
		M[14][20] = "INST INS ";
		M[15][20] = "IF ";
		M[26][20] = "} INST { kino } INST { ) VL ( ki ";
		
		//no hay 21
		
		//
		M[14][22] = "INST INS ";
		M[15][22] = "WH ";
		M[27][22] = "} INST { ) EXP ( kientras ";
		
		//
		M[14][23] = "INST INS ";
		M[15][23] = "; CTE ";
		M[28][23] = "id TD konst ";
		
		//
		M[14][24] = "INST INS ";
		M[15][24] = "FOR ";
		M[29][24] = "} INST { ) ASG ; EXP ; num = ID ente ( kor ";
		
		//
		M[5][25] = "ATBS DCL ";
		M[10][25] = "PMT id TD ";
		M[14][25] = "INST INS ";
		M[15][25] = "DCL ";
		M[16][25] = "; TDCL id TD ";
		M[46][25] = "ente ";
		
		//
		M[33][26] = "EXPS EXPA + ";
		M[35][26] = "&";
		M[37][26] = "&";
		M[39][26] = "&";
		M[41][26] = "&";
		
		//
		M[33][27] = "EXPS EXPA - ";
		M[35][27] = "&";
		M[37][27] = "&";
		M[39][27] = "&";
		M[41][27] = "&";
		
		//
		M[35][28] = "EXPB EXPC * ";
		M[37][28] = "&";
		M[39][28] = "&";
		M[41][28] = "&";
		
		//
		M[35][29] = "EXPB EXPC / ";
		M[37][29] = "&";
		M[39][29] = "&";
		M[41][29] = "&";
		
		//
		M[35][30] = "EXPB EXPC % ";
		M[37][30] = "&";
		M[39][30] = "&";
		M[41][30] = "&";
		
		//
		M[37][31] = "EXPD EXPE > ";
		M[39][31] = "&";
		M[41][31] = "&";
		
		//
		M[37][32] = "EXPD EXPE = ! ";
		M[39][32] = "&";
		M[41][32] = "&"; 
		
		//
		M[37][33] = "EXPD EXPE < ";
		M[39][33] = "&";
		M[41][33] = "&";
		
		//
		M[37][34] = "EXPD EXPE < ";
	    M[39][34] = "EXPG EXPF o ";
	    M[37][34] =	"&";
	    
	    //
	    M[41][35] = "EXPH VLEXP y ";
	   
	    //
	    M[30][36] = "ARGS VL ";
	    M[31][36] = "EXP ";
	    M[32][36] = "EXPS EXPA ";
	    M[33][36] = "&";
	    M[34][36] = "EXPB EXPC ";
	    M[35][36] = "&";
	    M[36][36] = "EXPD EXPE ";
	    M[37][36] = "&";
	    M[38][36] = "EXPF EXPG ";
	    M[39][36] = "&";
	    M[40][36] = "EXPH VLEXP ";
	    M[41][36] = "&";
	    M[42][36] = "num ";
	    
	    //
	    M[30][37] = "ARGS VL ";
	    M[31][37] = "EXP ";
	    M[32][37] = "EXPS EXPA ";
	    M[33][37] = "&";
	    M[34][37] = "EXPB EXPC ";
	    M[35][37] = "&";
	    M[36][37] = "EXPD EXPE ";
	    M[37][37] = "&";
	    M[38][37] = "EXPF EXPG ";
	    M[39][37] = "&";
	    M[40][37] = "EXPH VLEXP ";
	    M[41][37] = "&";
	    M[42][37] = "verdadero ";
		
		//
		M[1][46] = "SB SA ";
		
		//
		M[48][45] = "id : ";
		
		//
		M[5][44] = "ATBS DCL ";
		M[10][44] = "PMT id TD ";
		M[14][44] = "INST INS ";
		M[15][44] = "DCL ";
		M[16][44] = "; TDCL id TD ";
		M[46][44] = "carac ";
		
		//
		M[5][43] = "ATBS DCL ";
		M[10][43] = "PMT id TD ";
		M[14][43] = "INST INS ";
		M[15][43] = "DCL ";
		M[16][43] = "; TDCL id TD ";
		M[46][43] = "logic ";
		
		//
		M[5][42] = "ATBS DCL ";
		M[10][42] = "PMT id TD ";
		M[14][42] = "INST INS ";
		M[15][42] = "DCL ";
		M[16][42] = "; TDCL id TD ";
		M[46][42] = "real ";
		
		//
		M[19][41] = "INT ";
		M[45][41] = "0 ";
		
		//
		M[44][40] = "9 ";
		
		//
		M[30][39] = "ARGS VL ";
		M[31][39] = "CR ";
		M[33][39] = "&";
		M[35][39] = "&";
		M[37][39] = "&";
		M[39][39] = "&";
		M[41][39] = "&";
		M[43][39] = "c ";
		
		//
		M[30][38] = "ARGS VL ";
		M[31][38] = "EXP ";
		M[32][38] = "EXPS EXPA ";
		M[33][38] = "&";
		M[34][38] = "EXPB EXPC ";
		M[35][38] = "&";
		M[36][38] = "EXPD EXPE ";
		M[37][38] = "&";
		M[38][38] = "EXPF EXPG ";
		M[39][38] = "&";
		M[40][38] = "EXPH VLEXP ";
		M[41][38] = "&";
		M[42][38] = "falso ";
		
		
		
		
		
		
		
	}

	public boolean Terminal(String car) {
		for (int i = 1; i < 50; i++) {
			if (M[0][i].equals(car)) {
				return true;
			}
		}
		return false;
	}

	public String RetProduccion() {
		return produccion;
	}
	
	public String invert(String input) {
        String[] words = input.split(" ");
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }

        return reversed.toString().trim();
    }
	
	public boolean ExisteInterseccion(String XX, String ae) {
		int i, x = 0, y = 0;
		for (i = 1; i < 50; i++)
			if (M[0][i].equals(ae))
				x = i;
		for (i = 1; i < 50; i++)
			if (M[i][0].equals(XX))
				y = i;
		if (x == 0 || y == 0)
			return false;
		else if (M[y][x].equals(" "))
			return false;
		else {
			produccion = M[y][x];
			return true;
		}
	}
} // FIN DE CLASE TABLA