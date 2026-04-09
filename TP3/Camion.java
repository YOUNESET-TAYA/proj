package Heritqge;

public class Camion extends Vehicule {
	private double chargeMax;
	public Camion(String matricule,String marque,double chargeMax) {
		super(matricule,marque);
		this.chargeMax=chargeMax;}
	@Override
	
	public void stationner() {
		System.out.print("le camion se gare dans une zone pour vehicule lourds");}
	@Override
	public void afficher() {
		super.afficher();
		System.out.print("chargeMax"+chargeMax);}}
