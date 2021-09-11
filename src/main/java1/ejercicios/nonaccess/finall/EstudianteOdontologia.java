package ejercicios.nonaccess.finall;

public class EstudianteOdontologia extends EstudianteMedicina{

	public void realizarPracticas() {
		System.out.println("El estudiante de medicina realiza 100 horas de practica");
	}
	
	protected void realizarPasantias() {
		System.out.println("Realizar 100 horas de pasantias");
	}
}
