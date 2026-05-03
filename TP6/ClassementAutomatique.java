package patie1;
import java.util.TreeMap;
public class ClassementAutomatique {
	public static void main(String[] args) {
		TreeMap<Integer, String> etudiants = new TreeMap<>();
		 etudiants.put(120, "Ali");
		 etudiants.put(3, "moja");
		 etudiants.put(4, "fatma");
		 etudiants.put(5,"ayou");
		 for (Integer num : etudiants.keySet()) {
			 System.out.print(num + ":" + etudiants.get(num));}
		 Integer premier = etudiants.firstKey();
		 Integer dernier = etudiants.lastKey();
		 System.out.println("Premier étudiant : " + premier + " : " + etudiants.get(premier));
		 System.out.println("Dernier étudiant : " + dernier + " : " + etudiants.get(dernier));
		 
	        for (Integer num : etudiants.tailMap(101).keySet()) {
	            System.out.println(num + " : " + etudiants.get(num));}}}
