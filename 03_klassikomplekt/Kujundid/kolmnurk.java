package Kujundid;

public class kolmnurk implements Kujund{
    double kylg1;
    double kylg2;
    double kylg3;

    @Override
    public double arvutaYmbermoot() {
        return kylg1 + kylg2 + kylg3;
    }

    public kolmnurk(double kylg1) {
        this.kylg1 = kylg1;
    }

    @Override
    public double arvutaPindala() {
        return Math.sqrt((arvutaYmbermoot()/2-kylg1) *
                (arvutaYmbermoot()/2-kylg2) *
                (arvutaYmbermoot()/2-kylg3));
    }
}
