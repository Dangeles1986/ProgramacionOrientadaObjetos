package Java_Basic.OperadoresYVariables;

public class OperadoresCondicionales {

    public static void main(String[] args)//siempre es importante declarar el main para que tenga un motor
        {
            var a = 5;
            var resultado = a >= 0 && a<= 10 && a==5; //&& es and

            if (resultado){
                System.out.println("Dentro de rango");
            } else {
                System.out.println("Fuera de rango");
            }

            boolean vacaciones = false;
            boolean diaDescanso = true;
            boolean domingo = false;

            if(vacaciones || diaDescanso || domingo)//|| es or
            {
                System.out.println("Puedo beber cerveza");
            }
            else{
                System.out.println("No puedo beber cerveza");
            }
        }
}
