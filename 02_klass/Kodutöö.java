public class Kodutöö {

    public static void main(String[] args) {
    Sportlane one = new Sportlane("Mart","Saabas",34,"M",87,160);
    Sportlane two = new Sportlane("Sandra","Kask",25,"N",60,70);
        System.out.println(one);
        System.out.println(two);
        one.keharaskus();
        two.keharaskus();
    }
}
