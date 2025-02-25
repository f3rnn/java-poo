package exercicios.ex01;

public class MainEx01 {
    public static void main(String[] args) {
        Processador processador1 = new Processador("AMD", "Ryzen 7 5700X3D", "3,0gHZ");
        Memoria memoria1 = new Memoria("XPG", "DDR5", "16GB");

        System.out.println(processador1.toString());
        System.out.println(memoria1.toString());
    }
}
