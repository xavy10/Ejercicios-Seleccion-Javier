package modelo;

import java.util.Scanner;

public class Principal {
	
	public static void main(String args[]) {
		String entrada = "";
		String salida = "";
		int tam = 0;
		Scanner scanner = new Scanner(System.in);
		int numero = 0;
		String repetir = "";
		do {
			System.out.print("Ingrese el número que quiere convertir:  ");
			entrada = scanner.nextLine();
			entrada = entrada.trim();
			try {
				numero = Integer.parseInt(entrada);
				if(numero>0  && numero<=1000){
					tam = entrada.length();
					switch (tam) {
					case 1:
						entrada = "00"+entrada;
						break;
					case 2:
						entrada = "0"+entrada;
						break;
					default:
						break;
					}
					
					if(numero==1000) {
						System.out.println("El resultado es: M");
					}else {
						salida += convertirCentenas(entrada.charAt(0));
						salida += convertirDecenas(entrada.charAt(1));
						salida += convertirUnidades(entrada.charAt(2));
						System.out.println("El resultado es: "+salida);
					}
				}else {
					System.out.println("Ingrese un numero entre 1 y 1000");
				}
			} catch (Exception e) {
				System.out.println("Ingresa un numero");
			}
			System.out.print("Quiere convertir otro numero (S/N): ");
			repetir = scanner.nextLine();
			salida = "";
		}while(repetir.equalsIgnoreCase("S"));
		
	}
	
	
	public static String convertirUnidades(char numero) {
		String salida = "";
		switch (numero) {
		case '1':
			salida = "I";
			break;
		case '2':
			salida = "II";
			break;
		case '3':
			salida = "III";
			break;
		case '4':
			salida = "IV";
			break;
		case '5':
			salida = "V";
			break;
		case '6':
			salida = "VI";
			break;
		case '7':
			salida = "VII";
			break;
		case '8':
			salida = "VIII";
			break;
		case '9':
			salida = "IX";
			break;

		default:
			salida = "";
			break;
		}
		return salida;
	}
	
	public static String convertirDecenas(char numero) {
		String salida = "";
		switch (numero) {
		case '1':
			salida = "X";
			break;
		case '2':
			salida = "XX";
			break;
		case '3':
			salida = "XXX";
			break;
		case '4':
			salida = "XL";
			break;
		case '5':
			salida = "L";
			break;
		case '6':
			salida = "LX";
			break;
		case '7':
			salida = "LXX";
			break;
		case '8':
			salida = "LXXX";
			break;
		case '9':
			salida = "XC";
			break;

		default:
			salida = "";
			break;
		}
		return salida;
	}
	
	public static String convertirCentenas(char numero) {
		String salida = "";
		switch (numero) {
		case '1':
			salida = "C";
			break;
		case '2':
			salida = "CC";
			break;
		case '3':
			salida = "CCC";
			break;
		case '4':
			salida = "CD";
			break;
		case '5':
			salida = "D";
			break;
		case '6':
			salida = "DC";
			break;
		case '7':
			salida = "DCC";
			break;
		case '8':
			salida = "DCCC";
			break;
		case '9':
			salida = "CM";
			break;

		default:
			salida = "";
			break;
		}
		return salida;
	}

}
