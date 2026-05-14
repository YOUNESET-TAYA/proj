package Lesexceptions;

public class ErreursDePaiement {
	 public static double effectuerPaiement(double montant, double solde) {
	       if (montant <= 0) {
	            throw new IllegalArgumentException("Le montant doit être supérieur à 0");}
	        if (montant > solde) {
	            throw new ArithmeticException("Solde insuffisant");}
	        return solde - montant; }

	    public static void main(String[] args) {
	        double solde = 1000;
	        try {
	            double nouveauSolde = effectuerPaiement(1200, solde);
	            System.out.println("Paiement effectué");
	            System.out.println("Nouveau solde : " + nouveauSolde);} 
	        catch (IllegalArgumentException e) {
	            System.out.println("Erreur : montant invalide");}
	        catch (ArithmeticException e) {
	            System.out.println("Erreur : solde insuffisant");} 
	        finally {
                System.out.println("Fin de la transaction");}}}

