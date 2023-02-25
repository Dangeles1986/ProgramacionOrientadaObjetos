package Java_Basic.OperadoresYVariables;

public class OperadoresAritmeticos {
    public static void main (String[] args) { //siempre es importante declarar el main para que tenga un motor

        // +++++++++++++++++++++SUMA++++++++++++++++++++++
    float a = 3, b = 5; //para declarar dos variables en una sola línea de código
    var resultado = a + b;
        System.out.println("Respuesta: " + resultado);

        //+++++++++++++++++MULTIPLICACION+++++++++++++++++
    float z = 10, y = 6;
    var producto = z * y;
        System.out.println("Resultado de producto: " + producto);

        //+++++++++++++++++++DIVISON++++++++++++++++++++++
    var datosDivisionUno = 5 / 3;
        System.out.println("Resultado division uno: " + datosDivisionUno);
    var datosDivisionDos = z / a;
        System.out.println("Resultado division dos: " + datosDivisionDos);

    }
}
