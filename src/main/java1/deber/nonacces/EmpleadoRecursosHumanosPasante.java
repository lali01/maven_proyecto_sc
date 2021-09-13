package deber.nonacces;

public class EmpleadoRecursosHumanosPasante extends EmpleadoRecursosHumanos{

	//no se puede socreescribir metodos en una clase hija 
	public void realizarPagos() {
		System.out.println("Realizar el Pago el dia que corresponde");
	}
}
