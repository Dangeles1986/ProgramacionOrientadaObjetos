package Java_Basic.OperadoresYVariables;

public class OperadoresDeIgualdad {
    public static void main(String[] arg)//siempre es importante declarar el main para que tenga un motor
    {
        var a = 5;
        var b = 4;

        var c  = (a==b); //Compara datos numericos
        System.out.println("c = " + c);

        var cadena = "hola";
        var cadenaDos = "hola";
        var validacion = cadena == cadenaDos; //compara Textos Case Sensitive metodo 1
        System.out.println("El resultado es: " + validacion);

        var validacionDos = cadena.equals(cadenaDos);//Equals es igual metodo 2
        System.out.println("El Resultado es :" + validacionDos);

    }

}
