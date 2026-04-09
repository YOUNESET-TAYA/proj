package Heritqge;
public class TestParking {
    public static void main(String[] args) {
        Vehicule[] v = new Vehicule[4];
        v[0] = new Voiture("123A", "Toyota", 4);
        v[1] = new Voiture("124B", "Honda", 4);
        v[2] = new Moto("11C22", "Yamaha", true);
        v[3] = new Camion("C001", "Mercedes", 10);
        System.out.println("=== Tous les véhicules ===\n");
        for (Vehicule vehicule : v) {
            vehicule.stationner();
            vehicule.afficher();
            System.out.println(); }
  
        for (Vehicule vehicule : v) {
            if (vehicule instanceof Voiture) {
                vehicule.afficher();
                System.out.println();}}

        Vehicule x = new Voiture("125C", "Ford", 4);
        if (x instanceof Voiture) {
            Voiture v1 = (Voiture) x;
            System.out.println("\n Downcasting réussi !");
            v1.afficher();}}}