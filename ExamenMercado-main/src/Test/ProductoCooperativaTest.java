package Test;

import org.example.ProductoCooperativa;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProductoCooperativaTest {

    @Test
    void testPrecioProductoCooperativa() {
        ProductoCooperativa p = new ProductoCooperativa("Yerba", 2000, false);
        assertEquals(2000 * 0.90, p.precio());
    }
}
