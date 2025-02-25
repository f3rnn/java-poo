package exercicios.ex02;

public class MainEx02 {
    public static void main(String[] args) {
        Processador processador1 = new Processador("AMD", "Ryzen 7 5700X3D", "3,0gHZ");
        Memoria memoria1 = new Memoria("XPG", "DDR5", "16GB", "6000MHz");
        PlacaMae placaMae1 = new PlacaMae("AsRock", "B450M-HDV R4.0", "AMD AM4");
        DispositivoArmazenamento dispositivoArmazenamento1 = new DispositivoArmazenamento("Kingston", "SNV3S", "1TB", "NVme M.2");

        System.out.println(processador1.toString());
        System.out.println(memoria1.toString());
        System.out.println(placaMae1.toString());
        System.out.println(dispositivoArmazenamento1.toString());
    }
}
