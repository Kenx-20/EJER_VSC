import java.util.Scanner;

public class E7 {
    public static void main(String[] args) {
        // KENYI CONDOR TRUCIOS//
        // Realizar un programa que permita ingresar 10 números por teclado, el programa
        // debe calcular la multiplicación entre la suma de los primeros 5 números y la
        // suma de los 5 últimos números.//
        float suma = 0;
        float prod = 1;
        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 1; i < 6; i++) {
                System.out.println("Ingrese el numero " + i);
                float num = sc.nextFloat();
                suma = suma + num;
            }
            for (int i = 6; i < 11; i++) {
                System.out.println("Ingrese el numero " + i);
                float num = sc.nextFloat();
                prod = prod * num;
            }
        }
        System.out.println("La suma de los 5 primeros numeros es: " + suma);
        System.out.println("La multiplicacion de los 5 ultimos numeros es: " + prod);
    }
}