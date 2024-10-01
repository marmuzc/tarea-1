class Expendedor {

    private int precio;
    private DepositoM monVu;
    private Deposito coca;
    private Deposito sprite;

    public Expendedor(int numBebidas, int precioBebida) {
        this.precio = precioBebida;
        this.coca = new Deposito();
        this.sprite = new Deposito();
        this.monVu = new DepositoM();

        for (int i = 0; i < numBebidas; i++) {
            coca.addBebida(new CocaCola(100 + i));
            sprite.addBebida(new Sprite(200 + i));
        }
    }


    public Bebida comprarBebida(Moneda m, Productos cual) {
        if (m == null) {
            return null;
        }

        int valorMoneda = m.getValor();
        Bebida bebidaComprada = null;

        if (valorMoneda < this.precio) { //si el valor de la moneda es menor al precio de la bebida
            while (valorMoneda != 0) { //entregamos el vuelto
                monVu.addMoneda(new Moneda100());
                valorMoneda = valorMoneda - 100;
            }
            return null;
        } else {
            if (cual == Productos.COCA) { //si se elige coca
                bebidaComprada = coca.getBebida(); //creamos la bebida b coca
                if (bebidaComprada != null) { //si la bebida no es null
                    if (valorMoneda == this.precio) { //si el valor de la moneda es igual al precio
                        return bebidaComprada; //retornamos la bebida
                    } else { //en otro caso
                        valorMoneda = valorMoneda - this.precio; //el valor de la moneda es igual al valor de la moneda menos el precio
                        while (valorMoneda != 0) {
                            monVu.addMoneda(new Moneda100());
                            valorMoneda = valorMoneda - 100;
                        }
                        return bebidaComprada;  //retornamos la bebida
                    }
                } else {
                    while (valorMoneda != 0) {
                        monVu.addMoneda(new Moneda100());
                        valorMoneda = valorMoneda - 100;
                    }
                    return null;
                }
            } else if (cual == Productos.SPRITE) {
                bebidaComprada = sprite.getBebida();
                if (bebidaComprada != null) {
                    if (valorMoneda == this.precio) {
                        return bebidaComprada;
                    } else {
                        valorMoneda = valorMoneda - this.precio;
                        while (valorMoneda != 0) {
                            monVu.addMoneda(new Moneda100());
                            valorMoneda = valorMoneda - 100;
                        }
                        return bebidaComprada;
                    }
                } else {
                    while (valorMoneda != 0) {
                        monVu.addMoneda(new Moneda100());
                        valorMoneda = valorMoneda - 100;
                    }
                    return null;
                }
            } else if (cual != Productos.COCA && cual != Productos.SPRITE) {
                while (valorMoneda != 0) {
                    monVu.addMoneda(new Moneda100());
                    valorMoneda = valorMoneda - 100;
                }
                return null;
            }
            return null;
        }
    }
    public Moneda getVuelto() {
        return monVu.getMoneda();
    }

}
