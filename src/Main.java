import Excepciones.*;
import Monedas.*;
import Productos.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("======   Caso 0  ======");
        List<Moneda> monedas = new ArrayList<>();
        monedas.add(new Moneda1000());
        monedas.add(new Moneda100());
        monedas.add(new Moneda500());

        System.out.println("Monedas antes de ordenar:");
        for (Moneda m : monedas) {
            System.out.println(m); // Imprime valor y número de serie
        }

        // Ordenar la lista de monedas por su valor
        Collections.sort(monedas);

        System.out.println("Monedas después de ordenar:");
        for (Moneda m : monedas) {
            System.out.println(m); // Imprime valor y número de serie
        }


        //Revisar si estan manejados todos los casos
        System.out.println("======   Caso 1  ======");
        Expendedor exp1 = new Expendedor(5, 300);
        Moneda m1 = new Moneda1000();

        int codigoProducto = 1;
        productosEnum productoSeleccionado = productosEnum.getProductoPorCodigo(codigoProducto);

        try {
            Comprador c = new Comprador(m1, productoSeleccionado, exp1);
            Productos productoComprado = exp1.comprarProducto(m1, productoSeleccionado);
            int vuelto = c.cuantoVuelto();
            System.out.println("Vuelto: " + vuelto);
            System.out.println("El sabor del producto es: " + c.getSaborProducto());
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
            Comprador c = new Comprador(null, productoSeleccionado, exp2);
            Productos productoComprado = exp2.comprarProducto(m2, productoSeleccionado);
            int vuelto = c.cuantoVuelto();
            System.out.println("Vuelto: " + vuelto);
            System.out.println("El sabor del producto es: " + c.getSaborProducto());
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
            Comprador c = new Comprador(m3, productoSeleccionado, exp3);
            Productos productoComprado = exp3.comprarProducto(m3, productoSeleccionado);
            int vuelto = c.cuantoVuelto();
            System.out.println("Vuelto: " + vuelto);
            System.out.println("El sabor del producto es: " + c.getSaborProducto());
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
            Comprador c = new Comprador(m4, productoSeleccionado, exp4);
            Productos productoComprado = exp4.comprarProducto(m4, productoSeleccionado);
            int vuelto = c.cuantoVuelto();
            System.out.println("Vuelto: " + vuelto);
            System.out.println("El sabor del producto es: " + c.getSaborProducto());
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


