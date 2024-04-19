package mx.utng.s11;

public class FiguraPlana {
    private final double BASE;
    private final double ALTURA;
    public FiguraPlana(double bASE, double aLTURA) {
        this.BASE = bASE;
        this.ALTURA = aLTURA;
    }

    public double getBASE() {
        return BASE;
    }

    public double getALTURA() {
        return ALTURA;
    }

    public void mostrarDimencion(){
        System.err.printf("La base de la figura es: %.1f y la altura es: %.1f.%n", BASE, ALTURA);
    }
}
