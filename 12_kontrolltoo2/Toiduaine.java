public class Toiduaine {

    String nimetus;
    Double valguProtsent;
    Double rasvaProtsent;
    Double susivesProtsent;

    public Toiduaine(String nimetus, Double valguProtsent, Double rasvaProtsent, Double susivesProtsent){
        this.nimetus = nimetus;
        if (valguProtsent + rasvaProtsent + susivesProtsent >= 100.0){
            System.out.println("Protsent kokku ei saa ületada 100%!");
        } else {
            this.valguProtsent = valguProtsent;
            this.rasvaProtsent = rasvaProtsent;
            this.susivesProtsent = susivesProtsent;
        }
    }

}

