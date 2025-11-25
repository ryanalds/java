package dado;

public class Dado {
    private int lados;
    public int resultado;

    public Dado (int lados) {
        this.lados = lados;
    }

    public int rolarDado () {
        this.resultado = (int) (Math.random() * lados + 1);
        return this.resultado;
    }
}
