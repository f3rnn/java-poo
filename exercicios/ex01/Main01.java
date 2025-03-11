package exercicios.ex01;

public class Main01 {
    public static void main(String[] args) {
        Animal[] animais = new Animal[3];
        animais[0] = new Pato();
        animais[1] = new Gato();
        animais[2] = new Galo();

        for (Animal animal : animais) {
            System.out.println(animal.emitirSom());
            System.out.println(animal.comer());
        }
    }
}
