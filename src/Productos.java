public enum Productos {
    COCA(1),
    SPRITE(2);

    private final int codigoProducto;

    Productos(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }
}
