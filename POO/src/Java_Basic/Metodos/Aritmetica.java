package Java_Basic.Metodos;

public class Aritmetica {
    //Atributos
    int a;
    int b;
    int resultado;

    //METODO SUMAR
    public void sumar (){
        resultado = a + b;
        System.out.println("La suma es: " + resultado);
    }
    public int sumarConRetorno (){
        return resultado = a + b;
    }
    public int sumarConParam (int param1, int param2){
        a = param1;
        b = param2;
        return resultado = a + b;
    }
}
