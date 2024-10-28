public class Arma_Corta extends Arma {
    private boolean esAutomatica;

    public Arma_Corta(int cantidadMuniciones, double alcance, String marca, int calibre, String estado, boolean esAutomatica) {
        super(cantidadMuniciones, alcance, marca, calibre, estado);
        this.esAutomatica = esAutomatica;
    }

    public boolean isAutomatica() {
        return esAutomatica;
    }

    @Override
    public boolean enCondicion() {
        return getEstado().equals("EN USO") && getCalibre() >= 9;
    }

    @Override
    public String toString() {
        return super.toString() + ", Automática: " + esAutomatica;
    }

    public boolean efectivaMts() {
        return getAlcance() > 200;
    }

}
