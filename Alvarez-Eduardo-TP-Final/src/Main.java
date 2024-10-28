public class Main {
    public static void main(String[] args) {
        // Creo los policias
        Policia[] policias = new Policia[5];
        policias[0] = new Policia("Eduardo", "Alvarez", 2310);
        policias[1] = new Policia("Gabriel", "Bernardini", 2402);
        policias[2] = new Policia("Vicente", "Alvarez", 2201);
        policias[3] = new Policia("Gisela", "Fernandez", 0510);
        policias[4] = new Policia("Lucas", "Gino", 2610);

        // Creo las armas cortas
        Arma_Corta[] armasCorta = new Arma_Corta[5];
        armasCorta[0] = new Arma_Corta(10, 15, "Glock 26", 15, "EN USO", true);
        armasCorta[1] = new Arma_Corta(15, 15, "Beretta 92FS", 15, "EN USO", false);
        armasCorta[2] = new Arma_Corta(12, 15, "Kimber Warrior", 15, "EN USO", true);
        armasCorta[3] = new Arma_Corta(8, 15, "Desert Eagle", 15, "EN USO", false);
        armasCorta[4] = new Arma_Corta(20, 15, "Glock 18", 15, "EN MANTENIMIENTO", true);

        // Le asigno un policia
        armasCorta[0].setPoliciaAsignado(policias[0]);
        armasCorta[1].setPoliciaAsignado(policias[1]);
        armasCorta[2].setPoliciaAsignado(policias[2]);
        armasCorta[3].setPoliciaAsignado(policias[3]);
        armasCorta[4].setPoliciaAsignado(policias[4]);

        //Creo armas largas
        Arma_Larga[] armasLarga = new Arma_Larga[5];
        armasLarga[0] = new Arma_Larga(20, 15.0, "Benelli M4", 15, "EN USO", "Caza", 3, true);
        armasLarga[1] = new Arma_Larga(25, 15.0, "Remington 700", 15, "EN USO", "Patrullaje", 4, true);
        armasLarga[2] = new Arma_Larga(30, 15.0, "MP5", 15, "EN MANTENIMIENTO", "Caza", 2, true);
        armasLarga[3] = new Arma_Larga(22, 15.0, "M16", 15, "EN USO", "Seguridad", 5, true);
        armasLarga[4] = new Arma_Larga(18, 15.0, "AK-47", 15, "EN USO", "Patrullaje", 4, true);

        //Le asigo un policita
        armasLarga[0].setPoliciaAsignado(policias[0]);
        armasLarga[1].setPoliciaAsignado(policias[1]);
        armasLarga[2].setPoliciaAsignado(policias[2]);
        armasLarga[3].setPoliciaAsignado(policias[3]);
        armasLarga[4].setPoliciaAsignado(policias[4]);


        // Mostrar información de los policías y las armas
        for (int i = 0; i < policias.length; i++) {
            mostrarInformacionPoliciaArmas(policias[i], armasCorta[i], armasLarga[i]);
            System.out.println("El arma corta " + (i+1) + " está en condiciones? " + armasCorta[i].enCondicion());
            System.out.println("El arma larga " + (i+1) + " está en condiciones? " + armasLarga[i].enCondicion());
            compararArmas(armasLarga[i], armasLarga[(i+1)%5]); // Hago una comparación circular
            System.out.println();
        }
    }

    public static void mostrarInformacionPoliciaArmas(Policia policia, Arma_Corta armaCorta, Arma_Larga armaLarga) {
        System.out.println("Policía: Nombre: " + policia.getNombre() + " " + policia.getApellido() + ", Legajo: " + policia.getLegajo());
        System.out.println("Arma Corta: Marca: " + armaCorta.getMarca() + ", Calibre: " + armaCorta.getCalibre() + ", Estado: " + armaCorta.getEstado() + ", Automática: " + armaCorta.isAutomatica());
        System.out.println("Arma Larga: Marca: " + armaLarga.getMarca() + ", Calibre: " + armaLarga.getCalibre() + ", Estado: " + armaLarga.getEstado() + ", Justificación de uso: " + armaLarga.getJustifiUso() + ", Nivel del arma: " + armaLarga.getNivelArma() + ", Sello RENAR: " + armaLarga.isTieneSello());
    }

    public static void compararArmas(Arma_Larga arma1, Arma_Larga arma2) {
        if (arma1.compareTo(arma2) > 0) {
            System.out.println("El arma larga " + arma1.getMarca() + " tiene un nivel mayor que el arma larga " + arma2.getMarca() + ".");
        } else if (arma1.compareTo(arma2) < 0) {
            System.out.println("El arma larga " + arma1.getMarca() + " tiene un nivel menor que el arma larga " + arma2.getMarca() + ".");
        } else {
            System.out.println("El arma larga " + arma1.getMarca() + " tiene el mismo nivel que el arma larga " + arma2.getMarca() + ".");
        }
    }
}
