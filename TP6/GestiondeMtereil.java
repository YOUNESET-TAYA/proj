package patie1;
import java.util.HashSet;
import java.util.TreeSet;

public class GestiondeMtereil {
	public static void main(String[] args) {
		HashSet<String> materiel=new HashSet<>();
		materiel.add("math");
		materiel.add("physique");
		materiel.add("arab");
		materiel.add("Informatique");
		materiel.add("Anglais");
		
		System.out.print("nombre de matareil est "+materiel.size());
		 for(String m:materiel) {
			 System.out.print(m);}
		 
		 TreeSet<String>materielTreer=new TreeSet<>();
		 materielTreer.addAll(materiel);
		 
		 for(String m:materielTreer) {
			 System.out.print(m);}
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		
		
		
	}

}
