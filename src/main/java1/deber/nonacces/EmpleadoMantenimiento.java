package deber.nonacces;

public final class EmpleadoMantenimiento extends Empleado {

	private String edad;
	public final String pagoHorasExtras = "$3.00";
	
	
	public EmpleadoMantenimiento() {
		
		//no se puede reasignar un valor a un atributo final
		pagoHorasExtras = "$5.00";
		
		
	
	}
}
		
