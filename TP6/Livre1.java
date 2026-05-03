package patie1;

public class Livre1 {
	private String ISBN;
	private String titre;
	private String Auteur;
	private int Année;
	
	public Livre1( String ISBN, String titre, String Auteur, int Année) {
		this.ISBN=ISBN;
		this.titre=titre;
		this.Auteur=Auteur;
		this.Année=Année;}
	public String getISBN(){
		return ISBN;}
	public String getTitre() {
		return titre;}
	public String getAuteur() {
		return Auteur;}
	public int getAnnée() {
		return Année;}
	
	public String toString (){
		return "ISBN: " + ISBN + ", Titre: " + titre + ", Auteur: " + Auteur + ", Année: " + Année;}}
