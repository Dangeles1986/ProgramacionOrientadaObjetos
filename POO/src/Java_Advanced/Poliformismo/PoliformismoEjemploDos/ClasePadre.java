package Java_Advanced.Poliformismo.PoliformismoEjemploDos;
import java.util.Scanner;
public abstract class ClasePadre {
    protected int valorUno, valorDos, resultado;
    Scanner entrada = new Scanner(System.in);

        public void pedirDatos (){
        System.out.println("Dame el primer valor: ");
        valorUno = entrada.nextInt();

        System.out.println("Dame el segundo valor: ");
        valorDos = entrada.nextInt();
    }
    //Para el poliformismo debemos crear metodos abstractos y, por ende la clase debe ser abstracta.
    //Cabe mencionar que los metodos abstractos no llevan "{}", ya que su logica (codigo), se implementa
    //en otra clase.
    public abstract void Operaciones();

    public void MostrarResultado (){
        System.out.println("El resultado es: " + resultado);
    }
}
