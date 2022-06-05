public class Toit {
    Double kogus;
    Toiduaine toiduaine;
    public Toit(double kogus, Toiduaine toiduaine){
        this.kogus = kogus;
        this.toiduaine = toiduaine;
    }
    public double rasv(){
        double rasvaKogus = this.kogus * (this.toiduaine.rasvaProtsent / 100);
        System.out.println("toiduaine sisaldab" +rasvaKogus + "g rasva");
        return rasvaKogus;
    }
}
