package Java_Basic.TareaOpcion2;

//import java.sql.SQLOutput;

public class PromedioDos {
    //atributos de la clase PROMEDIO
    String nombreEstudiante;
    int matematicas;
    int biologia;
    int quimica;
    public void mostrarPromedio (){
        System.out.println("***BOLETA DE CALIFICACION***");
        System.out.println(""); // Solo espacio por estetica
        System.out.println(nombreEstudiante);
        System.out.println("Calificacion de Matematicas: " + matematicas + ".");
        System.out.println("Calificacion de Biologia: " + biologia + ".");
        System.out.println("Calificacion de Quimica: " + quimica + ".");
        int promedio = (matematicas + biologia + quimica) / 3;
        System.out.println("El Promedio es: "+ promedio);
        System.out.println(" "); // Solo espacio por estetica

        if (promedio >= 6){
            System.out.println(">>> APROBADO <<<");
        } else {
            System.out.println(">>> NO APROBADO <<<");
        }

    }
}
