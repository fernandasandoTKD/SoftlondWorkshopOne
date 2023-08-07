import java.util.Scanner;

public class Ejercicio2 {

    private int num1;
     public  void par(){
         Scanner scanner= new Scanner(System.in);

         System.out.print("Ingrese un número: ");
         num1 = scanner.nextInt();

         if(num1 % 2 == 0 ){
             System.out.println("Este número es par");
         }else {
             System.out.println("Es número es impar");
         }
     }
}
