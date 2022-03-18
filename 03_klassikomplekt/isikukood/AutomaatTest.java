package isikukood;



import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class AutomaatTest {

    @Test
    public void test1() {
        isikukoodEE ee = new isikukoodEE("39802150281");
        assertEquals(false, ee.isMale());

    }

    @Test
    public void kontrollin_kas_on_synniaasta() {
        isikukoodLV lv = new isikukoodLV("120351-51237");
        assertEquals(1951, lv.getBirthYear());

    }

    @Test
    public void kontrollin_kas_kujundi_pindala_arvutatakse_korrektselt() {
        kolmnurk kolmnurk = new kolmnurk(5.0,6.0,7.0);
        assertEquals(18, kolmnurk.arvutaYmbermoot());
    }
}
