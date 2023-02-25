package Java_Basic.ClaseScanner;

import java.util.Scanner;

public class ClaseScanner {

    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);//Nuevo objeto de la clase scanner

        System.out.println("Escribe tu nombre: ");
        var usuario = consola.nextLine(); //variable para capturar dato

        System.out.println("Escribe tu profesion: ");
        var profesion = consola.nextLine(); //variable para capturar dato

        System.out.println(usuario + " "+ "es " + profesion + ".");
    }
}
