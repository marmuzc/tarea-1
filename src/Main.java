public class Main {
    public static void main(String[] args) {
        Expendedor exp = new Expendedor(7, 300);
        Moneda m;
        Comprador c;

        m = new Moneda500();
        c = new Comprador(m, Productos.COCA, exp);
        System.out.println(c.queBebiste() + ", $" + c.cuantoVuelto());

    }
}


