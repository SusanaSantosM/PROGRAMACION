package Com.susana.Partes;

public class Procesador {
    public float velocidade;

    public Procesador(float velocidade) {
        this.velocidade = velocidade;
    }

    public Procesador() {
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "Procesador{" + "velocidade=" + velocidade + '}';
    }
}
