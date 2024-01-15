package com.houda.beans;

public class User {
	private String nom;
	private String prenom;
	private boolean actif;
	
	public User() {
		this("nom", "prenom", false);
	}
	
	public User(String nom, String prenom, boolean actif) {
		super();
		this.setNom(nom);
		this.setPrenom(prenom);
		this.setActif(actif);
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		if(nom == null || nom.trim().equals("")) {
			throw new RuntimeException("prenom cannot be null");
		}
		this.nom = nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		if(prenom == null || prenom.trim().equals("")) {
			throw new RuntimeException("prenom cannot be null");
		}
		this.prenom = prenom;
	}
	
	public boolean isActif() {
		return actif;
	}
	public void setActif(boolean actif) {
		this.actif = actif;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "L'utilisateur" + this.prenom + this.nom + "est "+ (this.actif ? "actif" : "inactif" );
	}
	
}
