import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        //KENYI CONDOR TRUCIOS//
        //Realizar un programa que permita mostrar en pantalla tu nombre y apellido//
        String nomb, apell;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese su nombre: ");
            nomb = sc.nextLine();
            System.out.print("Ingrese sus apellidos: ");
            apell = sc.nextLine();
        }
        System.out.println("Bienvenido "+nomb+" "+apell);
     }  
}
