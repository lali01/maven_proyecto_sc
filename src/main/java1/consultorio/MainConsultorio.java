package consultorio;
import java.util.Arrays;
import java.util.Scanner;

import deber.metodos.string.Estudiante;
public class MainConsultorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner in = new Scanner(System.in);
		int opcion = 0;
		String nombre = "";
		String nombre1 = "";
		String nombre2 = "";
		
		String apellido = "";
		String apellido1= "";
		String apellido2 = "";
		
		int edad = 0;
		int edad1 = 0;
		int edad2 = 0;
		
		String sintoma = "";
		String sintoma1 = "";
		String sintoma2 = "";
		
		System.out.println("Bienvenidos");
		
		while(opcion!=3) {
			System.out.println("*************************");
			System.out.println("1.    Registrar Paciente");
			System.out.println("2.    Imprimir Reporte");
			System.out.println("3.    SALIR");
			System.out.println("*************************");
		
			System.out.println("Seleccione una opcion");
			opcion = in.nextInt();
			
			if(opcion==1) {
				
				System.out.println("Ingrese su nombre: ");
				nombre = in.next();
				
				System.out.println("Ingrese su apellido: ");
				apellido = in.next();
	
				System.out.println("Ingrese su edad: ");
				edad = in.nextInt();
				
				System.out.println("Sintoma: ");
				sintoma = in.next();
				
				System.out.println("Ingrese su nombre: ");
				nombre1 = in.next();
				
				System.out.println("Ingrese su apellido: ");
				apellido1 = in.next();
	
				System.out.println("Ingrese su edad: ");
				edad1 = in.nextInt();
				
				System.out.println("Sintoma: ");
				sintoma1 = in.next();
				
				System.out.println("Ingrese su nombre: ");
				nombre2 = in.next();
				
				System.out.println("Ingrese su apellido: ");
				apellido2 = in.next();
	
				System.out.println("Ingrese su edad: ");
				edad2 = in.nextInt();
				
				System.out.println("Sintoma: ");
				sintoma2 = in.next();
				
				Paciente paciente1 = new Paciente();
				paciente1.setNombre(nombre);
				paciente1.setApellido(apellido);
				paciente1.setEdad(edad);
				paciente1.setSintoma(sintoma);
				
				Paciente paciente2 = new Paciente();
				paciente2.setNombre(nombre1);
				paciente2.setApellido(apellido1);
				paciente2.setEdad(edad1);
				paciente2.setSintoma(sintoma1);
				
				Paciente paciente3 = new Paciente();
				paciente3.setNombre(nombre2);
				paciente3.setApellido(apellido2);
				paciente3.setEdad(edad2);
				paciente3.setSintoma(sintoma2);
				
				Paciente fila[] = new Paciente[3];
				fila[0] = paciente1;
				fila[1] = paciente2;
				fila[2] = paciente3;
				
				for(int i=0;i<3;i++) {
					Paciente paciente = fila[i];
		         
		        }
				
			}else {
				if(opcion==2) {
					
					System.out.println("Reporte de Pacientes");
					
					// Aqui ordenamos el vector				
					int[] fila;
					Arrays.sort(fila);
					System.out.println("El vector despues de ordenar " + Arrays.toString(fila));
				}
					
			
				}
			}
		}
	}		
	