package CodigosDeDiagramas;

import java.util.Scanner;

public class MainBoletosTren {

    public static void main (String[] args){
        double p;
        int dias, kms;
        Scanner lec = new Scanner(System.in);

        System.out.println("Indica numero de kms y dias de viaje");
        kms = lec.nextInt();
        dias = lec.nextInt();
        p = kms*60;

        if (kms>800 || dias>7){
            p = p*0.7;
            System.out.println("El precio de tu boleto de tren es: " + p);

        }
    }
}
