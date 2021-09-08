package deber.metodos.string;

import java.util.Scanner;

public class MainEstudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cedulaABuscar = "";
		
		int posicionGuardar = 0;
		posicionGuardar++;
		
		String cedula1 = "";
		String cedula2 = "";
		String cedula3 = "";
		String cedula4 = "";
		String cedula5 = "";
		
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
				
				Estudiante fila[] = new Estudiante[5];
				
				Estudiante estudiante1 = new Estudiante();
				estudiante1.setCedula(cedula1);
				
				Estudiante estudiante2 = new Estudiante();
				estudiante1.setCedula(cedula2);
				
				Estudiante estudiante3 = new Estudiante();
				estudiante1.setCedula(cedula3);
				
				Estudiante estudiante4 = new Estudiante();
				estudiante1.setCedula(cedula4);
				
				Estudiante estudiante5 = new Estudiante();
				estudiante1.setCedula(cedula5);
				
				fila[0] = cedula1;
				fila[1] = cedula2;
				fila[2] = cedula3;
				fila[3] = cedula4;
				fila[4] = cedula5;
				
				System.out.println("Valor del atributo estatico: " + Estudiante.pais);
				System.out.println("Valor del atributo estatico: " + Estudiante.provincia);
						
					for(int i=0; i<5; i++) {
						Estudiante estudiante = fila[i];
					
						String cedula = estudiante.getCedula();
						cedulaABuscar.equals(cedula);
					}
				
				
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
