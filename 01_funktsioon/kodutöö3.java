import java.util.Scanner;
public class kodutöö3 {
    public static void main(String args[]) {
        System.out.print("Kas oled pikem kui Taavet? ");
        Scanner input = new Scanner(System.in);
        int pikkus = input.nextInt();
        if (pikkus < 184) {
            System.out.print("oled lühem :( ");
        } else {
            System.out.print("oled pikem :) ");
        }
    }
}