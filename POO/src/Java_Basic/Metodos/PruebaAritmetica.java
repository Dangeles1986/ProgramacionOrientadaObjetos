package Java_Basic.Metodos;
import Java_Basic.TareaOpcion2.PromedioDos;

import java.util.Scanner;
public class PruebaAritmetica {
        public static void main (String[] args){

                Scanner sc = new Scanner(System.in);  //Se crea un objeto Scanner

                Aritmetica aritmetica = new Aritmetica(); //Se crea un objeto de la clase Aritmetica

                //System.out.println("Deseas sumar? Y/N");

                System.out.println("Introduce el primer sumando: ");
                int entradaPrimerSumando = sc.nextInt(); //variable para capturar entero
                aritmetica.a = entradaPrimerSumando; //ASIGNA EL INPUT A LA VARIABLE

                System.out.println("Introduce el segundo sumando: ");
                int entradaSegundoSumando = sc.nextInt(); //variable para capturar entero
                aritmetica.b = entradaSegundoSumando; //ASIGNA EL INPUT A LA VARIABLE

                System.out.println("Elige tipo de suma:");
                System.out.println("1) Sumar");
                System.out.println("2) Sumar Con Retorno");
                System.out.println("3) Sumar con parametros");

                int tipoDeSuma = sc.nextInt(); //variable para capturar entero

                switch (tipoDeSuma){

                        case 1:
                                aritmetica.sumar ();
                                break;
                        case 2:
                                aritmetica.sumarConRetorno();
                                System.out.println("La suma con retorno es: " + aritmetica.resultado);
                                break;
                        case 3:
                                aritmetica.sumarConParam(aritmetica.a,aritmetica.b);
                                System.out.println("La suma con parametros es: " + aritmetica.resultado);
                                break;

                        default:
                                System.out.println("Opción invalida.");
                }


        }
}
