package patie1;

import java.util.LinkedList;

public class Principale {
	public void main(String[] args ) {
		LinkedList<Client> file=new LinkedList<>();
		file.add(new Client(1,"khadija"));
		file.add(new Client(2,"assiya"));
		file.add(new Client(3,"moja"));
		file.add(new Client(4,"ayoub"));
		
		for(Client c:file) {
			System.out.print(c);}
		
		Client Servir=file.poll();
		System.out.print("Client serviir"+Servir);
		 
		file.add(new Client(5,"ali"));
		
		Client tete=file.get(0);
		System.out.print("Client tete"+tete);
		
		
		
		
		
	        

		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		
	}

}
