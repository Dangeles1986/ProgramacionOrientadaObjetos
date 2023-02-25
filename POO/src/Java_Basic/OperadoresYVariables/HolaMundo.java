package Java_Basic.OperadoresYVariables;

public class HolaMundo
{
    ///public es para que puedas acceder o hacer referencia desde otra clase
    ///static porque este metodo se ejecuta una vez
    ///void no regresa algun valor, no tiene return
    ///main es el motor que hace que se ejecute el programa
    public static void main(String[] arg){
        ///***definimos variables***
        //int MiVariable = 10; esta sintaxis es incorrecta
        //int miVariableentera = 10; esta sintaxis es incorrecta
        //int _miVariableEntera = 10; esta sintaxis es correcta y se llama snake case
        //int mi_Variable_Entera = 10; esta sintaxis es correcta y se llama snake case
        int miVariableEntera = 10; //esta sintaxis es correcta y se llama camelCase
        System.out.println(miVariableEntera);
    }
}