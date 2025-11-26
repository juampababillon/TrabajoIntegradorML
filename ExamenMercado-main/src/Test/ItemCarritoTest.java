package Test;

import org.example.ItemCarrito;
import org.example.Producto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ItemCarritoTest {

    @Test
    void testPrecioItemCarrito() {
        Producto p = new Producto("Leche", 1000, false);
        ItemCarrito item = new ItemCarrito(p, 3);
        assertEquals(3000, item.precio());
    }
}
