public class Sportlane {
<<<<<<< HEAD
    String eesnimi;
    String perekonnanimi;
    int vanus;
    String sugu;
    double Kaal;
    double raskus;

    public Sportlane(String eesnimi, String perekonnanimi, int vanus, String sugu, double Kaal, double raskus) {
        this.eesnimi = eesnimi;
        this.perekonnanimi = perekonnanimi;
        this.vanus = vanus;
        this.sugu = sugu;
        this.Kaal = Kaal;
        this.raskus = raskus;
    }

    public void keharaskus() {
        System.out.println(eesnimi + perekonnanimi + " Surub rinnalt " + Math.round(raskus/Kaal) + " korda oma kehakaalu");
    }
=======
        String eesnimi;
        String perekonnanimi;
        int vanus;
        String sugu;
        double Kaal;
        double raskus;

        public Sportlane(String eesnimi, String perekonnanimi, int vanus, String sugu, double Kaal, double raskus) {
            this.eesnimi = eesnimi;
            this.perekonnanimi = perekonnanimi;
            this.vanus = vanus;
            this.sugu = sugu;
            this.Kaal = Kaal;
            this.raskus = raskus;
        }

        public void keharaskus() {
            System.out.println(eesnimi + perekonnanimi + " Surub rinnalt " + Math.round(raskus/Kaal) + " korda oma kehakaalu");
        }
>>>>>>> @{u}

    @Override
    public String toString() {
        return "Sportlane{" +
                "eesnimi='" + eesnimi + '\'' +
                ", perekonnanimi='" + perekonnanimi + '\'' +
                ", vanus=" + vanus +
<<<<<<< HEAD
                ", sugu=" + sugu +
=======
                ", sugu='" + sugu + '\'' +
>>>>>>> @{u}
                ", Kaal=" + Kaal +
                ", raskus=" + raskus +
                '}';
    }
}
<<<<<<< HEAD
=======


>>>>>>> @{u}
