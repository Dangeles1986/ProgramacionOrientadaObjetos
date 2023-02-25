package Java_Basic.Tarea;

public class Promedio {
    public static void  main(String [] args){
        float mate = 9;
        float biologia = 5;
        float quimica = 7;
        float promedio = (mate + biologia + quimica) / 3f;
        System.out.println("El promedio es: " + promedio + ".");

        if (promedio >= 6f){
            System.out.println("Aprobado");
        } else {
            System.out.println("No aprobado");
        }

    }

}
