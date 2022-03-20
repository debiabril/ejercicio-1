import java.time.LocalDate;
import java.time.Period;




public abstract class Persona {
	public class ExperienciaLaboral {
		private String sitio;
		private String puesto; 
		private LocalDate fechaInicio;
		private LocalDate fechaFin;
		private ExperienciaLaboral next;
		
		ExperienciaLaboral(){
			next=null;
			
		}
		
		public String getSitio() {
			return sitio;
		}
		public void setSitio(String sitio) {
			this.sitio = sitio;
		}
		public String getPuesto() {
			return puesto;
		}
		public void setPuesto(String puesto) {
			this.puesto = puesto;
		}
		public LocalDate getFechaInicio() {
			return fechaInicio;
		}
		public void setFechaInicio(LocalDate fechaInicio) {
			this.fechaInicio = fechaInicio;
		}
		public LocalDate getFechaFin() {
			return fechaFin;
		}
		public void setFechaFin(LocalDate fechaFin) {
			this.fechaFin = fechaFin;
		}
		
		public void agregar(String sitio, String puesto, LocalDate fechaInicio, LocalDate fechaFin) {
			if(next==null) {
				next=new ExperienciaLaboral();
				next.setSitio(sitio);
				next.setPuesto(puesto);
				next.setFechaInicio(fechaInicio); 
				next.setFechaFin(fechaFin);
				System.out.println(next.getPuesto() + ", en " + next.getSitio()+ ", siendo su primer experiencia laboral");
			}
			else{
				ExperienciaLaboral actual=next;
				while(actual.next != null) {
					actual=actual.next;
				}
				actual.next = new ExperienciaLaboral();
				
				actual= actual.next;
				actual.setSitio(sitio);
				actual.setPuesto(puesto);
				actual.setFechaInicio(fechaInicio); 
				actual.setFechaFin(fechaFin);
				System.out.println("También fue " + actual.getPuesto() + ", en " + actual.getSitio());
			}
				
			
			
		}
	}
	
	private String nombre;	
	private ExperienciaLaboral expLaboral= new ExperienciaLaboral();
	private LocalDate fechaNacimiento;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public void setExperienciaLaboral(String sitio, String puesto, LocalDate fechaInicio, LocalDate fechaFin) {
		expLaboral.agregar(sitio, puesto, fechaInicio, fechaFin);
	}
	
	
	public int calcularEdad() {
		Period periodo = Period.between(this.fechaNacimiento, LocalDate.now());
		return periodo.getYears();
	}

}
	




