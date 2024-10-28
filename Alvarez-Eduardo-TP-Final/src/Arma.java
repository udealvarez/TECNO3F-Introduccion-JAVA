public abstract class Arma {
    private int cantidadMuniciones;
    private double alcance;
    private String marca;
    private int calibre;
    private String estado;
    private Policia policiaAsignado;

    public Arma(int cantidadMuniciones, double alcance, String marca, int calibre, String estado) {
        this.cantidadMuniciones = cantidadMuniciones;
        this.alcance = alcance;
        this.marca = marca;
        this.calibre = calibre;
        this.estado = estado;
    }

    public int getCantidadMuniciones() {
        return cantidadMuniciones;
    }

    public double getAlcance() {
        return alcance;
    }

    public String getMarca() {
        return marca;
    }

    public int getCalibre() {
        return calibre;
    }

    public String getEstado() {
        return estado;
    }

    public Policia getPoliciaAsignado() {
        return policiaAsignado;
    }

    public void setPoliciaAsignado(Policia policiaAsignado) {
        this.policiaAsignado = policiaAsignado;
    }

    public abstract boolean enCondicion();

    @Override
    public String toString() {
        return "Marca: " + marca + ", Calibre: " + calibre + ", Estado: " + estado;
    }

}
