import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class ToitTest {

    @Test
    public void KontrollibRasvaArvutuse() {
        Toiduaine sardell = new Toiduaine("Rakvere sardellid", 20.0, 16.0, 18.0);
        Toit toit = new Toit(300.0, sardell);
        double arvutus = toit.rasv();
        assertEquals(48, arvutus, 0.1);    }
}
