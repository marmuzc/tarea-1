public enum productosEnum {
    COCA(1, 1000),
    SPRITE(2, 1200),
    SUPER8(3, 400),
    SNICKERS(4, 500);

    private int codigoProducto;
    private int precio;

    productosEnum(int codigo, int precio) {
        this.codigoProducto = codigo;
        this.precio = precio;
    }

    public int getCodigoProducto() {
        return this.codigoProducto;
    }

    public int getPrecio() {
        return this.precio;
    }

    public String getNombre() {
        switch (codigoProducto) {
            case 1:
                return "COCACOLA";
            case 2:
                return "SPRITE";
            case 3:
                return "SUPER8";
            case 4:
                return "SNICKERS";
            default:
                return "Null";
        }
    }

    public static productosEnum getProductoPorCodigo(int codigo) {
        for (productosEnum producto : productosEnum.values()) {
            if (producto.getCodigoProducto() == codigo) {
                return producto;
            }
        }
        return null;
    }
}
