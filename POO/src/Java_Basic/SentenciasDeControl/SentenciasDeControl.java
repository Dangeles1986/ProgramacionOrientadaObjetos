package Java_Basic.SentenciasDeControl;

import java.sql.SQLOutput;

public class SentenciasDeControl {

    public static void main (String[] args) {
        boolean condicion = false;
        System.out.println(""); //Espacio
        if (condicion) {
            System.out.println("Condicion Verdadera");
        } else {
            System.out.println("Condicion Falsa");
        }

        int x = 9;

        if (x <= 10 || x >= 12) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }

        int numero = 3;
        String texto = "";

        if (numero == 1){
            texto = "Numero Uno.";
        }
        else if (numero == 2){
            texto = "Numero Dos.";
        }
        else {
            texto = "Desconocido";
        }
        System.out.println("El numero es: " + texto);
    }
}
