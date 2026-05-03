  package patie1;

public class Client {
	private int Numero;
	private String nom;
public Client(int Numer,String nom) {
	this.Numero=Numero;
	this.nom=nom;}
public int getNumero() {
	return Numero;}
public String getNom() {
	return nom;}
public String toString() {
    return "Numéro: " + Numero + ", Nom: " + nom;}}
