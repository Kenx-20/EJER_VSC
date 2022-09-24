import java.util.Scanner;

public class E6 {
    public static void main(String[] args) {
        //KENYI CONDOR TRUCIOS//
        //Realizar un programa que calcule la multiplicación de 5 números ingresados por teclado.//
        float producto = 1;
        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 1; i < 6; i++) {
                System.out.println("Ingrese el numero "+i);
                float num = sc.nextFloat();
                producto = producto*num;
            }
        }
        System.out.println("La multiplicacion es: "+producto);
    }    
}