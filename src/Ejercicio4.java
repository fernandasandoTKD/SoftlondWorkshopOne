import java.util.Scanner;

public class Ejercicio4 {
    private int edad;

    public void calculoEdad(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese su edad:");
        edad= scanner.nextInt();

        if( edad >= 18){
            System.out.println("Usted es mayor de edad");
        }else{
            System.out.println("Usted es menor de edad");
        }
    }
}
