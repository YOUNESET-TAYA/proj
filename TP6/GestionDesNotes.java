package patie1;
import java.util.HashMap;
public class GestionDesNotes {
	public static void main(String[] args) {
		HashMap<String, Double> notes = new HashMap<>();
		 notes.put("Ali", 14.5);
	        notes.put("ayoub", 16.0);
	        notes.put("aya", 12.0);
	        notes.put("assiya", 18.0);
		 for (String nom : notes.keySet()) {
			 System.out.print(nom + ":" + notes.get(nom));}
		 String recherche= "ali";
		 System.out.print("la note de :"+recherche + ":" + notes.get(recherche));
		 
		 notes.put("ali",17.7);
		 notes.remove("ayoub");
		 double somme=0;
		 for (double note : notes.values()) {
	         somme += note;}
	        double moyenne = somme / notes.size();
	        System.out.println("\nMoyenne générale : " + moyenne); }}
