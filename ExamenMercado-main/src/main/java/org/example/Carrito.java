package main.java.org.example;

import java.util.ArrayList;
import java.util.List;

public class Carrito {

    private List<ItemCarrito> items = new ArrayList<>();

    public Carrito() {
    }

    public void agregarItem(ItemCarrito item) {
        items.add(item);
    }

    public double precio() {
        double total = 0;
        for (ItemCarrito item : items) {
            total += item.precio();
        }
        return total;
    }

    public List<ItemCarrito> getItems() {
        return items;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Carrito:\n");
        for (ItemCarrito item : items) {
            sb.append(" - ").append(item.toString()).append("\n");
        }
        sb.append("Total: $").append(precio());
        return sb.toString();
    }
}
