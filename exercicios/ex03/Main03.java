package exercicios.ex03;

public class Main03 {
    public static void main(String[] args) {
        Motoboy motoboy1 = new Motoboy("João", "01/01/2000", Sexo.MASCULINO, Setor.OPERACOES, 1000.0, "123456789");
        Motoboy motoboy = new Motoboy("José", "01/01/2000", Sexo.MASCULINO, Setor.OPERACOES, 1000.0, "123456789");
        Diretor diretor = new Diretor("Maria", "01/01/1990", Sexo.FEMININO, Setor.RECURSOS_HUMANOS, 5000.0);

        System.out.println("Motoboy: "+ motoboy1);
        System.out.println("Diretor: " + diretor);

        diretor.admitir(motoboy1);
        diretor.demitir(motoboy);

    }
}
