public class Consumo {
    private float km;
    private float litros;
    private float vMed;
    private  float pGas;

    //contructor por defecto
    public Consumo() {
    }

    public Consumo(float km, float litros, float vMed, float pGas) {
        this.km = km;
        this.litros = litros;
        this.vMed = vMed;
        this.pGas = pGas;
    }

    public float getTiempo(){
        return km/vMed;
    }

    public float consumoMedio(){
        return (litros/km)*100;
    }

    public float consumoEuros(){
        return (pGas/km)*100;
    }

    public float getKm() {
        return km;
    }

    public void setKm(float km) {
        this.km = km;
    }

    public float getLitros() {
        return litros;
    }

    public void setLitros(float litros) {
        this.litros = litros;
    }

    public float getvMed() {
        return vMed;
    }

    public void setvMed(float vMed) {
        this.vMed = vMed;
    }

    public float getpGas() {
        return pGas;
    }

    public void setpGas(float pGas) {
        this.pGas = pGas;
    }

}
