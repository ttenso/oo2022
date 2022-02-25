import java.util.Scanner;
public class Kodutöö {
    public static void main(String args[])
    {

        Scanner s= new Scanner(System.in);

        System.out.println("sisesta kolmnurga alus:");
        double b= s.nextDouble();

        System.out.println("sisesta kolmnurga kõrgus:");
        double h= s.nextDouble();

        double pindala=(b*h)/2;
        System.out.println("kolmnurga pindala on: " + pindala);
    }
}
