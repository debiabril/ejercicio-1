//import java.time.*;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Estudiante estudiante1 = new Estudiante("María", 1, 6);
		Profesor profesor1 = new Profesor("Sebastián", "Titular"); 
		Estudiante estudiante2= new Estudiante("Carlos", 2, 7);
		Profesor profesor2 = new Profesor("Julián", "Asociado"); 
		Estudiante estudiante3 = new Estudiante("Juan", 3, 8);
		Profesor profesor3 = new Profesor("Lucas", "Reemplazante"); 		
		
		profesor1.setExperienciaLaboral("UNL", "Profesor en Algoritmos", LocalDate.of(2003,Month.MAY, 20) , LocalDate.of(2008, 11, 03)); 
		profesor1.setExperienciaLaboral("UNR", "Profesor reemplazante", LocalDate.of(2008, 12, 1), LocalDate.of(2020, 07, 24));
		
		estudiante1.setFechaNacimiento(LocalDate.of(2000, 01, 20));
		System.out.println(estudiante1.calcularEdad());*/
		
		
		String nombre;
		int nroEstudiante; 
		int moduloActual; 
		int anio;
		int mes;
		int dia;
		String categoria;
		
		int anio2;
		int mes2;
		int dia2;
		String sitio;
		String puesto; 
		LocalDate fechaInicio;
		LocalDate fechaFin;
		
		Scanner eleccionNros = new Scanner(System.in);
		Scanner eleccionStrings = new Scanner(System.in);
		System.out.println("Si desea ingresar un Estudiante presione 1, si desea ingresar un Profesor presione 2");
		int elegido= eleccionNros.nextInt();
		while ((elegido != 1) && (elegido !=2)) {
			System.out.println("Opción Incorrecta, ingrese 1 para Estudiante o 2 para Profesor");
			elegido= eleccionNros.nextInt();
		}
		switch(elegido) {
			case 1:
				System.out.println("Hola Estudiante, ingrese su nombre:");
				nombre= eleccionStrings.nextLine();
				System.out.println("Ahora ingrese su número de estudiante:");
				nroEstudiante=eleccionNros.nextInt();
				System.out.println("Ingrese el módulo en el que se encuentra:");
				moduloActual= eleccionNros.nextInt();
				System.out.println("Ingrese su año de nacimiento:");
				anio= eleccionNros.nextInt();
				System.out.println("Ingrese su mes de nacimiento:");
				mes= eleccionNros.nextInt();
				System.out.println("Ingrese su dia de nacimiento:");
				dia= eleccionNros.nextInt();
				Estudiante estudiante = new Estudiante(nombre, nroEstudiante, moduloActual, LocalDate.of(anio, mes, dia));
				System.out.println("Desea agregar experiencia laboral? Ingrese 1 para si, 2 para no:");
				elegido=eleccionNros.nextInt();
				while(elegido==1) {
					System.out.println("Ingrese el nombre del estableciemiento:");
					sitio=eleccionStrings.nextLine();
					System.out.println("Ingrese el puesto desempeñado:");
					puesto=eleccionStrings.nextLine();
					System.out.println("Ingrese su año de Inicio en el puesto:");
					anio= eleccionNros.nextInt();
					System.out.println("Ingrese su mes de Inicio en el puesto:");
					mes= eleccionNros.nextInt();
					System.out.println("Ingrese su dia de Inicio en el puesto:");
					dia= eleccionNros.nextInt();
					System.out.println("Ingrese su año de Fin en el puesto:");
					anio2= eleccionNros.nextInt();
					System.out.println("Ingrese su mes de Fin en el puesto:");
					mes2= eleccionNros.nextInt();
					System.out.println("Ingrese su dia de Fin en el puesto:");
					dia2= eleccionNros.nextInt();
					estudiante.setExperienciaLaboral(sitio, puesto, LocalDate.of(anio,mes , dia), LocalDate.of(anio2, mes2, dia2));	
					System.out.println("Desea agregar experiencia laboral? Ingrese 1 para si, 2 para no:");
					elegido=eleccionNros.nextInt();
				}
				break;
			case 2:
				System.out.println("Hola Profesor, ingrese su nombre:");
				nombre= eleccionStrings.nextLine();
				System.out.println("Ingrese su categoría:");
				categoria=eleccionStrings.nextLine();
				System.out.println("Ingrese su año de nacimiento:");
				anio= eleccionNros.nextInt();
				System.out.println("Ingrese su mes de nacimiento:");
				mes= eleccionNros.nextInt();
				System.out.println("Ingrese su dia de nacimiento:");
				dia= eleccionNros.nextInt();
				Profesor profesor = new Profesor(nombre, categoria, LocalDate.of(anio, mes, dia));
				System.out.println("Desea agregar experiencia laboral? Ingrese 1 para si, 2 para no:");
				elegido=eleccionNros.nextInt();
				while(elegido==1) {
					System.out.println("Ingrese el nombre del estableciemiento:");
					sitio=eleccionStrings.nextLine();
					System.out.println("Ingrese el puesto desempeñado:");
					puesto=eleccionStrings.nextLine();
					System.out.println("Ingrese su año de Inicio en el puesto:");
					anio= eleccionNros.nextInt();
					System.out.println("Ingrese su mes de Inicio en el puesto:");
					mes= eleccionNros.nextInt();
					System.out.println("Ingrese su dia de Inicio en el puesto:");
					dia= eleccionNros.nextInt();
					System.out.println("Ingrese su año de Fin en el puesto:");
					anio2= eleccionNros.nextInt();
					System.out.println("Ingrese su mes de Fin en el puesto:");
					mes2= eleccionNros.nextInt();
					System.out.println("Ingrese su dia de Fin en el puesto:");
					dia2= eleccionNros.nextInt();
					profesor.setExperienciaLaboral(sitio, puesto, LocalDate.of(anio,mes , dia), LocalDate.of(anio2, mes2, dia2 ));	
					System.out.println("Desea agregar experiencia laboral? Ingrese 1 para si, 2 para no:");
					elegido=eleccionNros.nextInt();
				}
				break;
		}
		
		
		
		
		
		
		
	}

	
	
}
