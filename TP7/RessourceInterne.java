package Lesexceptions;

public class RessourceInterne {

	public static double lireTransaction(double[] tab, int index) {

	    return tab[index];}
	public static void main(String[] args) {

	    double[] transactions = {100.5, 250.75, 80.0};

	    try {
	        double valeur = lireTransaction(transactions, 5);
	        System.out.println("Transaction : " + valeur);}
	    catch (ArrayIndexOutOfBoundsException e) {
	        System.out.println("Erreur : indice invalide");
	    } catch (NullPointerException e) {
	        System.out.println("Erreur : tableau non initialisé");
	    }
	}
}
