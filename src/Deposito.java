import java.util.ArrayList;

class Deposito {
    private ArrayList<Bebida> bebidas;

    public Deposito() {
        this.bebidas = new ArrayList<>();
    }

    public void addBebida(Bebida b) {
        bebidas.add(b);
    }

    public Bebida getBebida() {
        if (bebidas != null && !bebidas.isEmpty()) {
            return bebidas.remove(0);
        }
        return null;
    }
}
