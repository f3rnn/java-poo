package exercicios.ex04;

public class Main04 {
    public static void main(String[] args) {
        Fisica04 fisica = new Fisica04("Fulano", "1234-5678", "123.456.789-00", "12.345.678-9", "01/01/2000");
        Juridica04 juridica = new Juridica04("Empresa", "9876-5432", "12.345.678/0001-90", "123.456.789.000");

        System.out.println(fisica);
        System.out.println(juridica);
    }
}
