package modelo;

import java.util.Scanner;

public class Principal {
	
	public static double lado;
	public static String lad;
	public static Cubo cubo;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String opcionS = "";
		lad = "";
		int opcionSecundaria = 0;
		lado = 0;
		cubo = new Cubo();
		try {
			System.out.print("Ingresa la medida del lado: ");
			lad = scanner.nextLine();
			lado = Double.parseDouble(lad);
			cubo.setLado(lado);
			do {
				System.out.println("Seleccione una opcion:\n1)Calcular el perimetro\n2)Calcular el area\n3)Calcular el volumen\n4)Cancelar\n5)Salir");
				opcionS = scanner.nextLine();
				opcionSecundaria = Integer.parseInt(opcionS);
				switch (opcionSecundaria) {
				case 1:
					System.out.println("El perimetro de la figura es: "+cubo.calcularPerimetro());
					menuExtra();
					break;
				case 2:
					System.out.println("El area de la figura es: "+cubo.calcularArea());
					menuExtra();
					break;
				case 3:
					System.out.println("El volumen de la figura es: "+cubo.calcularVolumen());
					menuExtra();
					break;
				case 4:
					System.out.println("Ingresa la nueva medida del lado: ");
					lad = scanner.nextLine();
					lado = Double.parseDouble(lad);
					cubo.setLado(lado);
					break;
				case 5:
					System.out.println("Va a salir del programa");
					break;
				default:
					System.out.println("Ingrese una opcion valida");
					break;
				}
			} while (opcionSecundaria!=5);
						
			
		} catch (Exception e) {
			System.out.println("Ingresa un numero");
		}	
	}
	
	public static void menuExtra() {
		Scanner scanner = new Scanner(System.in);
		String opc = "";
		int opcion = 0;
		do {
			System.out.println("Seleccione una opcion:\n1)Regresar al menu principal\n2)Ingresar nueva medida para el lado");
			opc = scanner.nextLine();
			opcion = Integer.parseInt(opc);
			switch (opcion) {
			case 2:
				System.out.print("Ingresa la medida del lado: ");
				lad = scanner.nextLine();
				lado = Double.parseDouble(lad);
				cubo.setLado(lado);
				break;

			default:
				System.out.println("Ingresa una opcion valida");
				break;
			}
		} while(opcion!=2 && opcion!=1);
	}

}
