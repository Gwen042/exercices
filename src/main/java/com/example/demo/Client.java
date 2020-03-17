package com.example.demo;

import java.util.List;
//Attention à vos import
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Client {
	
	private final static Logger LOG = LogManager.getLogger();
	
	private String nom;
	private String prenom;
	private int age;
	private List<Adresse> adresses;
	

	public Client() {
	}
	
	public Client(String nom, String prenom, int age, List<Adresse> adresses) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.adresses = adresses;
		Client.LOG.info("Dans mon Init du client {}", this);
	}

	public void init() {
		Client.LOG.info("Dans mon Init du client {}", this);
	}
	
	public void destroy() {
		Client.LOG.info("Dans mon Init du client {}", this);
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}



	public List<Adresse> getAdresses() {
		return adresses;
	}

	public void setAdresses(List<Adresse> adresses) {
		this.adresses = adresses;
	}

	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", adresses=" + adresses + "]";
	}


}
