class Expendedor {
    private int precio;
    private DepositoM monVu;
    private Deposito coca;
    private Deposito sprite;
    private Deposito snickers;
    private Deposito super8;
    private int pagoUsuario;
    private Productos producto;

    public Expendedor(int numProductos, int precioProductos) {
        this.precio = precioProductos;
        this.coca = new Deposito();
        this.sprite = new Deposito();
        this.snickers = new Deposito();
        this.super8 = new Deposito();
        this.monVu = new DepositoM();

        for (int i = 0; i < numProductos; i++) {
            coca.addProducto(new CocaCola(100 + i));
            sprite.addProducto(new Sprite(200 + i));
            snickers.addProducto(new Snickers(300 + i));
            super8.addProducto(new Super8(400 + i));
        }
    }

    public Productos comprarProducto(Moneda m, productosEnum cual) {
        pagoUsuario = m.getValor(); //el pago del usuario sera la moneda recibica

        Productos productoComprado = null; //comenzaos sin producto comprado

        switch (cual) {
            case COCA:
                productoComprado = coca.getProducto();
                break;
            case SPRITE:
                productoComprado = sprite.getProducto();
                break;
            case SNICKERS:
                productoComprado = snickers.getProducto();
                break;
            case SUPER8:
                productoComprado = super8.getProducto();
                break;
            default:
                return null; // producto no encontrado
        }

        if (m == null){
            return null; //aqui excepcion quitar el retorno de vuelto
        }

        if (pagoUsuario < this.precio) {
            devolverVuelto(pagoUsuario); // Entregamos el vuelto
            return null; // No se puede comprar
        }

        // Si se ha comprado una bebida
        if (productoComprado != null) {
            pagoUsuario -= this.precio; // Resta el precio de la bebida
            devolverVuelto(pagoUsuario); // Entrega el vuelto
            this.producto = productoComprado; // Almacena el producto comprado
            return productoComprado; // Retorna la bebida comprada
        } else { //si no hay producto/no se elige producto
            devolverVuelto(pagoUsuario); // Entregamos el vuelto si la bebida no está disponible //excepcion no hay producto
            return null; // No se puede comprar
        }
    }

    private void devolverVuelto(int valorMoneda) { //devolver el vuelto en monedas de 100
        while (valorMoneda != 0) {
            monVu.addMoneda(new Moneda100());
            valorMoneda -= 100;
        }
    }

    public Moneda getVuelto() {
        return monVu.getMoneda();
    }

/*    public Productos verificarCompra(Moneda cantidad, productosEnum cual) {
        if (cantidad != null) {
            this.pagoUsuario = cantidad.getValor();
        } else {
            this.pagoUsuario = 0;
            this.producto = null; // Resetear el producto
        }
        return producto; // Retorna el producto almacenado
    }
    public Productos devolverProducto() {
        return producto; // Retorna el último producto comprado
    }*/
}
