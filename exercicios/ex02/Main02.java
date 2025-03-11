package exercicios.ex02;

public class Main02 {
    public static void main(String[] args) {
        Operacao soma = new Soma();
        Operacao subtracao = new Subtracao();
        Operacao multiplicacao = new Multiplicacao();
        Operacao divisao = new Divisao();

        System.out.println("soma: " + soma.calcular(10, 5));
        System.out.println("subtração: " + subtracao.calcular(10, 5));
        System.out.println("multiplicação: " + multiplicacao.calcular(10, 5));
        System.out.println("divisão: " + divisao.calcular(10, 5));
    }
}
