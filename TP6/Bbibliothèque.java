package patie1;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
public class Bbibliothèque {

	public static void main(String[] args) {
		 ArrayList<Livre1> livre = new ArrayList<>();
		 livre.add(new Livre1("1", "modakirat", "Ali", 2020));
		 livre.add(new Livre1("2","ta7t ard","dostwifski",1987));
		 livre.add(new Livre1("3","alfo9ra2","nitchah",1974));
		 
		 HashSet<String>categorie=new HashSet<>();
		 categorie.add("psycologie");
		 categorie.add("romantique");
		 categorie.add("psy");
		 categorie.add("psycologie");
		 
		 HashMap<String,Livre1> emprunte=new HashMap<>();
		 emprunte.put("khadija",livre.get(0));
		 emprunte.put("ayoub",livre.get(1));
		 emprunte.put("ali",livre.get(3));
		 
		 String rechercher="alfo9ra2";
		 for(Livre1 l:livre) {
			 if(l.getTitre().equals(rechercher)) {
				 System.out.print(l);}}
		 
		 livre.removeIf(l->l.getISBN().equals("3"));
		 
		 for (Livre1 l : livre) {
	            System.out.println(l);}
		 
		 System.out.println("Nombre de livres: " + livre.size());
	        System.out.println("Catégories: " + categorie);
	        System.out.println("Emprunts:");

	        for (String etudiant : emprunte.keySet()) {
	            System.out.println(etudiant + " a emprunté: " + emprunte.get(etudiant)); }}}
