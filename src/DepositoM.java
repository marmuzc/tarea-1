import java.util.ArrayList;

import Monedas.*;

class DepositoM {
    private ArrayList<Moneda> monedas;

    public DepositoM() {
        this.monedas = new ArrayList<>();
    }

    public void addMoneda(Moneda m) {
        monedas.add(m);
    }

    public Moneda getMoneda() {
        if (monedas != null && !monedas.isEmpty()) {
            return monedas.remove(0);
        }
        return null;
    }
}
