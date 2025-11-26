package Test;

import org.example.Producto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProductoTest {

    @Test
    void testPrecioProductoNormal() {
        Producto p = new Producto("Leche", 1200, false);
        assertEquals(1200, p.precio());
    }

    @Test
    void testPrecioProductoImportado() {
        Producto p = new Producto("Chocolate", 1000, true);
        assertEquals(1000 * 1.10, p.precio());
    }
}
