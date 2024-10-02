import Excepciones.*;
import Monedas.*;
import Productos.*;

class Comprador {
 //   private String sonido;
    private int vuelto;

    public Comprador(Moneda m, productosEnum cualProducto, Expendedor exp) throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException{
        Productos producto = exp.comprarProducto(m, cualProducto);
        vuelto = 0;
        if (producto != null) { //si el producto no es null
            m = exp.getVuelto(); //la moneda recibida m del deposito vuelto
            while (m != null) { //mientras hayan monedas en el deposito
                vuelto = vuelto + m.getValor(); //el vuelto es igual al vuelto mas el valor de la moneda
                m = exp.getVuelto(); //m es igual al vuelto
            }
          //  sonido = bebida.beber();
        } else {
            if (m == null) { //si no hay monedas en el deposito de vuelto
                vuelto = 0;//vuelto es 0
              //  sonido = null;
            } else {
                m = exp.getVuelto(); //en el caso de que el producto sea null, m es igual al vuelto
                while (m != null) { //mientras hayan monedas en el deposito
                    vuelto = vuelto + m.getValor();
                    m = exp.getVuelto();
                }
             //   sonido = null;
            }
        }
    }

    public int cuantoVuelto() {
        return vuelto;
    }
    //Agregar sonidos
   // public String queBebiste() {
       // return sonido;
    //}
}
