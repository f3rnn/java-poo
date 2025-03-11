package exercicios.ex01;

public class Cachorro implements Animal {
    @Override
    public String emitirSom() {
        return "Au au";
    }

    @Override
    public String comer() {
        return "Ração";
    }
}
