package Test;

import org.example.ProductoPrimeraNecesidad;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProductoPrimeraNecesidadTest {

    @Test
    void testPrecioPrimeraNecesidad() {
        ProductoPrimeraNecesidad p = new ProductoPrimeraNecesidad("Pan", 1800, false, 0.10);
        assertEquals(1800 * 0.90, p.precio());
    }
}
