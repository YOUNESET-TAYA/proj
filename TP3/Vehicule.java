package Heritqge;
class Vehicule {
    protected String matricule;
    protected String marque;

    public Vehicule(String matricule, String marque) {
        this.matricule = matricule;
        this.marque = marque;
    }

    public void stationner() {
        System.out.println("Le véhicule se gare dans une place standard");
    }

    public void afficher() {
        System.out.println("Matricule : " + matricule + ", Marque : " + marque);
    }
}