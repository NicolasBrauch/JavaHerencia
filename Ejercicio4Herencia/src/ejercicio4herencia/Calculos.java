package ejercicio4herencia;

import java.util.Locale;
import java.util.Scanner;

public class Calculos implements CalculosFormas {

    double radio;
    double lado1;
    double lado2;

    public Calculos() {
    }

    public Calculos(double radio, double lado1, double lado2) {
        this.radio = radio;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public void cargarDatos() {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese el radio del circulo(m): ");
        radio = leer.nextDouble();
        System.out.println("Ingrese el lado 1 del rectangulo(m): ");
        lado1 = leer.nextDouble();
        System.out.println("Ingrese el lado 2 del rectangulo(m): ");
        lado2 = leer.nextDouble();
    }

    
    public void areaCirculo() {
        System.out.println("El area del circulo es: " + PI * radio * radio+" m^2");
    }

    
    public void perimetroCirculo() {
        System.out.println("El perimetro del circulo es: " + PI * 2 * radio+" m");
    }

    
    public void areaRectangulo() {
        System.out.println("El area del rectangulo es: " + lado1 * lado2+" m^2");
    }


    public void perimetroRectangulo() {
        System.out.println("El perimetro del rectangulo es: " + (2 * lado1 + 2 * lado2)+" m");
    }
}
