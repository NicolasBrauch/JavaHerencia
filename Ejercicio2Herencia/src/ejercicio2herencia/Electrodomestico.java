package ejercicio2herencia;

import java.util.Locale;
import java.util.Scanner;

public class Electrodomestico {

    protected double precio;
    protected String color;
    protected char consumo; //Rango A a F
    protected double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumo, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void comprobarConsumoEnergetico(char letra) {
        letra=Character.toLowerCase(letra);
        if (Character.toString(letra).matches("[a-f?]")) {
            consumo = letra;
        } else {
            consumo = 'F';
        }
    }

    public void comprobarColor(String color) {
        if (color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris")) {
            this.color = color;
        } else {
            this.color = "blanco";
        }
    }

    public Electrodomestico crearElectrodomestico() {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese precio: ");
        precio = 1000 + leer.nextDouble();
        System.out.println("Ingrese color(blanco-negro-rojo-azul-gris): ");
        comprobarColor(leer.next());
        System.out.println("Ingrese consumo(A-F): ");
        comprobarConsumoEnergetico(leer.next().charAt(0));
        System.out.println("Ingrese peso(Kg): ");
        peso = leer.nextDouble();
        return new Electrodomestico(precio, color, consumo, peso);
    }

    public void precioFinal() {
        consumo = Character.toUpperCase(consumo);

        switch (consumo) {
            case 'A':
                this.precio+=1000;
                break;
            case 'B':
                this.precio+=800;
                break;
            case 'C':
                this.precio+=600;
                break;
            case 'D':
                this.precio+=500;
                break;
            case 'E':
                this.precio+=300;
            case 'F':
                this.precio+=100;
                break;
        }
        if (peso >= 1 && peso <= 19) {
            this.precio+=100;
        } else if (peso >= 20 && peso <= 49) {
            this.precio+=500;
        } else if (peso >= 50 && peso <= 79) {
            this.precio+=800;
        }else if (peso>80){
            this.precio+=1000;
        }
      
    }
}
