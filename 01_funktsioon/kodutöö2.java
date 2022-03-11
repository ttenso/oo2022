import java.util.Scanner;
import java.util.Random;
public class kodutöö2 {
    public static void main(String args[])
        {
<<<<<<< HEAD
            System.out.print("Mitu täringut veeretame: ");
            Scanner input = new Scanner(System.in);
            int Täringutearv = input.nextInt();
            Random ranNum = new Random();
            System.out.print("Sinu täringud ");
            int kogusumma = 0;
            int randomNumber = 0;
            for (int i = 0; i < Täringutearv; i++) {

                randomNumber = ranNum.nextInt(6) + 1;
                kogusumma = kogusumma + randomNumber;
                System.out.print(randomNumber);
                System.out.print(" ");
            }

            System.out.println("");
            System.out.println("Kogu summa: " + kogusumma);
            input.close();
=======
            extracted();
>>>>>>> @{u}
        }

    private static void extracted() {
        System.out.print("Mitu täringut veeretame: ");
        Scanner input = new Scanner(System.in);
        int Täringutearv = input.nextInt();
        Random ranNum = new Random();
        System.out.print("Sinu täringud ");
        int total = 0;
        int randomNumber = 0;
        for (int i = 0; i < Täringutearv; i++) {

            randomNumber = ranNum.nextInt(6) + 1;
            total = total + randomNumber;
            System.out.print(randomNumber);
            System.out.print(" ");
        }

        System.out.println("");
        System.out.println("Kogu summa: " + total);
    }
}

