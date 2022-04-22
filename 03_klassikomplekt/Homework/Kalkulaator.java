package Homework;
import java.util.Scanner;

public class Kalkulaator implements liides {
    public void kalkuleeri() {
        Scanner input = new Scanner(System.in);
        double value1 = 0.00, value2 = 0.00;
        System.out.print("Sisesta summa eurodes: ");
        value1 = input.nextDouble();
        value2 = value1 * 1.36077;
        System.out.println(value2 + " USD");
    }
}
