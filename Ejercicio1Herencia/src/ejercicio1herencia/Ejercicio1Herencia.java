package ejercicio1herencia;

public class Ejercicio1Herencia {

    public static void main(String[] args) {
       Animal perro=new Perro("Stich","Carne",15,"Doberman");
       perro.alimentarse();
       Perro perro1 =new Perro("Teddy","Croquetas",10,"Chihuahua");
       perro1.alimentarse();
       Animal gato = new Gato("Pelusa","Galletas",15,"Siames");
       gato.alimentarse();
       Animal caballo = new Caballo("Spark","Pasto",25,"Fino");
       caballo.alimentarse();
    }
    
}
