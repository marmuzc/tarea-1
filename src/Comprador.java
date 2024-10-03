import Excepciones.*;
import Monedas.*;
import Productos.*;

class Comprador {
    private String saborProducto;
    private int vuelto;

    public Comprador(Moneda m, productosEnum cualProducto, Expendedor exp) throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException{
        Productos producto = exp.comprarProducto(m, cualProducto);
        vuelto = 0;
        if (producto != null) {
            saborProducto = cualProducto.getNombre();
            m = exp.getVuelto();
            while (m != null) {
                vuelto = vuelto + m.getValor(); //el vuelto es igual al vuelto mas el valor de la moneda
                m = exp.getVuelto(); //m es igual al vuelto
            }
        } else {
            if (m == null) { //si no hay monedas en el deposito de vuelto
                vuelto = 0;//vuelto es 0
                saborProducto = null;
            } else {
                m = exp.getVuelto(); //en el caso de que el producto sea null, m es igual al vuelto
                while (m != null) { //mientras hayan monedas en el deposito
                    vuelto = vuelto + m.getValor();
                    m = exp.getVuelto();
                }
            }
        }
    }

    public int cuantoVuelto() {
        return vuelto;
    }

    public String getSaborProducto() {
        return saborProducto;
    }
}
