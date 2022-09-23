import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        //KENYI CONDOR TRUCIOS//
        //Realizar un programa que permita calcular la suma de 5 números//
        float num, suma=0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese los numeros: ");
            for (int i = 0; i < 5; i++) {
                num = sc.nextFloat();
                suma = num+suma;
            }
        }
        System.out.println("Resultado de la suma es: "+suma);
    }
}
