
package ejercicio3herencia;

import java.util.ArrayList;

public class Ejercicio3Herencia {

    public static void main(String[] args) {
      
        //Ejercicio 3
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList();
        double totalElectrodomesticos=0;
        // Crear Lavadora 1
        Lavadora lavadora1 = new Lavadora();
        System.out.println("Lavadora ");
        lavadora1.crearElectrodomestico();
        electrodomesticos.add(lavadora1);
        //Crear Televisor 1
        Televisor televisor1 = new Televisor();
        System.out.println("Televisor ");
        televisor1.crearElectrodomestico();
        electrodomesticos.add(televisor1);
        // Crear Lavadora 2
        Lavadora lavadora2 = new Lavadora();
        System.out.println("Lavadora ");
        lavadora2.crearElectrodomestico();
        electrodomesticos.add(lavadora2);
        // Crear Televisor 2
        Televisor televisor2 = new Televisor();
        System.out.println("Televisor ");
        televisor2.crearElectrodomestico();
        electrodomesticos.add(televisor2);

        System.out.println("");
        for (Electrodomestico electrodomestico : electrodomesticos) {
            electrodomestico.precioFinal();
            System.out.println(electrodomestico + "---- Precio: $ " + electrodomestico.precio);
            totalElectrodomesticos+=electrodomestico.precio;
        }
       System.out.println("La suma total de electrodomesticos es: $ "+totalElectrodomesticos); 
    }
    
}
