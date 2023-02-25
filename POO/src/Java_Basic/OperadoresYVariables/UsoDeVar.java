package Java_Basic.OperadoresYVariables;

public class UsoDeVar
{
    public static void main (String[] args) //siempre es importante declarar el main para que tenga un motor
    {
        //uso de la palabra reservada "var", infiere en los tipos de datos
        var brincoDeLinea = " "; // experimento de Daniel
        System.out.println(brincoDeLinea); //resultado del experimento Daniel
        var intEntera = 10;
        System.out.println(intEntera);
        var miNombre = "Daniel";

        /// Concatenacion de variables
        System.out.println("Mi nombre es: " + miNombre);

        /// Concatenacion de variables, Ejemplo 2
        var usuario = "Angeles";
        var ocupacion = "Ingeniero";
        var perfil = ocupacion + " " + usuario;
        System.out.println("Perfil: " + perfil);

        var i = 3;
        var j = 4;

        System.out.println(i + j);// realiza la suma porque no tiene un texto previo
        System.out.println(i + j + " " + perfil); //evalua de izquierda a derecha, realiza la suma y coloca el texto
        System.out.println(perfil + i + j); //toma la primer variable para dar resultado y ejecuta
        System.out.println(perfil + " " + (i * j)); //uso de parentesis modifica la prioridad
    }
}
