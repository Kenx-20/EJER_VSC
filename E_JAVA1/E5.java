import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        //KENYI CONDOR TRUCIOS//
        //Realizar un programa que calcule el promedio de 5 notas ingresadas por teclado//
        float acum = 1;
        float notas = 0;
        try (Scanner sc = new Scanner(System.in)) {
            while (acum <= 5) {
                System.out.println("Ingrese la nota numero "+acum);
                float num = sc.nextFloat();
                notas += num;
                acum++;
            }
        }
        float promedio = notas/5;
        System.out.println("El promedio es: "+promedio);
    }
}
