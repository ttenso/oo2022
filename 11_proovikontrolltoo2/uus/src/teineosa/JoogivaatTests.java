package teineosa;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import java.io.ByteArrayOutputStream;

public class JoogivaatTests {


    @Test
    public void  t2idaPudelKuiSaab(){
        JoogiPudel joogiPudel = new JoogiPudel(0.5,"Plastik", 0.2, 0.1);
        Joogivaat joogivaat = new Joogivaat(12.0, 3);
        boolean isT2idetud = joogivaat.t2idaJoogipudel(joogiPudel);

        assertTrue(isT2idetud) ;


    }
    @Test
    public void t2idaPudelKuiEiSaa() {

            JoogiPudel joogiPudel = new JoogiPudel(0.5, "Plastik", 0.2, 0.1);
            Joogivaat joogivaat = new Joogivaat(12.0, 3);
            boolean isT2idetud = joogivaat.t2idaJoogipudel(joogiPudel);

            assertFalse(isT2idetud);
        }
    @Test
    public void  VillidaSaabNull(){
        JoogiPudel joogiPudel = new JoogiPudel(0.5,"Plastik", 0.2, 0.1);
        Joogivaat joogivaat = new Joogivaat(12.0, 0.3);
        int pudeliteArv = joogivaat.villiPudelid(joogiPudel);

        assertEquals(0, pudeliteArv) ;


    }
    @Test
    public void VillidaSaabRohkemKuiNull() {

        JoogiPudel joogiPudel = new JoogiPudel(0.5, "Plastik", 0.2, 0.1);
        Joogivaat joogivaat = new Joogivaat(12.0, 3);
        int pudeliteArv = joogivaat.villiPudelid(joogiPudel);

        assertEquals(6, pudeliteArv);
    }
}

