public class Persoa {
    private String nome;
    private String apelidos;
    private int nif;

    public Persoa(String nome, String apelidos, int nif) {
        this.nome = nome;
        this.apelidos = apelidos;
        this.nif = nif;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelidos() {
        return apelidos;
    }

    public void setApelidos(String apelidos) {
        this.apelidos = apelidos;
    }

    public int getNif() {
        return nif;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

    @Override
    public String toString() {
        return "Persoa{" + "nome=" + nome + ", apelidos=" + apelidos + ", nif=" + nif + '}';
    }
}
