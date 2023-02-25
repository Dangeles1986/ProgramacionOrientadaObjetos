package Java_Basic.OperadoresYVariables;

public class DatosPrimitivos {
    //Los tipos de datos es para asignar valores a nuestras variables
    //Asignar tipos de datos podemos realizar operaciones
    //Es para que se pueda compilar y se pueda interpetrar en la memoria RAM

    //****************** D A T O S  P R I M I T I V O S ********************
    public static void main(String[] args) {//siempre es importante declarar el main para que tenga un motor

        byte b = 100; // un byte va de 0 a 127
        short s = 115;
        int i = 454878771;
        long l = 1235434511;
        float f = 12.25f; //siempre se tiene que poner f, para evitar un error
        double d = 1233.454; //almacena de los dos tipos
        boolean booleanTrue = true; //
        boolean booleanFalse = false; //
        char c = 'T'; //un solo caracter
        String miVariable = "Texto"; //cadena de caracteres

        System.out.println("Valor de byte: " + b);
        System.out.println("Valor de long: " + l);
        System.out.println("Valor de flotante: " + f);
        System.out.println("Valor de char: " + c);
        System.out.println(miVariable);

    }
}