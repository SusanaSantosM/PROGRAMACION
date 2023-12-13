package Com.susana.Partes;

public class Monitor {
    private float pulgadas;

    public Monitor() {
    }

    public Monitor(float pulgadas) {
        this.pulgadas = pulgadas;
    }

    public float getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(float pulgadas) {
        this.pulgadas = pulgadas;
    }

    @Override
    public String toString() {
        return "Monitor{" + "pulgadas=" + pulgadas + '}';
    }

}
