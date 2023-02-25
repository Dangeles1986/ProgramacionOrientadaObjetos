package Java_Basic.ModificadoresDeAcceso;

class ModificadorDefaultDos {
    public static void main (String[] args)
    {
        ModificadorDefault objModificadorDefault = new ModificadorDefault();
        ModificadorPublico objModificadorPublico = new ModificadorPublico();
        objModificadorDefault.ejemplo();
        objModificadorDefault.ejemploDos();
        objModificadorPublico.ejemploCuatro();

        /*Modificador de acceso por defecto, nos permite acceder a los metodos o atributos de una clase,
        siempre y cuando se encuentren en el mismo package, sino estuvieran las dos clases en el mismo package,
        al utilizar este modificador de acceso, nos devolveria un error de compilacion
         */
    }

}
