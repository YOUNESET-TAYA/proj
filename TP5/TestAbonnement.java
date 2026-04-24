package tp5;
public class TestAbonnement {

	public static void main(String[] args) {
		Abonnement[] abonner=new Abonnement[3];
		abonner[0]=new AbonnementVideo("Netflix",200,4,false,false);
		abonner[1]=new AbonnementMusique("youtube musique pro",350,7,9
				,false);
		abonner[2]=new AbonnementJeux("play pro",520,6,3,8);
		System.out.println("les informations , "
				+ "cout mensuel, le score :");
		for(int i=0;i<3;i++) {
			abonner[i].afficherInfos();
			System.out.println("Cout mensuel : "
			+abonner[i].calculerCoutMensuel());
			System.out.println("Score : "
			+abonner[i].calculerSatisfaction());}
		Reducible[] reduire=new Reducible[2];
		reduire[0]=(Reducible) abonner[0];
		reduire[1]=(Reducible) abonner[1];
		System.out.println("pourcentage de reduction  d'abonnements");
		for(int i=0;i<2;i++) {
			 System.out.println(reduire[i].getClass().getSimpleName()+
					 "Réduction 20% : "
		+reduire[i].AppliquerReduction(20));
			 System.out.println(reduire[i].getClass().getSimpleName()+
					 "Réduction 20% : "
		+reduire[i].AppliquerReduction(50));}
	}}
		
