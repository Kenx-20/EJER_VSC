import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        //KENYI CONDOR TRUCIOS//
        //Realizar un programa que calcule el perímetro y area de las siguientes figuras geométricas://
        int opcion=0;
        try (Scanner sc = new Scanner(System.in)) {
            do {
                System.out.print("\nELIJE UNA FIGURA GEOMETRICA: \n");
                System.out.print("------------------------\n");
                System.out.print("1. TRIANGULO\n");
                System.out.print("2. CUADRADO\n");
                System.out.print("3. RECTANGULO\n");
                System.out.print("4. ROMBO\n");
                System.out.print("5. ROMBOIDE\n");
                System.out.print("6. TRAPECIO\n");
                System.out.print("7. SALIR\n");
                System.out.print("------------------------\n");
                opcion = sc.nextInt();
                switch  (opcion){
                    case 1:
                        System.out.print("Ingrese la base: ");
                        float basetri = sc.nextFloat();
                        System.out.print("Ingrese la altura: ");
                        float alttri = sc.nextFloat();
                        System.out.print("Ingrese el segundo lado: ");
                        float lad2tri = sc.nextFloat();
                        System.out.print("Ingrese el tercer lado: ");
                        float lad3tri = sc.nextFloat();

                        System.out.print("El perimetro es: "+(basetri+lad2tri+lad3tri)+"\n");
                        System.out.print("El area es: "+ ((basetri*alttri)/2)+"\n");
                        break;

                    case 2:
                        System.out.print("Ingrese el lado: ");
                        float ladcua = sc.nextFloat();

                        System.out.print("El perimetro es: "+4*ladcua+"\n");
                        System.out.print("El area es: "+Math.pow(ladcua,2)+"\n");
                        break;

                    case 3:
                        System.out.print("Ingrese la base: ");
                        float baserect = sc.nextFloat();
                        System.out.print("Ingrese la altura: ");
                        float altrect = sc.nextFloat();

                        System.out.print("El perimetro es: "+(2*baserect+2*altrect)+"\n");
                        System.out.print("El area es: "+baserect*altrect+"\n");
                        break;

                    case 4:
                        System.out.print("Ingrese el lado: ");
                        float ladrom = sc.nextFloat();
                        System.out.print("Ingrese la diagonal menor: ");
                        float dmerom = sc.nextFloat();
                        System.out.print("Ingrese la diagonal mayor: ");
                        float dmarom = sc.nextFloat();

                        System.out.print("El perimetro es: "+4*ladrom+"\n");
                        System.out.print("El area es: "+(dmerom*dmarom)/2+"\n");
                        break;

                    case 5:
                        System.out.print("Ingrese la base: ");
                        float barom = sc.nextFloat();
                        System.out.print("Ingrese la altura: ");
                        float alrom = sc.nextFloat();

                        System.out.print("El perimetro es: "+(2*barom+2*alrom)+"\n");
                        System.out.print("El area es: "+barom*alrom+"\n");
                        break;

                    case 6:
                        System.out.print("Ingrese la base menor: ");
                        float bmetrap = sc.nextFloat();
                        System.out.print("Ingrese la base mayor: ");
                        float bmatrap = sc.nextFloat();
                        System.out.print("Ingrese la altura: ");
                        float alttrap = sc.nextFloat();
                        System.out.print("Ingrese el tercer lado: ");
                        float lad3trap = sc.nextFloat();
                        System.out.print("Ingrese el cuarto lado: ");
                        float lad4trap = sc.nextFloat();

                        System.out.print("El perimetro es: "+(bmetrap+bmatrap+lad3trap+lad4trap)+"\n");
                        System.out.print("El area es: "+(alttrap*(bmetrap+bmatrap)/2)+"\n");
                        break;
                }
            }while (opcion!=7);
        }
        System.out.println("FINALIZO EL PROGRAMA");
    }
}
