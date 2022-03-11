import java.io.*;
import java.util.Scanner;


public class Kt
{

    public static void main(String[] args)  throws IOException
    {
        Scanner tekst = new Scanner (new FileReader("Tekst.txt"));
        String word = null;
        int count = 0;
        int count2 = 0;
        while(tekst.hasNextLine())
        {
            word = tekst.nextLine();
            for (int i = 0; i < word.length(); i++)
            {
                if (word.charAt(i) == 'a')
                {
                    count++;
                }
                if (word.charAt(i) == 'A')
                {
                    count2++;
                }
            }

        }


        System.out.print("a esineb " + count + " korda "+ " ja A esineb " + count2 + " korda");
    }
}