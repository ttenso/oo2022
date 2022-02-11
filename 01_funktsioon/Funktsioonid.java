public class Funktsioonid {
    public static  void main(String[] args) {
        // sout -- genereerin
        System.out.println(taksoSõit( 3.5));

        double sõiduMaksumus = taksoSõit( 0.5);
        System.out.println(taksoSõit( 3.5));
        
        System.out.println(temperatuuriHinnang(2));
        string hinnang = temperatuuriHinnang(-2)
    }


    public static double taksoSõit(double h) {
        return  3+0.8*h;

    }
    // void on fonkt selleks, et midagi teha
    public static void printfForTsükkel(int kordadeArv) {

        for (int i = 0; i < kordadeArv; i++) {
            System.out.println(i*10);
        }
    }
    public  static String temperatuuriHinnang(float temperatuut) {

    }
}