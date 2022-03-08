
package ejercicio2herencia;

import java.util.Locale;
import java.util.Scanner;

public class Televisor extends Electrodomestico {
   //Atributos
    public double resolucion;
    public boolean sintonizadorTdt;

    //Constructor vacío
    public Televisor() {
  
    }
    //Constructor con atributos heredados + atributos propios de televisor
    public Televisor(double resolucion, boolean sintonizadorTdt, double precio, String color, char consumo, double peso) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.sintonizadorTdt = sintonizadorTdt;
    }
    
    //Métodos get y set de televisor

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTdt() {
        return sintonizadorTdt;
    }

    public void setSintonizadorTdt(boolean sintonizadorTdt) {
        this.sintonizadorTdt = sintonizadorTdt;
    }
    
    //Métodos
    public void crearTelevisor(){
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        crearElectrodomestico();
        System.out.println("Ingrese la resolucion (pulgadas): ");
        resolucion=leer.nextDouble();
        System.out.println("tiene TDT? S/N:");
        String aux=leer.next();
        if (aux.equalsIgnoreCase("S")){
            sintonizadorTdt=true;
        }else{
            sintonizadorTdt=false;
        }
        
    }
  
    public void precioFinal(){
        super.precioFinal();
        if(resolucion>40){
            precio+=(0.3*precio);
        }
        if (sintonizadorTdt){
            precio+=500;
        }
       
    }

    @Override
    public String toString() {
        return "Televisor";
    }
    
    
    
}
