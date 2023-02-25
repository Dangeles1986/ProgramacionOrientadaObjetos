package Java_Basic.SwitchCase;

public class SwitchCase {
    public static void main (String[] args){

        var numero = 4;
        var numeroTexto = "Numero Desconocido";

        switch (numero){

            case 1:
                numeroTexto = "Numero Uno";
                break;
            case 2:
                numeroTexto = "Numero Dos";
                break;
            case 3:
                numeroTexto = "Numero Tres";
                break;

            default:
                numeroTexto = "Desconozco el numero";
        }
        System.out.println("El valor del numero es: " + numeroTexto + ".");

    }
}
