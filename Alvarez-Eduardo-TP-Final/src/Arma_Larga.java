public class Arma_Larga extends Arma implements IComparable<Arma_Larga>{
    private final String justifiUso;
    private final int nivelArma;
    private final boolean tieneSello;

    public Arma_Larga(int alcance, double calibre, String marca, int cantidadMuniciones, String estado, String justifiUso, int nivelArma, boolean tieneSello) {
        super(alcance, calibre, marca, cantidadMuniciones, estado);
        this.justifiUso = justifiUso;
        this.nivelArma = nivelArma;
        this.tieneSello = tieneSello;
    }


    public String getJustifiUso() {
        return justifiUso;
    }

    public int getNivelArma() {
        return nivelArma;
    }

    public boolean isTieneSello() {
        return tieneSello;
    }

    @Override
    public boolean enCondicion() {
        return getEstado().equals("EN USO") && getCalibre() >= 9;
    }

    @Override
    public String toString() {
        return super.toString() + ", Justificación de uso: " + justifiUso + ", Nivel del arma: " + nivelArma + ", Sello RENAR: " + tieneSello;
    }

    @Override
    public int compareTo(Arma_Larga o) {
        return Integer.compare(this.nivelArma, o.nivelArma);
    }

}
