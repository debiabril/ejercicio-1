import java.time.*;

public class Estudiante extends Persona{
	private int nroEstudiante;
	private int moduloActual;
	
	Estudiante(String nombre, int nroEstudiante, int moduloActual, LocalDate fechaNacimiento){
		setNombre(nombre);
		setNroEstudiante(nroEstudiante);
		setModuloActual(moduloActual);
		setFechaNacimiento(fechaNacimiento);
		System.out.println("Mi nombre es " + getNombre() + " soy estudiante, estoy en el modulo: " + getModuloActual() + " y tengo: " + this.calcularEdad()+ " años");
	}
	
	public int getNroEstudiante() {
		return nroEstudiante;
	}
	public void setNroEstudiante(int nroEstudiante) {
		this.nroEstudiante = nroEstudiante;
	}
	public int getModuloActual() {
		return moduloActual;
	}
	public void setModuloActual(int moduloActual) {
		this.moduloActual = moduloActual;
	}
	

}
