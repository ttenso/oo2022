public class Kodutöö {

        public static void main(String[] args) {

            Inimene Inimene = new Inimene(21, "Taavet", "Tenso");

            String inimene = Inimene.InimeneOutput();


            pidu pidu = new pidu(inimene,"makstud", true);

    }
}
