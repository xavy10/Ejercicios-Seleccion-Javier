package modelo;

import java.util.Scanner;
import java.util.StringTokenizer;

import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;

public class Principal {
	
	public static void main(String args[]) {
		String salida = "";
		Scanner scanner = new Scanner(System.in);
		String repetir = "";
		String entrada = "";
		String morse = "";
		//Para que funcione mas de una vez
		do {
			System.out.print("Ingrese la cadena que quiere convertir: ");
			entrada = scanner.nextLine();
			entrada = entrada.trim();
			entrada = entrada.toUpperCase();
			if(esMorse(entrada)) {
				System.out.println(entrada);
				for (int i = 0; i < entrada.length(); i++) {
					if(entrada.charAt(i)==' ') {
						if(entrada.charAt(i+1)==' ') {
							salida+= morseANormal(morse)+" ";
							i = i+2;
							morse="";
						}else {
							salida+= morseANormal(morse);
							morse="";
						}
					}else {
						morse +=entrada.charAt(i);
					}
					if(morse!="" && i == entrada.length()-1) {
						salida+= morseANormal(morse);
					}
				}
			}else {
				for (int i = 0; i < entrada.length(); i++) {
					if(entrada.charAt(i)==' ') {
						salida += "  ";
					}else {
						salida += nomalAMorse(entrada.charAt(i))+" ";
					}
				}
			}
			System.out.println("El resultado de la conversion es: "+salida);
			System.out.print("Desea convertir otra cadena: (S/N):  ");
			repetir = scanner.nextLine();
			salida = "";
			morse = "";
		}while(repetir.equalsIgnoreCase("S"));
	}
	
	public static boolean esMorse(String entrada) {
		if (entrada.contains("A") || entrada.contains("E") || entrada.contains("I") || entrada.contains("O") || entrada.contains("U")) {
			return false;
		}else {
			return true;
		}
	}
	
	public static String nomalAMorse(char caracter) {
		String salida = "";
		switch (caracter) {
		case 'A':
			salida = ".-";
			break;
		case 'B':
			salida = "-...";
			break;
		case 'C':
			salida = "-.-.";
			break;
		case 'D':
			salida = "-..";
			break;
		case 'E':
			salida = ".";
			break;
		case 'F':
			salida = "..-.";
			break;
		case 'G':
			salida = "--.";
			break;
		case 'H':
			salida = "....";
			break;
		case 'I':
			salida = "..";
			break;
		case 'J':
			salida = ".---";
			break;
		case 'K':
			salida = "-.-";
			break;
		case 'L':
			salida = ".-..";
			break;
		case 'M':
			salida = "--";
			break;
		case 'N':
			salida = "-.";
			break;
		case 'O':
			salida = "---";
			break;
		case 'P':
			salida = ".--.";
			break;
		case 'Q':
			salida = "--.-";
			break;
		case 'R':
			salida = ".-.";
			break;
		case 'S':
			salida = "...";
			break;
		case 'T':
			salida = "-";
			break;
		case 'U':
			salida = "..-";
			break;
		case 'V':
			salida = "...-";
			break;
		case 'W':
			salida = ".--";
			break;
		case 'X':
			salida = "-..-";
			break;
		case 'Y':
			salida = "-.--";
			break;
		case 'Z':
			salida = "--..";
			break;
		case '1':
			salida = ".----";
			break;
		case '2':
			salida = "..---";
			break;
		case '3':
			salida = "...--";
			break;
		case '4':
			salida = "....-";
			break;
		case '5':
			salida = ".....";
			break;
		case '6':
			salida = "-....";
			break;
		case '7':
			salida = "--...";
			break;
		case '8':
			salida = "---..";
			break;
		case '9':
			salida = "----.";
			break;
		case '0':
			salida = "-----";
			break;
		}
		return salida;
	}
	
	public static String morseANormal(String morse) {
		String salida = "";
		switch (morse) {
		case ".-":
			salida = "A" ;
			break;
		case "-...":
			salida = "B";
			break;
		case "-.-.":
			salida = "C" ;
			break;
		case "-..":
			salida = "D";
			break;
		case ".":
			salida = "E" ;
			break;
		case "..-.":
			salida = "F";
			break;
		case "--.":
			salida = "G";
			break;
		case "....":
			salida = "H";
			break;
		case "..":
			salida = "I";
			break;
		case ".---":
			salida = "J";
			break;
		case "-.-":
			salida = "K";
			break;
		case ".-..":
			salida = "L";
			break;
		case "--":
			salida = "M";
			break;
		case "-.":
			salida = "N";
			break;
		case "---":
			salida = "O";
			break;
		case ".--.":
			salida = "P";
			break;
		case "--.-":
			salida = "Q";
			break;
		case ".-.":
			salida = "R";
			break;
		case "...":
			salida = "S";
			break;
		case "-":
			salida = "T";
			break;
		case "..-":
			salida = "U";
			break;
		case "...-":
			salida = "V";
			break;
		case ".--":
			salida = "W";
			break;
		case "-..-":
			salida = "X";
			break;
		case "-.--":
			salida = "Y";
			break;
		case "--..":
			salida = "Z";
			break;
		case ".----":
			salida = "1";
			break;
		case "..---":
			salida = "2";
			break;
		case "...--":
			salida = "3";
			break;
		case "....-":
			salida = "4";
			break;
		case ".....":
			salida = "5";
			break;
		case "-....":
			salida = "6";
			break;
		case "--...":
			salida = "7";
			break;
		case "---..":
			salida = "8";
			break;
		case "----.":
			salida = "9";
			break;
		case "-----":
			salida = "0";
			break;
		}
		return salida;
	}

}
