package CodigosDeDiagramas;
import java.util.Scanner;
public class MainProblema3 {
    public static void main (String[] args){
        double x, y;
        Scanner lec = new Scanner(System.in);

        System.out.println("Valor de x? ");
        x = lec.nextDouble();

        if (x%4==0)
            y = Math.pow(x, 2);
        else
            if (x%4==1)
            y = x / 6;
            else
                if (x%4==2)
                    y = Math.sqrt(x);
                else
                    y = Math.pow(x, 3)+5;
        System.out.println("El resultado de y es: "+y);
        }
    }

