public class Human {
    String nimi;
    int vanus;
    double pikkus;
    boolean mees;
    char symbol;
<<<<<<< HEAD

=======
>>>>>>> @{u}
    public Human(String nimi, int vanus, double pikkus, boolean mees) {
        this.nimi = nimi;
        this.vanus = vanus;
        this.mees = mees;
        this.pikkus = pikkus;
        this.symbol = 'R';
    }

    public void sayHello() {
<<<<<<< HEAD
        System.out.println(nimi + "hello");
        
=======
        System.out.println(nimi + vanus);

>>>>>>> @{u}
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
