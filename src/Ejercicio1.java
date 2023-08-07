import java.sql.SQLOutput;
import java.util.Scanner;


public class Ejercicio1 {
private int num1;
private int num2;

    public void Calculator(){
        Scanner scanner= new Scanner(System.in);

        System.out.print("Ingrese un el primer número: ");
        num1 = scanner.nextInt();

        System.out.print("Ingrese un el segundo número: ");
        num2=scanner.nextInt();

    }
    public int suma(){
       return num1+ num2;
    }

    public int resta(){
        return num1-num2;
    }
    public int mulitplicaci(){
        return num1*num2;
    }

    public double division(){
        if (num1 == 0 || num2 == 2){
            System.out.println("No se puede dividir por cero");

        }
        double number1= num1;
        double number2= num2;
        return  number1/number2;
    }

}