package pqrtie1;
public class comptebancaire {

    // Attributs privés
    private int numero;
    private String titulaire;
    private double solde;
    private double decouvertAutorise;

    // Attributs statiques
    private static int nbComptes = 0;
    private static double tauxInteretAnnuel = 0.03;

    // Constructeur par défaut
    public comptebancaire() {
        this.numero = ++nbComptes;
        this.titulaire = "Inconnu";
        this.solde = 0;
        this.decouvertAutorise = 0;
    }

    // Constructeur paramétré
    public comptebancaire(String titulaire, double solde, double decouvertAutorise) {
        this.numero = ++nbComptes;
        this.titulaire = titulaire;
        this.solde = solde;
        this.decouvertAutorise = decouvertAutorise;
    }

    // Getters & Setters avec validation
    public String getTitulaire() {
        return titulaire;
    }