public class Human {
    String nimi;
    int vanus;
    double pikkus;
    boolean mees;
    char symbol;

    public Human(String nimi, int vanus, double pikkus, boolean mees) {
        this.nimi = nimi;
        this.vanus = vanus;
        this.mees = mees;
        this.pikkus = pikkus;
        this.symbol = 'R';
    }

    public void sayHello() {
        System.out.println(nimi + "hello");
        
    }
    // to .. võtan toString -- enter
    @Override
    public String toString() {
        return "Human{" +
                "nimi='" + nimi + '\'' +
                ", vanus=" + vanus +
                ", pikkus=" + pikkus +
                ", mees=" + mees +
                '}';
    }
}
