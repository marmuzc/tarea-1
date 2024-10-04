import Excepciones.*;
import Monedas.*;

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
        System.out.println("==========   Caso 1  ==========");
        Expendedor exp1 = new Expendedor(5);
        Moneda m1 = new Moneda1000();

        try {
            Comprador c = new Comprador(m1, productosEnum.COCA, exp1);
            System.out.println("El sabor del producto es: " + c.getSaborProducto());
            System.out.println("Vuelto: " + c.cuantoVuelto());


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
        
        System.out.println("==========   Caso 2  ==========");
        Expendedor exp2 = new Expendedor(5);
        Moneda m2 = new Moneda1000();
        try {
            Comprador c = new Comprador(null, productosEnum.COCA, exp2);
            System.out.println("Vuelto: " + c.cuantoVuelto());
            System.out.println("El sabor del producto es: " + c.getSaborProducto());

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
        
        System.out.println("==========   Caso 3  ==========");
        Expendedor exp3 = new Expendedor(0);
        Moneda m3 = new Moneda1000();
        try {
            Comprador c = new Comprador(m3, productosEnum.COCA, exp3);
            System.out.println("Vuelto: " + c.cuantoVuelto());
            System.out.println("El sabor del producto es: " + c.getSaborProducto());

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
        
        System.out.println("==========   Caso 4  ==========");
        Expendedor exp4 = new Expendedor(5);
        Moneda m4 = new Moneda100();
        try {
            Comprador c = new Comprador(m4, productosEnum.COCA, exp4);
            System.out.println("Vuelto: " + c.cuantoVuelto());
            System.out.println("El sabor del producto es: " + c.getSaborProducto());

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


