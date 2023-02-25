package Java_Advanced.Poliformismo.SobreCargaDeMetodo;

public class SobrecargaDeMetodo {

    public void suma (int a, int b){

        System.out.println("Resultado: " + (a + b));

    }
    public void suma (int a, int b, int c){

        System.out.println("Resultado: " + (a + b + c));

    }

    public static void main (String[] args){

        SobrecargaDeMetodo objSobrecargaDeMetodo = new SobrecargaDeMetodo(); //Creacion de objeto de la clase
        objSobrecargaDeMetodo.suma(100, 100); //Llama al primer metodo con dos variables
        objSobrecargaDeMetodo.suma(200, 200, 200); //Llama al segundo metodo con tres variables
    }
}
