package Java_Advanced.Herencia;
public class Empleado extends Persona {

    int numeroEmpleado;
    String salario;
    int antiguedad;

    public Empleado(String nombre, String edad, int numeroEmpleado, String salario, int antiguedad) {
        super(nombre, edad);
        this.numeroEmpleado = numeroEmpleado;
        this.salario = salario;
        this.antiguedad = antiguedad;
    }

    @Override
    public void Datos (){
        System.out.println("El numero de Empleado es: " + numeroEmpleado);
        System.out.println("El salario es: " + salario);
        System.out.println("La antiguedad es: " + antiguedad);
    }
}
