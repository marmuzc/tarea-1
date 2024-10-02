package Productos;
public abstract class Productos{
    private int serie;

    public Productos(int numSerie) {
        this.serie = numSerie;
    }

    public int getSerie() {
        return serie;
    }
    public abstract String getNombre();

    public String toString() {
        return "Nombre: " + this.getNombre() + " Serie: " + this.getSerie() + ".";
    }
}
