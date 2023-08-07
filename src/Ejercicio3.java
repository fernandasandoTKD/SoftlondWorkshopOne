import java.util.Scanner;

public class Ejercicio3 {
    private int radio;
    public void circle(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese el radio del círculo");
        radio= scanner.nextInt();
    }

     public int area(){
        return (180*(radio*radio));
     }
     public int perimetro(){
        return (2*180)*radio;
     }
}
