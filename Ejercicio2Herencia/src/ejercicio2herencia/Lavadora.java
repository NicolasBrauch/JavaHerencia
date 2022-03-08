package ejercicio2herencia;

import java.util.Locale;
import java.util.Scanner;

public class Lavadora extends Electrodomestico {

    //Atributos
    public double carga;

     //Constructor vacío
    public Lavadora() {
    }
    //Constructor con atributos heredados + atributos propios de la lavadora
    public Lavadora(double precio, String color, char consumo, double peso, double carga) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    //Métodos get y set de la lavadora
    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }
    
    //Métodos 
    public void crearLavadora() {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        crearElectrodomestico();
        System.out.println("Carga de la lavadora(Kg): ");
        this.carga = leer.nextDouble();

    }
    
   
    public void precioFinal() {
        super.precioFinal();
        if (this.carga > 30) {
            this.precio += 500;
        }

    }

    @Override
    public String toString() {
        return "Lavadora";
    }

}
