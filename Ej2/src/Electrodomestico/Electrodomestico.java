package Electrodomestico;

import java.util.Scanner;

public class Electrodomestico {

    private Integer precio, peso;
    private String color;
    private char consumoEnergetico = Character.forDigit('A', 'F');

    public Electrodomestico() {
    }

    public Electrodomestico(Integer precio, Integer peso, String color, char consumoEnergetico) {
        this.precio = precio;
        this.peso = peso;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
    }

    public Integer getPrecio() {
        return precio;
    }

    public Integer getPeso() {
        return peso;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public char comprobarConsumo(char letra) {
        if (letra != consumoEnergetico) {
            letra = 'F';
        }
        return letra;
    }

    public String comprobarColor(String color) {
        switch (color) {
            case "rojo":
            case "azul":
            case "negro":
            case "gris":
                break;
            default:
                color = "blanco";
        }
        return color;
    }

    public void crearElectrodoméstico() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Dicte el precio");
        precio = leer.nextInt();
        if (precio < 1000) {
            precio = 1000;
        }

        System.out.println("Dicte el peso");
        peso = leer.nextInt();

        System.out.println("Dicte el color");
        String leerColor = leer.next();
        color = comprobarColor(leerColor);

        System.out.println("Dicte el consumo eléctrico");
        char leerLetra = leer.next().charAt(0);
        consumoEnergetico = comprobarConsumo(leerLetra);
    }

    public void precioFinal() {
        switch (consumoEnergetico) {
            case 'A':
                precio = precio + 1000;
                break;
            case 'B':
                precio = precio + 800;
                break;
            case 'C':
                precio = precio + 600;
                break;
            case 'D':
                precio = precio + 500;
                break;
            case 'E':
                precio = precio + 300;
                break;
            case 'F':
                precio = precio + 100;

        }

        if (1 <= peso || peso <= 19) {
            precio = precio + 100;
        } else if (20 <= peso || peso <= 49) {
            precio = precio + 500;
        } else if (50 <= peso || peso <= 79) {
            precio = precio + 800;
        } else if (80 <= peso) {
            precio = precio + 1000;
        }
    }
}
