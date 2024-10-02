import Excepciones.*;

public class Main {
    public static void main(String[] args) {
        //Revisar si estan manejados todos los casos
        System.out.println("======   Caso 1  ======");
        Expendedor exp1 = new Expendedor(5, 300);
        Moneda m1 = new Moneda1000();

        try {
            Comprador c = new Comprador(m1, productosEnum.COCA, exp1);
            Productos productoComprado = exp1.comprarProducto(m1, productosEnum.COCA);
            int vuelto = c.cuantoVuelto();
            System.out.println("Vuelto: " + vuelto);
            System.out.println(productoComprado);

        } catch (PagoIncorrectoException e) {
            // Manejo de la excepción de pago incorrecto
            System.out.println(e.getMessage());
        } catch (NoHayProductoException e) {
            // Manejo de la excepción si el producto no está disponible
           System.out.println(e.getMessage());
           System.out.println("Vuelto: " + m1.getValor());
        } catch (PagoInsuficienteException e) {
            // Manejo de la excepción si el pago es insuficiente
            System.out.println(e.getMessage());
            System.out.println("Vuelto: " + m1.getValor());
        }
        
        System.out.println("======   Caso 2  ======");
        Expendedor exp2 = new Expendedor(5, 300);
        Moneda m2 = new Moneda1000();
        try {
            Comprador c = new Comprador(null, productosEnum.COCA, exp2);
            Productos productoComprado = exp2.comprarProducto(m2, productosEnum.COCA);
            int vuelto = c.cuantoVuelto();
            System.out.println("Vuelto: " + vuelto);
            System.out.println(productoComprado);

        } catch (PagoIncorrectoException e) {
            // Manejo de la excepción de pago incorrecto
            System.out.println(e.getMessage());
        } catch (NoHayProductoException e) {
            // Manejo de la excepción si el producto no está disponible
           System.out.println(e.getMessage());
           System.out.println("Vuelto: " + m2.getValor());
        } catch (PagoInsuficienteException e) {
            // Manejo de la excepción si el pago es insuficiente
            System.out.println(e.getMessage());
            System.out.println("Vuelto: " + m2.getValor());
        }
        
        System.out.println("======   Caso 3  ======");
        Expendedor exp3 = new Expendedor(0, 300);
        Moneda m3 = new Moneda1000();
        try {
            Comprador c = new Comprador(m3, productosEnum.COCA, exp3);
            Productos productoComprado = exp3.comprarProducto(m3, productosEnum.COCA);
            int vuelto = c.cuantoVuelto();
            System.out.println("Vuelto: " + vuelto);
            System.out.println(productoComprado);

        } catch (PagoIncorrectoException e) {
            // Manejo de la excepción de pago incorrecto
            System.out.println(e.getMessage());
        } catch (NoHayProductoException e) {
            // Manejo de la excepción si el producto no está disponible
           System.out.println(e.getMessage());
           System.out.println("Vuelto: " + m3.getValor());
        } catch (PagoInsuficienteException e) {
            // Manejo de la excepción si el pago es insuficiente
            System.out.println(e.getMessage());
            System.out.println("Vuelto: " + m3.getValor());
        }
        
        System.out.println("======   Caso 4  ======");
        Expendedor exp4 = new Expendedor(5, 300);
        Moneda m4 = new Moneda100();
        try {
            Comprador c = new Comprador(m4, productosEnum.COCA, exp4);
            Productos productoComprado = exp4.comprarProducto(m4, productosEnum.COCA);
            int vuelto = c.cuantoVuelto();
            System.out.println("Vuelto: " + vuelto);
            System.out.println(productoComprado);

        } catch (PagoIncorrectoException e) {
            // Manejo de la excepción de pago incorrecto
            System.out.println(e.getMessage());
        } catch (NoHayProductoException e) {
            // Manejo de la excepción si el producto no está disponible
           System.out.println(e.getMessage());
           System.out.println("Vuelto: " + m4.getValor());
        } catch (PagoInsuficienteException e) {
            // Manejo de la excepción si el pago es insuficiente
            System.out.println(e.getMessage());
            System.out.println("Vuelto: " + m4.getValor());
        }        
    }
}


