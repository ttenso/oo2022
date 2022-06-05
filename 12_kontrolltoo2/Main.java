public class Main {

    public static void main(String[] args) {

        Toiduaine Kartul = new Toiduaine("Põltsamaa kartul", 1.0, 1.0,13.0 );
        Toiduaine Hapukoor = new Toiduaine("farmi", 25.0, 9.0, 1.3);
        Toiduaine sardell = new Toiduaine("Rakvere sardellid", 20.0, 16.0, 18.0);
        Toit kartul = new Toit(100, Kartul);
        Toit hapukoor = new Toit(60.0, Hapukoor);
        Toit vorst = new Toit(300.0, sardell);

        vorst.rasv();
        kartul.rasv();
        hapukoor.rasv();
    }
}
