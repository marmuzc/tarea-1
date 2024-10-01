import java.util.ArrayList;

class Deposito {
    private ArrayList<Productos> productos;

    public Deposito() {
        this.productos = new ArrayList<>();
    }

    public void addProducto(Productos producto) {
        productos.add(producto);
    }

    public Productos getProducto() {
        if (productos != null && !productos.isEmpty()) {
            return productos.remove(0);
        }
        return null;
    }
}
