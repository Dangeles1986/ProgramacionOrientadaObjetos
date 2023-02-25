package Java_Advanced.Herencia;
public class Estudiante extends Persona {
    int matriculaEscolar;
    int promedio;

    public Estudiante(String nombre, String edad, int matriculaEscolar, int promedio) {
        super(nombre, edad);
        this.matriculaEscolar = matriculaEscolar;
        this.promedio = promedio;
    }
    @Override

    public void Datos (){

        System.out.println("La matricula escolar es: " + matriculaEscolar);
        System.out.println("El promedio es: " + promedio);
    }
}
