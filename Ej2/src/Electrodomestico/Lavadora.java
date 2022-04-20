package Electrodomestico;

import java.util.Scanner;

public class Lavadora extends Electrodomestico {

    private Integer carga;

    public Lavadora() {
    }

    public Lavadora(Integer carga, Integer precio, Integer peso, String color, char consumoEnergetico) {
        super(precio, peso, color, consumoEnergetico);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    public void crearLavadora(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        crearElectrodoméstico();
        carga = leer.nextInt();
    }
}
