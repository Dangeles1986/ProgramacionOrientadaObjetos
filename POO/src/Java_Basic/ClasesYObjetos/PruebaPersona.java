package Java_Basic.ClasesYObjetos;

public class PruebaPersona {

    public static void main (String[] args){

        Persona objPersona = new Persona();

        System.out.println(""); // Solo para espacio
        objPersona.nombre = "Daniel";
        objPersona.apellido = "Angeles";
        objPersona.edad = 36;
        objPersona.nacionalidad = "Mexicana";
        objPersona.genero = "Masculino";
        objPersona.MostrarInformacion();
    }
}
