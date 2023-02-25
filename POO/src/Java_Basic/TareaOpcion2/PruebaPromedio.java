package Java_Basic.TareaOpcion2;
import java.util.Scanner;
public class PruebaPromedio extends PromedioDos {

    public static void main (String[] args){

           Scanner sc = new Scanner(System.in);  //Se crea un objeto Scanner

           PromedioDos objPromedio = new PromedioDos(); // Se crea un objeto de la otra clase del paquete

           System.out.println("Escribe Nombre del Estudiante: ");
           objPromedio.nombreEstudiante = sc.nextLine(); //variable para capturar dato

           System.out.println("Escribe Calificacion de Matematicas: ");
           objPromedio.matematicas  = sc.nextInt(); //variable para capturar dato

           System.out.println("Escribe Calificacion de Biologia: ");
           objPromedio.biologia = sc.nextInt(); //variable para capturar dato

           System.out.println("Escribe Calificacion de Quimica: ");
           objPromedio.quimica = sc.nextInt(); //variable para capturar dato

           objPromedio.mostrarPromedio();
    }
}