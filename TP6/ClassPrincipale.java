package patie1;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class ClassPrincipale {
	public static void main(String[] args) {
		ArrayList<Etudiant> liste=new ArrayList<>();
		liste.add(new Etudiant(1,"khadija",17));
		liste.add( new Etudiant(3,"assiya",12));
		liste.add( new Etudiant(4,"ayoub",10));
		liste.add(new Etudiant(8,"ali",11));
		liste.add(new Etudiant(9,"moja",33));
		for(Etudiant i:liste) {
			System.out.print(i);}
		
		String nomRecherche = "khadija";
		for (Etudiant e : liste) {
		    if (e.getNom().equalsIgnoreCase(nomRecherche)) {
		    	System.out.print("le nom est trouver"+e);}}
		
		int idSupprimer=4;
		liste.removeIf(e -> e.getId() == idSupprimer);
		System.out.print("suprimer id"+idSupprimer);
		for(Etudiant e:liste) {
			System.out.print(e);}
		
		liste.sort(Comparator.comparingDouble(Etudiant::getMoyenne));
		System.out.println("\nListe triée par moyenne :");
		for(Etudiant e:liste) {
			System.out.print(e);}
		
		Etudiant meilleure=Collections.max(liste,Comparator.comparingDouble(Etudiant::getMoyenne));
		System.out.print(meilleure);
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
			
			
			
			
			
			
			
		
		
		
		
		
	}
	
	
	

}
