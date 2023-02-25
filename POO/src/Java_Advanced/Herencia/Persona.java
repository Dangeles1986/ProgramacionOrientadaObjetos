package Java_Advanced.Herencia;
public abstract class Persona {
   protected String nombre;
   protected String edad;
   public Persona (String nombre, String edad){
        this.nombre = nombre;
        this.edad = edad;
   }
    public abstract void Datos();
    public void DatosPersonales (){
        System.out.println("El nombre de la persona es: " + nombre);
        System.out.println("La edad de la persona es: " + edad);
    }
}
