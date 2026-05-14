package Lesexceptions;

public class GestionLocale {
	 public static double lireMontant(String valeur) {

	        try {
	            double montant = Double.parseDouble(valeur);
	            if (montant < 0) {
	                throw new IllegalArgumentException("Montant négatif interdit");}
	            return montant; } 
	        catch (NumberFormatException e) {
	            System.out.println("Erreur : valeur non numérique");}
	        catch (IllegalArgumentException e) {
	            System.out.println("Erreur : montant négatif");}
	        return 0;}
	 
	    public static void main(String[] args) {
	        double montant = lireMontant("abc");
	        System.out.println("Montant : " + montant); }}

