import java.time.*;

public class Profesor  extends Persona{
	private String categoria;

	Profesor(String nombre, String categoria, LocalDate fechaNacimiento){
		setNombre(nombre);
		setCategoria(categoria);
		setFechaNacimiento(fechaNacimiento);
		System.out.println("Mi nombre es " + getNombre() + " soy profesor, estoy en la categoria: " + getCategoria()+ " y tengo "+ this.calcularEdad() + " años");
		
	}
	
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoia) {
		this.categoria = categoia;
	}
	
	

}
