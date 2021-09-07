package deber.metodos.string;

import java.util.Scanner;

public class MainEstudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cedula1 = "";
		
		int opcion = 0;
		Scanner in = new Scanner(System.in);
		
		while(opcion!=3) {
			
			System.out.println("*************************");
			System.out.println("1.    Ingresar Estudiante");
			System.out.println("2.    Buscar Estudiante");
			System.out.println("3.    SALIR");
			System.out.println("*************************");
		
			System.out.println("Seleccione una opcion");
			opcion = in.nextInt();
			
			if(opcion==1) {
				System.out.println("Ingresar numero de Cedula de Estudiante: ");
				cedula1 = in.nextLine();
				
				String estudiante[] = new String[5];
				estudiante[3] = cedula1;
				
				
			}else {
				if(opcion==2) {
					System.out.println("Ingrese cedula Estudiante");
					String numero = in.nextLine();
					
					String estudiante = "";
					
					boolean resultado = estudiante.contains(numero);
					System.out.println("Contiene al estudiante: " + resultado);	
				}
			}
		}
	}
}
