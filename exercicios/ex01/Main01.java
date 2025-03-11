package exercicios.ex01;

public class Main01 {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        Galo galo = new Galo();
        Pato pato = new Pato();

        System.out.println("cachorro\nsom: " + cachorro.emitirSom() + "\ncome: " + cachorro.comer());
        System.out.println("gato\nsom: " + gato.emitirSom() + "\ncome: " + gato.comer());
        System.out.println("galo\nsom " + galo.emitirSom() + "\ncome: " + galo.comer());
        System.out.println("pato\nsom: " + pato.emitirSom() + "\ncome: " + pato.comer());
    }
}
