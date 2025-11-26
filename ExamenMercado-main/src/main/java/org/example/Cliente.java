package main.java.org.example;

public class Cliente {

    private String nombre;
    private String apellido;
    private int edad;

    public Cliente(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + " (" + edad + " años)";
    }
}
