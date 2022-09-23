import java.util.Scanner;

public class E8_11 {
    public static void main(String[] args) {
        // KENYI CONDOR TRUCIOS//

        // problema 8 - Calcular el área de un circulo sabiendo que pi = 3,14159265 A=
        // pi x r2, sabiendo que r=5.//
        double pi = 3.14159265;
        int r = 5;
        System.out.println("El area del circulo es: " + pi * Math.pow(r, 2));

        // problema 9 - Calcular la suma de las áreas de 3 círculos cuyos radios son
        // 8.9, 6.7 y 7.9//
        double r1 = 8.9;
        double r2 = 6.7;
        double r3 = 7.9;
        double result = pi * (Math.pow(r1, 2) + Math.pow(r2, 2) + Math.pow(r3, 2));
        System.out.println("La suma de las areas de los 3 circulos es: " + result);

        // problema 10 - Calcular la suma de las áreas de 8 círculos cuyos radios son
        // 18.9, 16.7, 71.9, 4.6, 6.7, 5.6, 4.7 y 10//
        double r_1 = 18.9;
        double r_2 = 16.7;
        double r_3 = 71.9;
        double r_4 = 4.6;
        double r_5 = 6.7;
        double r_6 = 5.6;
        double r_7 = 4.7;
        double r_8 = 10;
        double resu = pi * (Math.pow(r_1, 2) + Math.pow(r_2, 2) + Math.pow(r_3, 2) + Math.pow(r_4, 2) + Math.pow(r_5, 2)
                + Math.pow(r_6, 2) + Math.pow(r_7, 2) + Math.pow(r_8, 2));
        System.out.println("La suma de las areas de los 8 circulos es: " + resu);

        // problema 11 - Programa que solicita ingresar un número favorito por teclado y
        // luego el computador debe mostrar el mensaje “Tu numero favorito es <numero
        // ingresado>”.//
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese su numero favorito: ");
            int n = sc.nextInt();
            System.out.println("Tu numero favorito es " + "*" + n + "*");
        }
    }
}
