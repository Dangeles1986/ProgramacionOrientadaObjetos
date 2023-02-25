package Java_Advanced.Herencia;
import java.util.Scanner;
public class Ejecutable {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);  //Se crea un objeto Scanner
        System.out.println("<<< BASE DE DATOS >>>");
        System.out.println("Que vas a registrar?");
        System.out.println("Elige 1 para Estudiante o 2 para Empleado");

        int tipoDePersona  = sc.nextInt(); //variable para capturar tipo de Persona

        switch (tipoDePersona){

            case 1:
                System.out.println("Escribe el nombre del estudiante: ");
                String nombreE = sc.next();
                System.out.println("Escribe la edad del estudiante: ");
                String edadE = sc.next();
                System.out.println("Escribe la matricula del estudiante: ");
                int matriculaE = sc.nextInt();
                System.out.println("Escribe el promedio del estudiante: ");
                int promedioE = sc.nextInt();

                Estudiante estudiante = new Estudiante(nombreE, edadE, matriculaE, promedioE);
                System.out.println("ESTUDIANTE REGISTRADO EXITOSAMENTE:");
                estudiante.DatosPersonales();
                estudiante.Datos();
                break;
            case 2:
                System.out.println("Escribe el nombre del empleado: ");
                String nombreEM = sc.next();
                System.out.println("Escribe la edad del empleado: ");
                String edadEM = sc.next();
                System.out.println("Escribe el numero de empleado: ");
                int numeroEM = sc.nextInt();
                System.out.println("Escribe el salario del empleado: ");
                String salarioEM = sc.next();
                System.out.println("Escribe la antiguedad del empleado: ");
                int promedioEM = sc.nextInt();

                Empleado empleado = new Empleado(nombreEM, edadEM, numeroEM, salarioEM, promedioEM);
                System.out.println("EMPLEADO REGISTRADO EXITOSAMENTE:");
                empleado.DatosPersonales();
                empleado.Datos();
                break;

            default:
                System.out.println("OPCION NO VALIDA");
        }
    }


}
