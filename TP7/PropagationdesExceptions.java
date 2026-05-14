package Lesexceptions;

public class PropagationdesExceptions {
	public static double lireMontant(String valeur)
	        throws NumberFormatException, IllegalArgumentException {
	    double montant = Double.parseDouble(valeur);
	    if (montant < 0) {
	        throw new IllegalArgumentException("Montant négatif");}
	    return montant;}
public static void main(String[] args) {
    try {
    	double montant = lireMontant("-50");

        System.out.println("Montant : " + montant); } 
    catch (NumberFormatException e) {
        System.out.println("Erreur : valeur non numérique");}
    catch (IllegalArgumentException e) {
        System.out.println("Erreur : montant négatif");}}}
