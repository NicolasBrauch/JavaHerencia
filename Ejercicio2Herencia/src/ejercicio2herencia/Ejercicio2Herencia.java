package ejercicio2herencia;

import java.util.ArrayList;

public class Ejercicio2Herencia {

    public static void main(String[] args) {
        
        // Crear Lavadora 
        Lavadora lavadora = new Lavadora();
        System.out.println("Lavadora: ");
        lavadora.crearLavadora();
        lavadora.precioFinal();
        System.out.println("El precio final es: "+lavadora.precio);
        

        System.out.println("");
        
        // Crear Televisor 
        Televisor televisor = new Televisor();
        System.out.println("Televisor: ");
        televisor.crearTelevisor();
        televisor.precioFinal();
        System.out.println("El precio final es: "+televisor.precio);
        

    }

}
