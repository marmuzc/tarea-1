package Monedas;

public abstract class Moneda implements Comparable<Moneda> {
    public Moneda() {
    }

    public abstract int getValor();

    public int getNumeroDeSerie() {
        return this.hashCode(); // hashCode simula la dirección de memoria
    }

    @Override
    public String toString() {
        return "Moneda{valor =" + getValor() + ", numeroSerie =" + getNumeroDeSerie() + "}";
    }

    @Override
    public int compareTo(Moneda otraMoneda) {
        return Integer.compare(this.getValor(), otraMoneda.getValor());
    }
}
